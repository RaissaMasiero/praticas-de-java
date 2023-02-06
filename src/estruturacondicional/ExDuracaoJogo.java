package estruturacondicional;

import java.util.Scanner;

public class ExDuracaoJogo {

    public static void main(String[] args) {

        /*
            Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
            sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração
            mínima de 1 hora e máxima de 24 horas.
         */

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal;
        double calculoDuracao = 0;

        System.out.print("Hora inicial: ");
        horaInicial = sc.nextInt();

        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        if(horaInicial < horaFinal){
            calculoDuracao = horaFinal - horaInicial;
        }else{
            calculoDuracao = 24 - horaInicial + horaFinal;
        }

        sc.close();

        System.out.println("A duração do jogo foi de " + calculoDuracao + " horas");
    }
}
