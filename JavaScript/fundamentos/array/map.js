const arrayNums = [1, 2, 3, 4, 5, 6];
const arrayString = ["Joao", 'Pedro', "Lucas", "Jose", "Rafael", 'Daniel'];

let res = arrayNums.map(function(e){
    return e * 2;
});

console.log("Array duplicado: " + res);

const soma10 = n =>  n + 10;
const triplo = n => n * 3;
const dinheiro = n => `R$ ${parseFloat(n).toFixed(2).replace('.', ',')}`;

res = arrayNums
        .map(soma10)
        .map(triplo)
        .map(dinheiro);

console.log(res);

// desfaio
const carrinho = [
    '{"nome": "Borracha", "preco": 3.5}',
    '{"nome": "Caderno", "preco": 13.9}',
    '{"nome": "Kit de Lapis", "preco": 43.52}',
    '{"nome": "Caneta", "preco": 7.5}'
]

// Retornar array apenas com os preços
let desafio = carrinho.map(item => JSON.parse(item).preco);

console.log(desafio);

// implementação
Array.prototype.map2 = function(callback){
    const newArray = [];
    for(let i = 0; i <= this.length; i ++) {
        newArray.push(callback(this[i], i, this));
    }
    return newArray;
};