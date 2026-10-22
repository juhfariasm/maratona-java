package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = entrada.nextLine();
        System.out.println("Bem-vindo(a), " + nome + "!");

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual seu sexo? (M) (F)");
        char sexo = entrada.next().charAt(0);

        System.out.println("----- Relátorio -----");
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);

    }
}
