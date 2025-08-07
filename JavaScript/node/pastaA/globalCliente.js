require("./global");

console.log(MeuApp.msg());

console.log(MeuApp.nome);
MeuApp.nome = "Mudei"; // Freeze nao deixa ele mutavel
console.log(MeuApp.nome);
