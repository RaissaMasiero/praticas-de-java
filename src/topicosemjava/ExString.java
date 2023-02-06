package topicosemjava;

public class ExString {

    public static void main(String[] args) {

        // algumas formatações de strings

       String original = "-abcde FGHIJ ABC ac DEFG     ";
       System.out.println("Original: " + original);

       String minuscula = original.toLowerCase();
       System.out.println("Minúscula: -" + minuscula + "-");

       String maiuscula = original.toUpperCase();
       System.out.println("Maiúscula: " + maiuscula + "-");

       String retiraEspacos = original.trim();
       System.out.println("Sem espaços: " + retiraEspacos + "-");

       String replace = original.replace('a', 'x');
       System.out.println("Caracteres trocados: " + replace + "-");

        System.out.println();

       // recortar string com split

       String s = "potato apple lemon";

       String[] vetor = s.split(" ");
       System.out.println(vetor[0]);
       System.out.println(vetor[1]);
       System.out.println(vetor[2]);
    }
}
