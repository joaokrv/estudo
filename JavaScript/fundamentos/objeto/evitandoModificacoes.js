const produto = Object.preventExtensions({
    nome: 'farinha', preco: 1.99, tag: 'promocao'
});

console.log("Extensivel: " + Object.isExtensible(produto));

produto.nome = 'tempero';
produto.desc = 'bacon';
delete produto.tag;

console.log(produto);


// Obj.seal
const pessoa = { nome: 'Joao', idade: 22 };
Object.seal(pessoa);

console.log('Selado:' + Object.isSealed(pessoa));

pessoa.sobrenome = 'Silva';
delete pessoa.nome;
pessoa.idade = 24;

console.log(pessoa);