package estruturacondicional;

import java.util.Scanner;

public class ExMultiplos {

    public static void main(String[] args) {

        /*
            Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
            "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos
            entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
         */

        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.print("Número 1: ");
        A = sc.nextInt();

        System.out.print("Número 2: ");
        B = sc.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("Os números digitados são múltiplos!");
        }else{
            System.out.println("Os números digitados não são múltiplos!");
        }

        sc.close();
    }
}
