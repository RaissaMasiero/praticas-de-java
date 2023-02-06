package estruturacondicional;

import java.util.Scanner;

public class ExNegativoOuNao {

    public static void main(String[] args) {

        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Número: ");
        numero = sc.nextInt();

        if(numero >= 0){
            System.out.println("O número informado é positivo!");
        }else {
            System.out.println("O número informado é negativo!");
        }

        sc.close();
    }
}
