package estruturacondicional;

import java.util.Scanner;

public class ExParOuImpar {

    public static void main(String[] args) {

        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Número: ");
        numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número informado é par!");
        }else{
            System.out.println("O número informado é ímpar!");
        }

        sc.close();
    }
}
