package estruturarepetitiva;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual tabuada deseja saber: ");
        int n = sc.nextInt();

        for(int i=0; i<=10; i++){
            System.out.println(n + " x " + i + " = " + i * n);
        }

        sc.close();
    }
}
