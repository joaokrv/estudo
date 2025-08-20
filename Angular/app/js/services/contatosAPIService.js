angular
  .module("listaTelefonica")
  .factory("contatosAPI", function ($http, config) {
    let _getContatos = function () {
      return $http.get(config.baseUrl + "/contatos");
    };

    let _saveContato = function (contato) {
      return $http.post(config.baseUrl + "/contatos", contato);
    };

    let _removeContato = function (contatos) {
      const selecionados = contatos.filter(
        (c) => c.selecionado && c.id !== undefined
      );

      const promises = selecionados.map((c) =>
        $http.delete(`${config.baseUrl}/contatos/${c.id}`)
      );

      return Promise.all(promises);
    };

    return {
      getContatos: _getContatos,
      saveContato: _saveContato,
      removeContato: _removeContato,
    };
  });
