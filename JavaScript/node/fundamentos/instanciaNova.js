// Factory -> new Instancia

module.exports = () => {
  return {
    valor: 1,
    inc() {
      this.valor++;
    },
  };
};
