package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class CasosTeste {

    public static void main(String[] args) {

        /*
            Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
            Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
            Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
            primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double nota1, nota2, nota3, media;

        System.out.print("Número de testes: ");
        N = sc.nextInt();

        for (int i=0; i<N; i++) {

            System.out.print("Nota 1: ");
            nota1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            nota2 = sc.nextDouble();

            System.out.print("Nota 3: ");
            nota3 = sc.nextDouble();

            media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
            System.out.printf("A média é: %.1f \n", media);

        }

        sc.close();
    }
}
