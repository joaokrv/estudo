const produtos = [
    {nome: "Borracha", preco: 3.5, fragil: false},
    {nome: "Caderno", preco: 13.9, fragil: false},
    {nome: "Kit de Lapis", preco: 43.52, fragil: false},
    {nome: "Taça", preco: 67.5, fragil: true},
    {nome: "Caneta", preco: 7.5, fragil: true},
    {nome: "Mochila", preco: 127.5, fragil: false}
]

const res = produtos.map(p => p.preco).reduce(function (acc, atual){
    return acc + atual;
}, 0 /*valor inicial do acumulador*/);


//  DESAFIO

const alunos = [
    {nome: 'Joao', nota: 10, bolsista: true},
    {nome: 'Pedro', nota: 9.5, bolsista: true},
    {nome: 'Guilherme', nota: 1.8, bolsista: false},
    {nome: 'Mario', nota: 6.7, bolsista: false},
    {nome: 'Jose', nota: 8.2, bolsista: false}
]

// DESAFIO 1: Todos são bolsistas?

const alunosBolsistas = (resultado, bolsista) => resultado && bolsista;
console.log(alunos.map(a => a.bolsista).reduce(alunosBolsistas));

// DESAFIO 2: Algum adulto é bolsista?

const alunoComBolsa = (resultado, bolsista) => resultado || bolsista;
console.log(alunos.map(a => a.bolsista).reduce(alunoComBolsa));

// implementação
Array.prototype.reduce2 = function(callback, initValue) {
    const initIndice = initValue ? 0 : 1;
    let acumulador = initValue || this[0];
    for(let i = initIndice; i < this.length; i++) {
        acumulador = callback(acumulador, this[i], i, this)
    }
    return acumulador;
}

const soma = (total, valor) => total + valor;
const nums = [1, 2, 4, 6];
console.log(nums.reduce2(soma, 13));