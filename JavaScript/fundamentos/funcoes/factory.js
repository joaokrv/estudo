function criarPessoa(nome, sobrenome) {
    return {
        nome: nome,
        sobrenome: sobrenome,
    }
}

console.log(criarPessoa('Joao', 'Silva'));

function criarProduto(nome, preco) {
    return {
        nome,
        preco,
        desconto: 0.1
    }
}

console.log(criarProduto("Celular", 999.99));
console.log(criarProduto("Cadeira", 399.99));