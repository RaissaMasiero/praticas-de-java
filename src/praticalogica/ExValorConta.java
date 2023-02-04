package praticalogica;

import java.util.Scanner;

public class ExValorConta {

    public static void main(String[] args) {

        /*
            ler código de um item e quantidade
            calcular e mostrar o valor da conta
            1 - Cachorro QUENTE - 4.00
            2 - X salada - 4.50
            3 - X bacon - 5.00
            4 - torrada - 2.00
            5 - refri - 1.50
         */

        Scanner sc = new Scanner(System.in);

        int id = 0;
        String especificacao = "";
        double preco = 0;
        int qtd;
        double valorConta = 0;

        System.out.print("Código: ");
        id = sc.nextInt();

        System.out.print("Quantidade: ");
        qtd = sc.nextInt();

        if(id == 1){
            especificacao = "CACHORRO QUENTE";
            preco = 4.0;
            valorConta = preco * qtd;

        }else if(id == 2){
            especificacao = "X-SALADA";
            preco = 4.50;
            valorConta = preco * qtd;

        } else if(id == 3){
            especificacao = "X-BACON";
            preco = 5.0;
            valorConta = preco * qtd;

        }else if(id == 4){
            especificacao = "TORRADA";
            preco = 2.0;
            valorConta = preco * qtd;

        } else if (id == 5){
            especificacao = "REFRIGERANTE";
            preco = 1.50;
            valorConta = preco * qtd;
        }

        System.out.printf(
                "Produto: %s" + "\n" +
                "Valor da conta a pagar: R$ %.2f", especificacao, valorConta
        );

        sc.close();
    }
}
