angular.module("listaTelefonica").filter("elipsesFilter", function () {
  return function (input, size) {
    if (!input) return ""; // evita erro se input for undefined/null
    if (input.length <= size) return input;
    return input.substring(0, size || 10) + "...";
  };
});
