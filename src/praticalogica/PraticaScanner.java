package praticalogica;

import java.util.Locale;
import java.util.Scanner;

public class PraticaScanner {

    public static void main(String[] args) {

       /* entrada de dados padrão, criamos um objeto do tipo Scanner.
          sc.close() quando não precisar mais do objeto
          sc.nextInt para ler dados do tipo int
          sc.nextDouble para ler dados do tipo double
          sc.next para ler strings
          sc.next().charAt(0) para ler char
          sc.nextLine para ler um texto até a quebra de linha
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;
        int x;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: \n" +
                                x + " \n"  +
                                s1 + " \n" +
                                s2 + " \n" +
                                s3);

        sc.close();

    }
}
