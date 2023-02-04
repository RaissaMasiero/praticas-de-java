package estruturarepetitiva;

import java.util.Scanner;

public class EnquantoIntro {

    public static void main(String[] args) {

        // PROGRAMA QUE LE NÚMEROS INTEIROS ATÉ QUE UM ZERO SEJA LIDO. AO FINAL MOSTRA A SOMA DOS NÚMEROS LIDOS.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double soma = 0;

        while (n != 0){
            soma += n;
            n = sc.nextInt();
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
