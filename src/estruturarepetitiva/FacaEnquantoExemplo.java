package estruturarepetitiva;

import java.util.Scanner;

public class FacaEnquantoExemplo {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
            Perguntar se o usuário deseja repetir(s/n). Caso o usuário digite "s", repetir o programa.
            Formula: F = 9C/5 + 32
         */

        Scanner sc = new Scanner(System.in);

        double temperatura;
        double F;
        char repetir;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = sc.nextDouble();

            F = 9.0 * temperatura / 5.0 + 32.0;
            System.out.println("Equivalente em Fahrenheit: " + F);

            System.out.print("Deseja repetir (s/n)? ");
            repetir = sc.next().charAt(0);

        } while (repetir != 'n');

        sc.close();
    }
}
