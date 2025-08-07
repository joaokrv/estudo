class Lancamento {
    constructor(nome = 'Generico', valor = 0) {
        this.nome = nome;
        this.valor = valor;
    }
}

class CicloFinanceiro {
    constructor(mes, ano) {
        this.mes = mes;
        this.ano = ano;
        this.lancamentos = [];
    }

    addLancamentos(...lancamentos) {
        lancamentos.forEach( l => this.lancamentos.push(l));
    }

    sumario() {
        let valorConslidado = 0;
        this.lancamentos.forEach(l => {
            valorConslidado += l.valor;
        })

        return valorConslidado;
    }
}

const salario = new Lancamento('Salario', 45000);
const contaLuz = new Lancamento('Luz', -220);

const contas = new CicloFinanceiro(6, 2018)

contas.addLancamentos(salario, contaLuz);
console.log(contas.sumario()); 