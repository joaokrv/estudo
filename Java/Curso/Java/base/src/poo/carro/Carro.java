package poo.carro;

public class Carro {

    Motor motor;

    Carro() {
        this.motor = new Motor(this);
    }

    public void ligar() {
        motor.ligado = true;
    }

    public void desligar() {
        motor.ligado = false;
    }

    public void acelerar() {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
        }
    }

    public void freiar() {
        if (motor.fatorInjecao > 0.4) {
            motor.fatorInjecao -= 0.4;
        }
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
