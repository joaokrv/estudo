const express = require("express");
const bodyParser = require("body-parser");

const app = express();

app.use(bodyParser.urlencoded({ extended: true }));

app.post("/usuarios", (req, res) => {
  console.log(req.body); // DEBUG
  res.send("<h1>Parabéns!</h1>");
});

app.post("/usuarios/:id", (req, res) => {
  console.log(req.params.id);
  console.log(req.body); // DEBUG
  res.send("<h1>Parabéns! Usuário Alterado</h1>");
});

app.listen(3003);
