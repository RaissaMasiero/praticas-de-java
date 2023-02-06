package topicosemjava;

import java.util.Scanner;
public class ExFuncoesSintaxe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maior = max(n1, n2, n3);

        showResult(maior);

        sc.close();
    }

    // quando a função retorna um valor que é reaproveitado, ela tem um tipo (nesse caso, int).
    // quando a função apenas faz uma ação, como mostrar um valor na tela, ela é void.

    public static int max(int n1, int n2, int n3){

        int auxilio;

        if(n1 > n2 && n1 > n3){
            auxilio = n1;

        } else if (n2 > n3) {
            auxilio = n2;

        } else {
            auxilio = n3;
        }

        return auxilio;
    }

    public static void showResult(int valor){

        System.out.println("Número maior: " + valor);
    }
}
