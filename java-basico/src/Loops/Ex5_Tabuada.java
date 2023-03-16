package Loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        if (tabuada > 10) {
            System.out.println("Número invalido! Digite um número entre 0 e 10.");
            tabuada = scan.nextInt();
        }
            System.out.println("Tabuada de " + tabuada);

            for(int i = 1;i <= 10; i++){
                System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        
        }

       

    }
}
