// Object.prototype.attr0 = 'Z';
// const avo = { attr1: 'A'};
// const pai = { __proto__: avo, attr2: 'B', attr3: '3'};
// const filho = { __proto__: pai, attr3: 'C'};

// console.log(filho.attr0, filho.attr1, filho.attr2, filho.attr3);

const carro = {
    velAtual: 0,
    velMax: 200,
    acelerar(delta) {
        if (this.velAtual + delta <= this.velMax) {
            this.velAtual += delta;
        } else {
            this.velAtual = this.velMax
        }
    },

    status() {
        return `${this.velAtual} KM/H de ${this.velMax} KM/H`
    }
}

const ferrari = {
    modelo: 'F40',
    velMax: 324,
    status() {
        return `${this.modelo}: ${super.status()}`
    }
}

const volvo = {
    modelo: 'V40',
    velMax: 200,
    status() {
        return `${this.modelo}: ${super.status()}`
    }
}

Object.setPrototypeOf(ferrari, carro);
Object.setPrototypeOf(volvo, carro);

console.log(ferrari.acelerar(50))
console.log(ferrari.status());