// Closure é o escopo criado quando uma função é declarada
// O escopo permite a função acessar e manipular as variáveis externas

const x = 'Global';

function fora() {
    const x = 'Local';
    
    function dentro() {
        return x;
    }
    
    return dentro;
}

const minhaFuncao = fora ();
console.log(minhaFuncao());