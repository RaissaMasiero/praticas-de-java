package praticalogica;

import java.util.Locale;

public class ExCasasDecimais {

    public static void main(String[] args) {

        String p1 = "Computador";
        String p2 = "Mesa";
        int idade = 20;
        int code = 52;
        char genero = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.5;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, cujo preço é R$ %.2f \n", p1, preco1);
        System.out.printf("%s, cujo preço é R$ %.2f \n", p2, preco2);

        System.out.printf("Comprador: %d anos, código %d e gênero: %s \n", idade, code, genero);

        System.out.printf("Medida: %.8f%n", medida);
        System.out.printf("Medida arredondada: %.3f%n", medida);

        Locale.setDefault(Locale.US);
        System.out.printf("Medida arredondada com separador dos EUA: %.3f%n", medida);
    }

}
