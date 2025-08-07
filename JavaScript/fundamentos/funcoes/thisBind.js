function Pessoa() {
    this.idade = 0;

    const self = this;
    setInterval(function () {
        self.idade++;
        console.log(this);
        console.log(self.idade);
    }/*.bind(this)*/, 1000)
}

new Pessoa;

// THIS APONTA PARA O "PAI", DEPENDE DE QUEM ESTÁ O CHAMADNO