package generics.heranca;

public class CaixaGenerics<T> {

    // <> = GENERICS
    // T -> tipo ainda não definido genérico
    // PADRAO: uma letra maiuscula referente, K - key, V - Value, T - tipo, etc.

    private T coisa;

    public void guardar(T coisa) { // set
        this.coisa = coisa;
    }

    public T abrir(){ // get
        return coisa;
    }
}
