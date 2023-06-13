public class variavel {
    public static void main(String[] args) {
        
        // variavel de texto
        String nome = "bruna";
        System.out.println("ola, " + nome);

        //variavel de numero inteiro 
        int a;
        int b = 2;
        a = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;

        //float para numero decimais
        float divisao = (float) a / b;

        System.out.println("Soma de a e b: " + soma);
        System.out.println("Subtracao de a e b: " + subtracao);
        System.out.println("Multiplicacao de a e b: " + multiplicacao);
        System.out.println("Divisao de a e b: " + divisao);
        System.out.println("");

        //operação lógicas verdadeiro ou falso
        //algoritimo para ir a praia
        System.out.println("Ir a praia");
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println("vamos a praia? " + vamosAPraia);

        /*tabela verdades
        Operador && (AND)
        true && true = true
        true && false = false
        false && true = false
        false && false = false

        Operadpr || (OR)
        true || true = true
        true || false = true
        false || true = true
        false || false = false
        */

        //Operador ternário
        //Termo senso avaliado "fimDeSemano" ? caso seja true "é fim de semana" : caso seja falso "não é fim de semana"

        String msg = fimDeSemana ? "é fim de semana" : "Nao é fim de semana";
        System.out.println(msg);
    }

}