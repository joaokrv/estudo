const contadorA = require("./instanciaUnica"); // retorna objeto
const contadorB = require("./instanciaUnica");

const contadorC = require("./instanciaNova")(); // retorna uma funçao factory
const contadorD = require("./instanciaNova")();

contadorA.inc();
contadorA.inc();
console.log(contadorA.valor, contadorB.valor); // cache objeto ja criado

contadorC.inc();
contadorC.inc();
console.log(contadorD.valor, contadorC.valor);
