package estruturarepetitiva;

import java.util.Scanner;

public class ParaIntro {

    public static void main(String[] args) {

        // fazer um programa que le um valor N e depois N números inteiros. Ao final, mostra a soma dos
        // N lidos.

        Scanner sc = new Scanner(System.in);
        int n;
        double soma = 0;

        System.out.print("Quantas vezes: ");
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
