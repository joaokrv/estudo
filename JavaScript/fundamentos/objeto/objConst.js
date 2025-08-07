// pessoa -> 123 (Endereço de memoria) -> { ... }
const pessoa = { nome: "João" };
console.log(pessoa);
// mesmo endereço
pessoa.nome = 'Pedro';
console.log(pessoa);

// pessoa -> 234 (Outro endereço de memoria) -> { ... }
// pessoa = { nome:"Josue" }; // GERA ERRO

Object.freeze(pessoa); // Objeto se torna totalmente invariavel/constante
pessoa.nome = "Leonardo";
pessoa.endereco = "Rua LSAC";
console.log(pessoa.nome);
console.log(pessoa);