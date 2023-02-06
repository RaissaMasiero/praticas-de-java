package estruturasequencial;

public class ExValorASerPagoPecas {

    public static void main(String[] args) {

        /*
            Ler o id da peça 1, número de peças 1, valorUnitario de cada peça 1.
            Ler o id da peça 2, o número de peças 2, valorUnitario de cada peça 2.
            Calcular e mostrar o valor a ser pago.
         */

        int idPeca1 = 828;
        int numeroPeca1 = 2;
        double valorUnitarioPeca1 = 9.90;

        int idPeca2 = 1545;
        int numeroPeca2 = 4;
        double valorUnitarioPeca2 = 2.20;

        double calculoPeca1;
        double calculoPeca2;
        double valorASerPago;

        calculoPeca1 = numeroPeca1 * valorUnitarioPeca1;
        calculoPeca2 = numeroPeca2 * valorUnitarioPeca2;

        valorASerPago = calculoPeca1 + calculoPeca2;

        System.out.println(
                "ID da Peça 1: " + idPeca1 + "\n" +
                "ID da Peça 2: " + idPeca2 + "\n" +
                "Valor a pagar pelas peças é: R$" + valorASerPago
        );
    }
}
