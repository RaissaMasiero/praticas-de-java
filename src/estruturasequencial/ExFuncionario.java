package estruturasequencial;

public class ExFuncionario {

    public static void main(String[] args) {

        /*
            Ler o número do funcionário, horas trabalhadas, valor q recebe por hora e calcular o salário.
            Mostrar o número e o salário do funcionário, com 2 casas decimais.
         */

        int numero = 2;
        int horasTrabalhadas = 100;
        double valorPorHora = 4.40;
        double salario;

        salario = horasTrabalhadas * valorPorHora;
        System.out.printf("O número do funcionário é %d e o seu salário é R$ %.2f \n", numero, salario);
    }
}
