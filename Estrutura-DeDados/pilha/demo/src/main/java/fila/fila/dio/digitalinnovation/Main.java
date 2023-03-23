package fila.dio.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enquete("primeiro");
        minhaFila.enquete("segundo");
        minhaFila.enquete("terceiro");
        minhaFila.enquete("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enquete("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);


    }
}
