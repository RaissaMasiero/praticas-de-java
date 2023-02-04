package praticalogica;

public class FormulaBhaskara {

    public static void main(String[] args) {

        /*
            fórmula bhaskara:
            x = -b +- raiz delta / 2.a
            sendo que delta = b² - 4 * a * c

         */

        double a, b, c, delta, x1, x2;

        a = 2;
        b = 6;
        c = 4;

        delta = Math.pow(b, 2.0) - 4 * a * c;
        System.out.println("O valor de delta é: " + delta);

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        System.out.println("O valor do x1 é: " + x1);

        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        System.out.println("O valor do x2 é: " + x2);
    }
}
