const quaseArray = { 0: 'Rafael', 1: 'Joao', 2: 'Jose', 3: 'Lucas', 4: 'Pedro'};
Object.defineProperty(quaseArray, 'toString',{
    value: function() { return Object.values(this) },
    enumerable: false
});
console.log(quaseArray);  

const myArray = ['Rafael', 'Joao', 'Jose', 'Lucas', 'Pedro'];
console.log(myArray);