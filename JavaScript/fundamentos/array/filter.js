const arrayNums = [1, 2, 3, 4, 5, 6];

const arrayString = ["Joao", 'Pedro', "Lucas", "Jose", "Rafael", 'Daniel'];

const produtos = [
    {nome: "Borracha", preco: 3.5, fragil: false},
    {nome: "Caderno", preco: 13.9, fragil: false},
    {nome: "Kit de Lapis", preco: 43.52, fragil: false},
    {nome: "Taça", preco: 67.5, fragil: true},
    {nome: "Caneta", preco: 7.5, fragil: true},
    {nome: "Mochila", preco: 127.5, fragil: false}
]

console.log(produtos.filter(function(p){
    return p.preco > 10;
}))

const produtosFrageis = p => p.fragil;
const produtosCaros = p => p.preco >= 40;

console.log(produtos.filter(produtosCaros).filter(produtosFrageis));

// implementação
Array.prototype.filter2 = function(callback) {
    const newArray = [];
    for (let i = 0; i < this.length; i++) {
        if (callback(this[i], i, this)) {
            newArray.push(this[i]);
        }
    }

    return newArray;
}

console.log(produtos.filter2(produtosFrageis).filter2(produtosCaros));