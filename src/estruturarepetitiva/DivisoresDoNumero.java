package estruturarepetitiva;

import java.util.Scanner;

public class DivisoresDoNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número para calcular seus divisores: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

             if(n % i == 0){
                 System.out.println(i);
             }
        }

        sc.close();
    }
}
