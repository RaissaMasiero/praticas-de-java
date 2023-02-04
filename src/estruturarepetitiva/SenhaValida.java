package estruturarepetitiva;

import java.util.Scanner;

public class SenhaValida {

    public static void main(String[] args) {

        /*
            Escreva um programa que repita a leitura de uma senha até que ela seja válida.
            Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
            Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
            e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
         */

        Scanner sc = new Scanner(System.in);

        int senha;
        senha = sc.nextInt();
        String mensagem;

        while (senha != 2002) {

            mensagem = "Senha inválida!";
            System.out.println(mensagem);
            senha = sc.nextInt();
        }

        mensagem = "Acesso permitido!";
        System.out.println(mensagem);

        sc.close();
    }
}
