function Carro(velociaddeMaxima = 200, delta = 5) {
    // atributo privado
    let velocidadeAtual = 0;

    // metodo publico
    this.acelerar = () => {
        if (velocidadeAtual + delta <= velociaddeMaxima) {
            velocidadeAtual += delta;
        } else {
            velocidadeAtual = velociaddeMaxima;
        }
    } 

    // metodo publico (this.)
    this.getVelocidadeAtual = () => {
        return velocidadeAtual;
    }
}

const uno = new Carro();
uno.acelerar();
console.log(uno.getVelocidadeAtual());

const ferrari = new Carro(350, 20);
ferrari.acelerar();
ferrari.acelerar();
ferrari.acelerar();
console.log(ferrari.getVelocidadeAtual());
