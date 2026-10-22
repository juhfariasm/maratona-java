package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main (String [] args){
        // idade < 15 categoria infantil
        // idade  >= 15 %% idade < 18 categoria juevnil
        // idade >= 18 categoria adulto
        int idade = 17;
        String categoria = "NADA";

        if (idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
