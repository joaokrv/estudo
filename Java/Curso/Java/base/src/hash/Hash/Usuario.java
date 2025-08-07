package hash.Hash;

import java.util.Objects;

public class Usuario {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
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

    //@Override
    //public boolean equals(Object obj) {
    //    // if (obj instanceof Usuario) {
    //    //     Usuario outro = (Usuario) obj;
    //    //     return super.equals(obj);
    //    // } else {
    //    //     return false;
    //    // }
    //
    //    if (obj instanceof Usuario){
    //        Usuario outro = (Usuario) obj;
    //
    //        boolean nomeIgual = outro.nome.equals(getNome());
    //        return nomeIgual;
    //
    //    } else {
    //        return false;
    //    }
    //}
    //
    //@Override
    //public int hashCode() {
    //    return this.nome.length();
    //}
}
