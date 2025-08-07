package hash.EqualsHascode;

public class Usuario {

    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        // if (obj instanceof Usuario) {
        //     Usuario outro = (Usuario) obj;
        //     return super.equals(obj);
        // } else {
        //     return false;
        // }

        if (obj instanceof Usuario){
            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(getNome());
            boolean emailIgual = outro.email.equals(getEmail());

            return nomeIgual && emailIgual;

        } else {
            return false;
        }
    }

}
