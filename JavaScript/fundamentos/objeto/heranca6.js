function Aula(videoID, nome) {
    this.nome = nome;
    this.videoID = videoID;
}

const aula1 = new Aula(123, 'Aula 1');
const aula2 = new Aula(125, 'Aula 2');

console.log(aula1, aula2);

function novo (f, ...params) {
    const obj = {};
    obj.__proto__ = f.prototype;
    f.apply(obj, params);
    return obj;
}

const aula3 = novo(Aula, 122, 'Aula 3');
const aula4 = novo(Aula, 120, 'Aula 4');

console.log(aula3, aula4);