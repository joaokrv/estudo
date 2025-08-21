angular
  .module("listaTelefonica")
  .controller(
    "listaTelefonicaController",
    function ($scope, contatosAPI, operadorasAPI, serialGenerator) {
      // $scope -> faz a ponte entre eles
      $scope.app = "Lista Telefônica";
      $scope.operadoras = [];
      $scope.contatos = [];

      $scope.message = "";

      const carregarOperadoras = () => {
        return operadorasAPI
          .getOperadoras()
          .then(function (response) {
            $scope.operadoras = response.data;
          })
          .catch(function (error) {
            console.error("Erro ao carregar operadoras:", error);
            $scope.operadoras = [];
            $scope.message +=
              "Não foi possível carregar operadoras: " +
              error.status +
              " " +
              error.statusText +
              "\n";
          });
      };

      const carregarContatos = () => {
        return contatosAPI
          .getContatos()
          .then(function (response) {
            $scope.contatos = response.data;
          })
          .catch(function (error) {
            console.error("Erro ao carregar contatos:", error);
            $scope.contatos = [];
            $scope.message +=
              "Não foi possível carregar contatos: " +
              error.status +
              " " +
              error.statusText +
              "\n";
          });
      };

      $scope.addContato = (contato) => {
        if (!Array.isArray($scope.contatos)) {
          $scope.contatos = [];
        }

        contato.serial = serialGenerator.generate();

        return contatosAPI.saveContato(contato).then((res) => {
          $scope.contatos.push(res.data);
          delete $scope.contato;
          $scope.contatoForm.$setPristine();
          // carregarContatos();
        });
      };

      $scope.removeContato = (contatos) => {
        contatosAPI
          .removeContato(contatos)
          .then(() => {
            carregarContatos();
          })
          .catch((err) => console.error("Erro ao remover contatos:", err));
      };

      $scope.isContatoSelecionado = (contatos) => {
        if (!Array.isArray(contatos)) return false;
        return contatos.some((contato) => contato.selecionado);
      };

      $scope.toggleSerial = (contato) => {
        contato.serialExpandido = !contato.serialExpandido;
      };

      $scope.serialExibicao = (contato) => {
        if (contato.serialExpandido) {
          return contato.serial;
        }
        const inicio = contato.serial.slice(0, 4);
        const fim = contato.serial.slice(-4);
        return `${inicio}...${fim}`;
      };

      $scope.ordenarPor = (campo) => {
        $scope.criterioOrdenacao = campo;
        $scope.direcaoOrdenacao = !$scope.direcaoOrdenacao;
      };

      $scope.classe1 = "selecionado";
      $scope.classe2 = "negrito";

      carregarOperadoras().then(function () {
        carregarContatos();
      });
    }
  );
