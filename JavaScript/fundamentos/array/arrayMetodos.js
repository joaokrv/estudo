const pilotos = ['Vettel', 'Alonso', 'Joao', 'Airton', 'Massa'];
pilotos.pop(); // Ultimo elemento é deletado
console.log(pilotos);

pilotos.push('Verstappen'); // Insere como ultimo elemento
console.log(pilotos);

pilotos.shift(); // Primeiro elemento é deletado
console.log(pilotos);

pilotos.unshift() // Insere no primeiro elemento
console.log(pilotos);

pilotos.splice(2, 0, 'Botas'); // indice = 2, delete = 0, adicionar = 'Botas' / ou seja, irá adicionar o elemnto no indice 2
console.log(pilotos);

pilotos.splice(3, 1); // indice = 3, delete 1 / ou seja, irá deletar o indice 3
console.log(pilotos);

const algunsPilotos = pilotos.slice(2); // Novo Array
console.log(algunsPilotos);

const algunsPilotos2 = pilotos.slice(1, 4); // Novo array entre os indices 1 e 4(1, 2, 3)
console.log(algunsPilotos2);