package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String [] args){
        // int, double, float, char, byte, short, long e boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDounle = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = -128;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = "Julia";

        System.out.println("Sua idade é: "+ idade);
        System.out.println(falso);
        System.out.println("Char: "+ caractere);
        System.out.println("Salário: "+ salarioFloat);
        System.out.println(numeroGrande);
        System.out.println("Oii, meu nome é "+ nome);
    }
}
