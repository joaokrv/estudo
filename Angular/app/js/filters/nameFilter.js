angular.module("listaTelefonica").filter("nameFilter", function () {
  return function (input) {
    let listaDeNomes = input.split(" ");
    let listaDeNomesFormatada = listaDeNomes.map((nome) => {
      if (/(da|de)/.test(nome)) return nome;
      return nome.charAt(0).toUpperCase() + nome.substring(1).toLowerCase();
    });
    return listaDeNomesFormatada.join(" ");
  };
});
