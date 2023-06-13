import java.util.Scanner;

public class estruturaCondicionais {
    public static void main(String[] args) {
        //Exemplo de estrutura condicional
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        String resultado;
        
        if (nota >= 7 && nota <= 10) {
            System.out.println("Aprovado");
            resultado = "a";
        } else if (nota >= 5 && nota <=6 ){
            System.out.println("Recuperacao");
            resultado = "b";
        }else if (nota >= 0 && nota <= 4){
            System.out.println("Reprovado");
            resultado = "c";
        } else {
            System.out.println("Nota invalida");
            resultado = "d";
        }

        switch (resultado) {
            case "a":
            System.out.println("Boas ferias"); 
            break;  
            case "b":
            System.out.println("Voce tem mais 2 semanas de aula");
            break;
            case "c":
            System.out.println("Voce tera que refazer a materia");
            break;
            case "d":
            System.out.println("ue ta doidao?");
            break;
            default:
                break;
        }
    }
}
