const express = require("express");
const cors = require("cors");
const app = express();

app.use(cors());
app.use(express.json());

app.use(express.static(__dirname + "/public"));

// --- BANCO DE DADOS EM MEMÓRIA ---
const operadoras = [
  { nome: "Vivo", codigo: "15", categoria: "Celular", preco: 2.0 },
  { nome: "Claro", codigo: "21", categoria: "Celular", preco: 1.8 },
  { nome: "TIM", codigo: "41", categoria: "Celular", preco: 2.25 },
  { nome: "Oi", codigo: "14", categoria: "Celular", preco: 1.5 },
  { nome: "Vivo Fixo", codigo: "15", categoria: "Fixo", preco: 1.0 },
  { nome: "Claro Fixo (NET)", codigo: "21", categoria: "Fixo", preco: 1.2 },
  { nome: "Oi Fixo", codigo: "31", categoria: "Fixo", preco: 0.8 },
];

const gerarSerial = () => {
  let _length = 20;
  const chars =
    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
  let serial = "";
  for (let i = 0; i < _length; i++) {
    serial += chars.charAt(Math.floor(Math.random() * chars.length));
  }
  return serial;
};

const contatos = [
  {
    id: 1,
    nome: "Pedro",
    telefone: "(11) 98877-1234",
    cor: "plum",
    data: new Date(),
    operadora: operadoras[0],
    serial: gerarSerial(),
  },
  {
    id: 2,
    nome: "João",
    telefone: "(21) 99988-5678",
    cor: "red",
    data: new Date(),
    operadora: operadoras[1],
    serial: gerarSerial(),
  },
  {
    id: 3,
    nome: "Lucas",
    telefone: "(31) 98765-4321",
    cor: "blue",
    data: new Date(),
    operadora: operadoras[2],
    serial: gerarSerial(),
  },
  {
    id: 4,
    nome: "Moisés",
    telefone: "(61) 99123-8765",
    cor: "green",
    data: new Date(),
    operadora: operadoras[3],
    serial: gerarSerial(),
  },
];

// --- ENDPOINTS DA API ---

// Lista todos os contatos
app.get("/contatos", (req, res) => {
  try {
    if (!contatos || contatos.length === 0) {
      return res.status(204).send();
    }

    res.status(200).json(contatos);
  } catch (error) {
    console.error("Erro ao buscar contatos:", error);
    res.status(500).json({ erro: "Erro interno ao buscar contabtos" });
  }
});

let proximoId = contatos.length + 1; // contador simples
// Cria um novo contato
app.post("/contatos", (req, res) => {
  try {
    const { nome, telefone, operadora } = req.body;

    if (!nome || !telefone || !operadora) {
      return res
        .status(400)
        .json({ erro: "Nome, telefone e operadora são obrigatórios!" });
    }

    const novoContato = {
      id: proximoId++,
      ...req.body,
      data: new Date(),
    };

    contatos.push(novoContato);

    res.status(201).json(novoContato);
  } catch (error) {
    console.error("Erro ao criar contato:", error);
    res.status(500).json({ erro: "Erro interno ao criar contato" });
  }
});

// Lista todas as operadoras
app.get("/operadoras", (req, res) => {
  try {
    if (!operadoras || operadoras.length === 0) {
      return res.status(204).send();
    }
    res.status(200).json(operadoras);
  } catch (error) {
    console.error("Erro ao buscar operadoras:", error);
    res.status(500).json({ erro: "Erro interno ao buscar operadoras" });
  }
});

// Remove um contato pelo id
app.delete("/contatos/:id", (req, res) => {
  try {
    const id = parseInt(req.params.id);
    const index = contatos.findIndex((c) => c.id === id);

    if (index === -1) {
      return res.status(404).json({ erro: "Contato não encontrado" });
    }

    contatos.splice(index, 1);
    res.status(200).json({ mensagem: "Contato removido com sucesso!" });
  } catch (error) {
    console.error("Erro ao remover contato:", error);
    res.status(500).json({ erro: "Erro interno ao remover contato" });
  }
});

app.listen(process.env.PORT || 3412, () => {
  console.log("Servidor rodando na porta 3412");
});
