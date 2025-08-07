// Par   NOME  /  VALOR
const saudacao = 'Olá!'; // Contexto léxico 1

function exec() {
    const saudacao = 'Bom dia!'; // Contexto léxico 2
    return saudacao;
}

// Objetos são grupos de pares nome/valor
const cliente = {
    nome: 'Josefino',
    idade: 29,
    peso: 90,
    endereco: {
        logradouro: 'Rua sema saida',
        numero: 293
    }
}