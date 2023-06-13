public class funcoes {
    public static void main(String[] args) {
        String nomeOriginal = "Bruna Dias";
        //Chamando a função
        saudacao(nomeOriginal);

        int resultado = soma(2,3);
        System.out.println(resultado);
        
    }


    //função
    public static void saudacao(String nomeParametro) {
        System.out.println("Hello, " + nomeParametro);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
