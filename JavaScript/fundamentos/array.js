const valores = [7.7, 8.2, 9.9, 1.5, 10, 7.5]

console.log(valores[0], valores[3]);
console.log(valores[6]);

valores[6] = 8.0;
console.log(valores[6]);

console.log(valores);
console.log(valores.length);

valores.push({id: 3}, false, null, true, 'Teste');
console.log(valores);

console.log(valores.pop());
delete valores[10];

console.log(valores);