// Função em JS é First-Class Object
// Higher-order function

// Criar de forma literal
function fun1() { };

// Armazenar função em variável
const fun2 = function() {};

// Armazenar em Array
const array = [function(a, b) {return a + b}, fun1, fun2];
console.log(array[0](2, 3));

// Armazenar em um atributo de objeto
const obj = {};
obj.falar = function () { return 'Falando'};
console.log(obj.falar());

// Passar função como parametro
function run(fun) {
    fun();
}

run(function () {console.log('Executando')});

// Função pode retornar uma função
function somar(a, b) {
    return function (c) {
        console.log(a + b + c);
    }
}

somar(1,2)(4); 
const somarMais = somar(2, 3);
somarMais(4);