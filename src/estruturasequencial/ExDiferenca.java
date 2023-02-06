package estruturasequencial;

public class ExDiferenca {

    public static void main(String[] args) {

        /*
            Ler 4 valores inteiros A,B,C,D. Calcular e mostrar a diferença do produto de A e B pelo produto
            de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */

        double A = 2, B = 12, C = 8, D = 2;
        double diferenca = ((A * B) - (C * D));
        System.out.println("A diferença é: " + diferenca);
    }
}
