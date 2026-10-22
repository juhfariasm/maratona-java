package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main (String [] args){
        Carro carro1 = new Carro();
        carro1.nome = "HB20";
        carro1.modelo = "Sedan";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.nome = "Polo";
        carro2.modelo = "Track";
        carro2.ano = 2024;

        carro2 = carro1;

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
        System.out.println("-------------------");
        System.out.println("Carro 2");
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);

    }
}
