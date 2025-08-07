module app.finaceiro {

    uses estagio.app.Calculadora; // Usa esse serviço na aplicação

    requires app.api;
    requires transitive app.calculo; // import da api

}