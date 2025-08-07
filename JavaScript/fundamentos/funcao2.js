// Armazenando uma função em uma variavel!

const somar = function (a, b) {
    console.log(a + b)
}

somar(2, 3);

// Armazenando função Arrow em uma variável
const subtrair = (a, b) => {
    return a - b;
}
console.log(subtrair(5, 1)) ;

const divisao = (a, b) => a / b;
console.log(divisao(4,2));