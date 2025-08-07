package poo.carro;

public class Motor {

    Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    Motor(Carro carro) {
        this.carro = carro;
    }

    //public double getFatorInjecao() {
    //    return fatorInjecao;
    //}
//
    //public void setFatorInjecao(double fatorInjecao) {
    //    this.fatorInjecao = fatorInjecao;
    //}
//
    //public boolean getLigado() {
    //    return ligado;
    //}
//
    //public void setLigado(boolean ligado) {
    //    this.ligado = ligado;
    //}

    public int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
