angular.module("listaTelefonica").directive("telefoneMask", function () {
  return {
    restrict: "A",
    require: "ngModel",
    link: function (scope, element, attrs, ngModelCtrl) {
      element.on("input", function () {
        let value = element.val().replace(/\D/g, "");
        value = value.replace(/^(\d{2})(\d)/g, "($1) $2");
        value = value.replace(/(\d{5})(\d)/, "$1-$2");
        ngModelCtrl.$setViewValue(value);
        ngModelCtrl.$render();
      });
    },
  };
});
