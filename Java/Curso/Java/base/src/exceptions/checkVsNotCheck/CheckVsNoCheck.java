package exceptions.checkVsNotCheck;

public class CheckVsNoCheck {
    public static void main(String[] args) {

        gerarErro1();
        // gerarErro2(); -> precisaria colocar na assinatura do main "throws Exception"

        try {
            gerarErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            gerarErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");

    }

    // Execeção NÃO checada/verificada
    static void gerarErro1(){
        throw new RuntimeException("Ocorreu um erro");
    }

    // Exceção checada/verificada ->
    // é obrigado colocar na assinatura do métod ( "throws
    static void gerarErro2() throws Exception {
            throw new Exception("Ocorreu um erro 2");
    }
}
