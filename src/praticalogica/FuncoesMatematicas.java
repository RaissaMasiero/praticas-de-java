package praticalogica;

public class FuncoesMatematicas {

    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x); // sqrt é raiz quadrada. Nesse caso raiz quadrada de x
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        System.out.println();

        A = Math.pow(x, y); // pow = abreviação de power, significa potência. Nesse caso, x elevado a y
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        System.out.println();

        // OBS: valor absoluto é tirar o sinal negativo caso exista

        A = Math.abs(y); // abs é valor absoluto. Nesse caso valor absoluto de y
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

    }

}
