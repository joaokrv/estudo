console.log("Fora de função: Não acessa o global");
console.log("global: " + this === global);
console.log("module: " + this === module);
console.log("module.exports: " + this === module.exports);
console.log("exports: " + this === exports);

function logThis() {
  console.log("Dentro de função: Acessa o global");
  console.log("global: " + this === global);
  console.log("module.exports: " + this === module.exports);
  console.log("exports: " + this === exports);
}

const logThisArrow = () => {
  console.log("Dentro de ArrowFunction: Não acessa o global");
  console.log("global: " + this === global);
  console.log("module.exports: " + this === module.exports);
  console.log("exports: " + this === exports);
};

console.log(logThis());
console.log(logThisArrow());
