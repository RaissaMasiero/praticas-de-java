package estruturarepetitiva;

import java.util.Scanner;

public class Fatoracao {

    public static void main(String[] args) {

        /*
            Ler um valor N. Calcular e escrever seu respectivo fatorial.
            Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição,
            fatorial de 0 é 1.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Número para fatorar: ");
        int n = sc.nextInt();

        int fatoracao = 1;

        for(int i=1; i<=n; i++){
            fatoracao = fatoracao * i;
        }

        System.out.println(fatoracao);

        sc.close();
    }
}
