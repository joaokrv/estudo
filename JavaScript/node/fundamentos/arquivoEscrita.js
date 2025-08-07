const fs = require("fs");

const produto = {
  nome: "Celular",
  preco: 1245.99,
  deconsto: 0.1,
};

fs.writeFile(
  __dirname + "/arquivoGerado.json",
  JSON.stringify(produto),
  (err) => {
    console.log(err || "Arquivo salvo!");
  }
);
