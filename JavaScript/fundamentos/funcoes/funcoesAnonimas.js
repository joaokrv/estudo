const soma = function (x, y) { 
    return x + y; 
} 

const printResult = function (a, b, operacao = soma) {
    console.log(operacao(a, b));
}

printResult(5, 5);
printResult(5, 5, soma);
printResult(5, 5, function (x, y){
    return x - y;
});
printResult(5, 5, (x, y) => x * y );

const pessoa = {
    falar: function() {
        return "falando...";
    }
}