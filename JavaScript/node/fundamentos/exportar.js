console.log(module.exports === this);
console.log(module.exports === exports);

this.a = 1;
exports.b = 2;
modelue.exports.c = 3;