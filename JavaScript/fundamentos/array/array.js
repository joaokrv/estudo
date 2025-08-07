// let aprovados = new Array('Joao', 'Pedro', 'Jhon', 'Lucas', 'Carlos');
let aprovados = ['Joao', 'Pedro', 'Jhon', 'Lucas', 'Carlos']; // notação literal
//                [0]  ,   [1]  ,   [2] ,   [3]  ,    [4]      --> index

console.log(aprovados);

aprovados[2] = 'Paulo';
console.log(aprovados);
console.log(aprovados.length);

aprovados.push('Rafael');
console.log(aprovados);
console.log(aprovados.length);

aprovados.sort(); // organizar array
console.log(aprovados);

delete aprovados[2]; // delete posição array
console.log(aprovados);

aprovados = ['Joao', 'Pedro', 'Jhon', 'Lucas', 'Carlos'];
aprovados.splice(2, 1, 'Josue', 'Leo'); // splice (indice, elementos que serao excluidos (incluindo os indices), Adiciona elemntos)
console.log(aprovados);