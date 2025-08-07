package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa Tarde";
        System.out.println(s.concat("!"));
        System.out.println(s + "!\n");
        System.out.println(s.toLowerCase().startsWith("Boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE\n"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 123123.123;

        System.out.println("Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n");

        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f",
                nome, sobrenome, idade, salario);

        String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f",
                nome, sobrenome, idade, salario);

        System.out.println(frase);


    }
}
