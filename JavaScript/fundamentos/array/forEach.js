const arrayNums = [1, 2, 3, 4, 5, 6];
const arrayString = ["Joao", 'Pedro', "Lucas", "Jose", "Rafael", 'Daniel'];

arrayString.forEach(function (nome, indice){
    console.log(`${indice + 1}) ${nome}`);
});

arrayString.forEach(nome => console.log(nome));

const exibirNomes = arrayString => console.log(arrayString);
arrayString.forEach(exibirNomes);

// Implementação
Array.prototype.forEach2 = function(callback) {
    for(let i = 0; i < arrayString.length; i++){
        callback(this[i], i, this)
    }
}
 
arrayString.forEach2(function (nome, indice){
    console.log(`${indice + 1}) ${nome}`);
});