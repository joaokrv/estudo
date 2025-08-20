angular.module("listaTelefonica").config(function (serialGeneratorProvider) {
  serialGeneratorProvider.setLength(30);
  console.log(serialGeneratorProvider.getLength());
});
