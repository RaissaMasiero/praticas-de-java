package estruturasequencial;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class ExValorInteiroSoma {

    public static void main(String[] args) {

        // ler 2 valores inteiros e depois mostrar na tela a soma dos números com mensagem.

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int a, b;
        double soma;

        System.out.print("Digite um número: ");
        a = sc.nextInt();

        System.out.print("Digite mais um número: ");
        b = sc.nextInt();

        soma = a+b;

        System.out.println("A soma dos números é: " + soma);

        sc.close();
    }
}
