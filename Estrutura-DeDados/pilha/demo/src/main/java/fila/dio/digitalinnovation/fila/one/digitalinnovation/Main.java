package fila.one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        
        Fila minhaFila = new Fila();

        minhaFila.enquete(new No("primeiro"));
        minhaFila.enquete(new No("segundo"));
        minhaFila.enquete(new No("terceiro"));
        minhaFila.enquete(new No("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enquete(new No("ultimo"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);


    }
}
