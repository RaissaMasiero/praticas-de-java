package praticalogica;

public class ExAreaCirculo {

    public static void main(String[] args) {

        // ler o valor do raio de um círculo, mostrar o valor da área do círculo com 4 casas decimais
        // area = pi * raio²
        // valor do pi = 3.14159

        double area;
        double pi = 3.14159;
        double raio = 4;

        double raioQuadrado = Math.pow(raio, 2.0);

        area = pi * raioQuadrado;
        System.out.printf("O valor da área do círculo é: %.4f \n", area);

    }
}
