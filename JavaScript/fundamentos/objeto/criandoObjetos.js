// Notação Literal
const obj1 = {};

// Função Object
const obj2 = new Object;

// Função construtora
function Produto(nome, preco, desconto) {
    this.nome = nome; // global - publico
    this.getPrecoComDesconto = () => {
        return preco *(1 - desconto);
    }
}

const p1 = new Produto("Camiseta", 100, 0.1);
console.log(p1.getPrecoComDesconto().toFixed(2));

// Função Factory
function criarFuncionario(nome, salario, faltas) {
    return {
        nome,
        salario,
        faltas,
        getSalario() {
            return (salario/30) * (30 - faltas)
        }
    }
}

const f1 = criarFuncionario("João", 9999, 2);
console.log(f1.getSalario());

// Object.create
const filho = Object.create(null);
filho.nome = 'Pedro';
console.log(filho);

// Função famosa que retorna obj
const fromJSON = JSON.parse('{"info": "Sou um JSON"}');
console.log(fromJSON.info);