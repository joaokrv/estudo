function rand({min = 0, max = 1000}) {
    const valor = Math.random() * (max-min) + min;
    return valor;
}

const obj = {max: 10, min : 0};
console.log(rand(obj));

console.log(rand({min:990}));
console.log(rand({}));
console.log(rand());
