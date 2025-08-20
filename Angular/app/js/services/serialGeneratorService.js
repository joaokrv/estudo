angular
  .module("listaTelefonica")
  .provider("serialGenerator", function (config) {
    console.log(config);

    let _length = 20;

    this.getLength = function () {
      return _length;
    };

    this.setLength = function (length) {
      _length = length;
    };

    this.$get = () => {
      return {
        generate: function () {
          let chars =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
          let serial = "";
          for (let i = 0; i < _length; i++) {
            serial += chars.charAt(Math.floor(Math.random() * chars.length));
          }
          return serial;
        },
      };
    };
  });
