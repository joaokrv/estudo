const arrayNums = [1, 2, 3, 4, 5, 6];
const arrayString = ["Joao", 'Pedro', "Lucas", "Jose", "Rafael", 'Daniel'];
const arrayTodos = arrayNums.concat(arrayString);

console.log (arrayNums);
console.log (arrayString);
console.log (arrayTodos);

console.log([].concat([1, 2], [3, 4], 5, [[6, 7]]));
console.log(['a', 'b'].concat([1, 2], [3, 4], 5, [[6, 7]]));