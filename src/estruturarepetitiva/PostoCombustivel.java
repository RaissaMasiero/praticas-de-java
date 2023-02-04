package estruturarepetitiva;

import java.util.Scanner;

public class PostoCombustivel {

    public static void main(String[] args) {

        /*
            Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus
            clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
            (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um
            código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que
            seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser
            escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de
            combustível.
         */

        Scanner sc = new Scanner(System.in);

        int combustivel = 0;
        double soma1 = 0;
        double soma2 = 0;
        double soma3 = 0;

        while(combustivel != 4){

            if(combustivel == 1){
                soma1 += 1;

            } else if (combustivel == 2) {
                soma2 += 1;

            } else if (combustivel == 3) {
                soma3 += 1;
            }

            System.out.println(
                    "1 - ÁLCOOL \n" +
                    "2 - GASOLINA \n" +
                    "3 - DIESEL \n" +
                    "4 - FIM \n" +
                    "Digite o combustível usado: "
            );

            combustivel = sc.nextInt();
        }

        System.out.println(
                "MUITO OBRIGADO \n" +
                "ÁLCOOL: " + soma1 + "\n" +
                "GASOLINA: " + soma2 + "\n" +
                "DIESEL: " + soma3 + "\n"
        );

        sc.close();
    }
}
