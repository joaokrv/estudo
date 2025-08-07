const pessoa = {
    nome: 'Alfredo',
    idade: 26,
    peso: 86
}

console.log(Object.keys(pessoa));
console.log(Object.values(pessoa));
console.log(Object.entries(pessoa));

Object.entries(pessoa).forEach(e => {
    console.log(`${e[0]}: ${e[1]}`);
});

Object.entries(pessoa).forEach(([chave, valor]) => {
    console.log(`${chave}: ${valor}`);
});

Object.defineProperty(pessoa, 'dataNascimento', {
    enumerable: true,
    writable: false,
    value: '01/01/1999'
})

pessoa.dataNascimento = '01/02/1999';
console.log(pessoa.dataNascimento);
console.log(Object.keys(pessoa));

// Object Assign
const dest = { a: 1 };
const o1 = { b: 2 };
const o2 = { c: 3, a: 4 }; // valor é sobrescrito
const obj = Object.assign(dest, o1, o2);
console.log(obj);

// Object Freeze
Object.freeze(obj);
obj.c = 22;
console.log(obj);