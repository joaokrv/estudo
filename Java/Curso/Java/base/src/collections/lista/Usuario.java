package collections.lista;

import java.util.Objects;

public class Usuario {

    private String nome;

    public Usuario(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Nome do usuário: " + getNome() + "!";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
