const alunos = [
    {nome: 'Joao', nota: 10, bolsista: true},
    {nome: 'Pedro', nota: 9.5, bolsista: true},
    {nome: 'Guilherme', nota: 1.8, bolsista: false},
    {nome: 'Mario', nota: 6.7, bolsista: false},
    {nome: 'Jose', nota: 8.2, bolsista: false}
];

// imperativo
let tot1 = 0;
for(let i = 0; i < alunos.length; i++){
    tot1 += alunos[i].nota;
}
console.log("Média: " + tot1 / alunos.length);

// declarativo
const getNota = a => a.nota;
const soma = (total, atual) => total + atual;
const tot2 = alunos.map(getNota).reduce(soma);
console.log("Média: " + tot2 / alunos.length);
