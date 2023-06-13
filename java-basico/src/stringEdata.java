import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringEdata {
    public static void main(String[] args) {
        String nome = "Bruna";

        //1 colocar tudo em letra maiusculas
        System.out.println("1 " + nome.toUpperCase());

        //2 em letra minuscula
        System.out.println("2 " + nome.toLowerCase());

        //3 comprimento do meu texto
        System.out.println("3 " + nome.length());

        String nomeOutro = "bruna";

        //4 comparar string tendo diferença de maiusculo e minusculo
        System.out.println("4 " + nome.equals(nomeOutro));

        //5 comparar string sem diferenciar maiusculo e minusculo
        System.out.println("5 " + nome.equalsIgnoreCase(nomeOutro));


        //ISO 8601
        LocalDate hoje = LocalDate.now();

        //6 Traduzindo para portugues do brasil 
        Locale brasil = new Locale("pt", "BR");
        System.out.println("6 " + hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        //7 como fazer essa frase  "Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA"
        //Horario
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 12 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        } else {
            saudacao = "Olá";
        }

        System.out.printf("7 Ola, %s. Hoje e %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
