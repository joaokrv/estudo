package poo.curso;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Pedro");
        Aluno a3 = new Aluno("Jose");

        Curso c1 = new Curso("JS");
        Curso c2 = new Curso("Java");
        Curso c3 = new Curso("React");

        c1.addAluno(a1);
        c1.addAluno(a2);
        c2.addAluno(a1);

        a3.addCurso(c3);

        for (Aluno aluno: c1.alunos) {
            System.out.println("Estou matriculado no curso de " + c1.getNome());
            System.out.println("E meu nome é " + aluno.getNome() + "\n");
        }

        Curso cursoEncontrado = a1.getCursoNome("JS");

        if (cursoEncontrado != null) {
            System.out.println( "Curso: " + cursoEncontrado.getNome());
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
