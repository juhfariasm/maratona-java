package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Hellsing Ultimate");
        mangas.add("Berseck");
        mangas.add("Pokemon");
        mangas.add("Attack On Titan");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        for(String manga : mangas){
            System.out.println(manga);
        }

        System.out.println("--------------------------------------------");
        System.out.println("Antes do sort: " + dinheiros);
        Collections.sort(dinheiros);
        System.out.println("Depois do sort: " + dinheiros);

        //new Manga(null, null, 0);
    }
}
