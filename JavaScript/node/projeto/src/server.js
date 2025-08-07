const porta = 3003;

const express = require("express");
const app = express();
const db = require("./db");

// app.get("/produtos", (req, res, next) => {
//   console.log("Middleware 1");
//   next();
// });

// app.use("/produtos", (req, res, next) => { // USE -> todos os metodos (POST, GET, PUT...)
//   res.send({
//     nome: "Celular Samsung",
//     preco: 1475.0,
//     quantidade: 3,
//   }); // Convert para JSON
// });

app.get("/produtos", (req, res) => {
  res.send(db.getProdutos); // Convert para JSON
});

app.post("/produtos", (req, res, next) => {
  const produto = db.salvarProduto({
    nome: req.body.name,
    preco: req.body.preco,
    quantidade: req.body.quantidade,
  });

  res.send(produto); // JSON to WEB
});

app.get("/produtos/:id", (req, res, next) => {
  res.send(db.getProduto(req.params.id));
});

app.listen(porta, () => {
  console.log(`Servidor rodando na porta ${porta}`);
});
