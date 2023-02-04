package estruturarepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão
            do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem
            "divisao impossivel".
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Divisões: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y == 0){
                System.out.println("Divisão impossível!");
            }else{
                double div = (double) x / y;
                System.out.printf("O resultado da divisão é: %.1f \n", div);
            }
        }

        sc.close();
    }
}
