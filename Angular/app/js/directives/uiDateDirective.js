angular.module("listaTelefonica").directive("uiDate", function () {
  return {
    require: "ngModel",
    link: function (scope, element, attrs, ngModelCtrl) {
      element.on("input", function () {
        let value = element.val().replace(/\D/g, "");
        value = value.replace(/^(\d{2})(\d)/, "$1/$2");
        value = value.replace(/^(\d{2})\/(\d{2})(\d)/, "$1/$2/$3");
        value = value.substring(0, 10);
        ngModelCtrl.$setViewValue(value);
        ngModelCtrl.$render();
      });
    },
  };
});
