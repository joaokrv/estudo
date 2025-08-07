const fs = require("fs");
const { isNull } = require("lodash");

const caminho = __dirname + "/arquivo.json";

// sincrono
const conteudo = fs.readFileSync(caminho, "utf-8");
console.log(conteudo);

// async
fs.readFile(caminho, "utf-8", (err, conteudo) => {
  if (err != isNull) {
    const config = JSON.parse(conteudo);
    console.log(`\n${config.db.host}:${config.db.port}`);
  }
});

const config = require("./arquivo.json");
console.log("\n" + config.db + "\n");

fs.readdir(__dirname, (err, conteudo) => {
  console.log("Conteudo: \n" + conteudo);
});
