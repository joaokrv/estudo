const pessoa = {
    nome:'Joao',
    idade: 20,
    endereco: {
        logradouro: 'Rua DCA',
        numero: 123
    }
}

const { nome, idade } = pessoa; // DESTRUCTURING -> tira nome e idade de pessoa e os torna varivael
console.log(nome, idade);

const { nome: n, idade: i} = pessoa;
console.log(n, i);

const { sobrenome, bemHumorado = true } = pessoa;
console.log(sobrenome, bemHumorado);

const { endereco: {logradouro, numero, cep} } = pessoa;
console.log(logradouro, numero, cep);