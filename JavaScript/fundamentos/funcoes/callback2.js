const notas = [7.5, 6.6, 5.5, 10.0, 9.8, 7.2, 7.0, 1.8, 9.9];

// Sem callback
const notasBaixas1 = [];
for (let i in notas) {
    if(notas[i] < 7) {
        notasBaixas1.push(notas[i]);
    }
}
console.log(notasBaixas1);

// Com callback
const notasBaixas2 = notas.filter(function (nota){
    return nota < 7;
});
console.log(notasBaixas2);

// Com arrowFunction
const notasMenorQue7 = nota => nota < 7;
const notasBaixas3 = notas.filter(notasMenorQue7);
console.log(notasBaixas3); 