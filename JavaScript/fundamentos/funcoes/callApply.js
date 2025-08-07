function getPreco(imposto = 0, moeda = 'R$') {
    return `${moeda} ${this.preco * (1 - this.desc) * (1 + imposto)}`
}

const produto = {
    nome: 'Notebook',
    preco: 2828.99,
    desc: 0.2,
    getPreco
}

global.preco = 20;
global.desc = 0.15;
console.log(getPreco());
console.log(produto.getPreco());

const carro = { preco: 19992, desc: 0.3};

console.log(getPreco.call(carro));
console.log(getPreco.apply(carro));

console.log(getPreco.call(carro, 0.17, '$'));
console.log(getPreco.apply(carro, [0.17, '$']));