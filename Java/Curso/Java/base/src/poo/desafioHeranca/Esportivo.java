package poo.desafioHeranca;

public interface Esportivo {

    public void ligarTurbo();
    public void desligarTurbo();

    default int nivelAr(){
        return 1;
    }
}
