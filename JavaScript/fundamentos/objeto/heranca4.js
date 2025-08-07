function MyObj() {}
console.log(MyObj.prototype);

const obj1 = new MyObj;
const obj2 = new MyObj;
console.log(obj1.__proto__ === obj2.__proto__);
console.log(MyObj.__proto__ === obj1.__proto__);

MyObj.prototype.nome = 'Anonimo';
MyObj.prototype.falar = () => console.log("Bom dia meu nome é " + this.nome);

obj1.falar();

obj2.nome = 'Rafael';
obj2.falar();

const obj3 = {};
obj3.__proto__ = MyObj.prototype;
obj3.nome = 'Obj3';
obj3.falar()

console.log((new MyObj).__proto__ === MyObj.prototype);
console.log(MyObj.__proto__ === Function.prototype);
console.log(Function.prototype.__proto__ === Object.prototype);