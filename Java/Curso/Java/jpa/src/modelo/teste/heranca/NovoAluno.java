package modelo.teste.heranca;

import modelo.heranca.Aluno;
import modelo.heranca.Professor;
import modelo.infra.DAO;

public class NovoAluno {
    public static void main(String[] args) {

        DAO<Aluno> alunoDAO = new DAO<>(Aluno.class);
        DAO<Professor> professorDAO = new DAO<>(Professor.class);

        Aluno aluno = new Aluno("João", "Engenharia");
        Professor professor = new Professor("Ricardo", 2999.99);

        alunoDAO.incluirAtomico(aluno);
        professorDAO.incluirAtomico(professor);

        alunoDAO.fechar();
        professorDAO.fechar();
    }
}
