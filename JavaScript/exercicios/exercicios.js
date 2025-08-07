function concatenar(string) {
    return "Olá ".concat(string);
}
console.log(concatenar("Joao"));

function diasVida(n){
    return n*365;
}
console.log(diasVida(20));

function boolOrNum(value) {
    if (typeof value === 'number' || typeof value === 'boolean') {
        if (typeof value === 'number') {
            return value *(-1);
        } else if (typeof value === 'boolean') {
            return !value;
        }
    } else {
        console.log("Valor esperado: Number ou Boolean!")
    }
}

console.log(boolOrNum("4"));

function mult(n1, n2) {
    let resultado = 0;
    for (let i = 0; i < n2; i++) {
        resultado += n1;
    }
    return resultado;
}

console.log(mult(2, 3));

function repetir(elemnt, repeat){
    let newArray = [];

    for(let i = 0; i < repeat; i++) {
        newArray.push(elemnt);
    }

    return newArray;
}

console.log(repetir(7, 3));

function firstLast(array) {
    let newArray = [];
    let lastIndex = array.length - 1;
    
    newArray.push(array[0]);
    newArray.push(array[lastIndex]);

    return newArray;
}

console.log(firstLast([1, 2, 3]))

function removeById(object, id) {
    Reflect.deleteProperty(object, id); // API Reflect 
    return object;
}

console.log(removeById({nome: "Joao", id: 1, idade: 20}, "id"));

function filterNums(array) {
    let newArray = [];

    for(let i = 0; i < array.length; i++){
        if(typeof array[i] === 'number'){
            newArray.push(array[i]);
        }
    }

    return newArray;
}

console.log(filterNums([1, 2, "Jose", 3, 4, 5, "Joao", "Andre"]))

function objToArray(obj){
    let newArray = [];

    for(let key in obj){
        newArray.push([key, obj[key]]);
    }

    return newArray;
}

console.log(objToArray({nome:"Joao", idade:22}));

function bissexto(ano){
    if(ano % 400 == 0){
        return true;
    } else if(ano % 100 == 0) {
        return false;
    } else if (ano % 4 == 0){
        return true;
    }
    return false;
}

console.log(bissexto(2022));

function containInWord(string, array){
    let newArray = [];

    for(const item of array){
        if(item.toLowerCase().includes(string.toLowerCase())){
            newArray.push(item);
        }
    }

    return newArray;
}

console.log(containInWord("ao", ["Joao", "Pao", "Macarrao", "Jose"]))

function filterQntDigit(arrayNums, numDigitos) {
    let newArray = [];
    let tempNum = 0;

    for(const num of arrayNums) {
        tempNum = num;
        if (num.toString().length == numDigitos) {
            newArray.push(tempNum);
        }
    }

    return newArray;
}

console.log(filterQntDigit([1, 2, 3, 44, 55, 66, 1000, 100002], 2));

function bestStudent(objStudents){
    const soma = array => array.reduce((acc, atual) => acc + atual, 0);
    const media = array => soma(array) / array.length;

    // const studentMedia = Object.entries(objStudents).map(student => {
    //     const key = 0, value = 1;
    //     return{ nome: student[key], media: media(student[value])}
    // });

    const studentMedia = Object.entries(objStudents).map(([nome, notas]) => {
        return {nome, media: media(notas)}
    }) 

    const sortStudents = studentMedia.sort( (studentA, studentB) => studentB.media - studentA.media);
    const bestStudent = sortStudents[0];

    return bestStudent;
}

console.log(bestStudent({
Joao: [8, 7.6, 8.9, 6], // média 7.625
Mariana: [9, 6.6, 7.9, 8], // média 7.875
Carla: [7, 7, 8, 9] // média 7.75
}))