angular.module("listaTelefonica").directive("uiAlert", function () {
  return {
    templateUrl: "app/view/alert.html",
    replace: true,
    restrict: "AE", // resitra ao atributo e ao elemento
    scope: {
      title: "@",
      message: "=",
    },
    transclude: true,
  };
});
