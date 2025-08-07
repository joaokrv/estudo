const modulo = require("../../module"); // caminho dinamico
// const modulo = require("C:\Users\joao.carvalho\Desktop\JavaScript\node\module.js"); caminho absoluto

console.log(modulo.boaNoite);
console.log(modulo.boaTarde());

// const http = require ('http');
// http.createServer((req, res) => {
//     res.write('Bom dia!');
//     res.end(' Obrigado')
// }).listen(8080)