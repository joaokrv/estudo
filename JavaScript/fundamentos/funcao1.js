// função sem retorno em JS
function subtrair(num1, num2) {
    console.log(num1 - num2)
}

// função com retorno em JS
function somar(num1 = 0,  num2 = 0) {
    let total = num1 + num2;
    return total;
}

console.log(somar(1, 5));
subtrair(1, 2);
