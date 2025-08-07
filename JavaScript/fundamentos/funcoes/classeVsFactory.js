// class Pessoa {
//     constructor(nome) {
//         this.nome = nome;
//     }

//     falar() {
//         console.log(`Meu nome é ${this.nome}`)
//     }
// }

// const p1 = new Pessoa("João");
// p1.falar();

const criarPessoa = nome => {
    return {
        falar: () => console.log(`Meu nome é ${nome}`)
    }
}

const p2 = criarPessoa("Joao");
p2.falar();

function Pessoa(nome) {
    this.nome = nome;

    this.falar = function() {
        console.log("Meun nome é " + this.nome);
    }
}

const p3 = new Pessoa("João");
p3.falar();