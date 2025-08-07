let valor;
console.log(valor);

valor = null;
console.log(valor);

//console.log(valor.toString()); // ERRO

const produto = {};
console.log(produto.preco);
console.log(produto);

produto.preco = 3.5;
console.log(produto);

produto.preco = undefined; // EVITAR ATRIBUIR UNDEFINED
console.log(!!produto.preco);
console.log(produto);

produto.preco = null; // sem preço
console.log(!!produto.preco);
console.log(produto);