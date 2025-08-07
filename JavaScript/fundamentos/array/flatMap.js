const escola = [{
    nome: 'Turma A',
    alunos: [{
        nome: 'Joao', 
        nota: 10, 
    }, {
        nome: 'Pedro', 
        nota: 9.5, 
    }]
}, {
    nome : 'Turma B',
    alunos: [{
        nome: 'Mario', 
        nota: 6.7, 
    }, {
        nome: 'Jose', 
        nota: 8.2, 
    }]
}];

const getNotaAluno = aluno => aluno.nota;
const getNotasTurma = turma => turma.alunos.map(getNotaAluno);

const notas1 = escola.map(getNotasTurma);
console.log(notas1);

// implementação flatMap()
Array.prototype.flatMap = function(callback) {
    return Array.prototype.concat.apply([], this.map(callback))
}

const notasTurmas = escola.flatMap(getNotasTurma);
console.log(notasTurmas);