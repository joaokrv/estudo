package spring.estagio.sbexercicios.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private int id;
    private String nome;
    private String cpf;

//    public Cliente(int id, String nome, String cpf) {
//        super();
//        this.id = id;
//        this.nome = nome;
//        this.cpf = cpf;
//    }
}
