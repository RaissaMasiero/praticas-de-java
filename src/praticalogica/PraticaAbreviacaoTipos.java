package praticalogica;

public class PraticaAbreviacaoTipos {
    public static void main(String[] args) {

        String nome = "Raissa";
        int idade = 20;
        double renda = 1700.0;

        /*
            %s = abreviação de string;
            %d = abreviação de inteiro;
            %f = abreviação de double;
            %n = quebra de linha.
         */

        System.out.printf("%s tem %d anos e ganha R$ %.1f reais%n", nome, idade, renda);

    }
}