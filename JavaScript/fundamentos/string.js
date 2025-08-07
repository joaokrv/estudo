const escola = "Estagio"

console.log(escola.charAt(4)); // Busca letra pelo índice

console.log(escola.charCodeAt(3)); // Valor unicode

console.log(escola.indexOf('g')); 

console.log(escola.substring(1));
console.log(escola.substring(0, 3)); // Vai do indice 0 até o 3

console.log("Emprego " + escola + "!");
console.log("Emprego ".concat(escola).concat("!"));

console.log(escola.replace('s', 'a'));

console.log('Joao, Pedro, Jose'.split(',')); // Vai fazer um array quebrando a partir do elemnto selecionado