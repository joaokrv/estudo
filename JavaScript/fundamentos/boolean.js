let isAtivo = false;
console.log(isAtivo);

isAtivo = true;
console.log(isAtivo);

isAtivo = 1;
console.log(isAtivo);
console.log(!isAtivo);
console.log(!!isAtivo);

console.log("Verdadeiro:")
console.log(!!3);
console.log(!!-3);
console.log(!![]);
console.log(!!{});
console.log(!!' ');
console.log(!!Infinity);

console.log("Falso:");
console.log(!!0);
console.log(!!'');
console.log(!!null);
console.log(!!NaN);
console.log(!!undefined);
console.log(!!(isAtivo = false));

console.log("Finalizando:");
console.log(!!('' || null || 0 || ' '));