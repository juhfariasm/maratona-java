package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco (\t \n \f \r)
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // [] = Range

        //String regex = "[a-zA-C]";

        String regex = "0[xX][0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: \"" + regex +"\"");
        System.out.print("Posições encontradas: ");
        while (matcher.find()){
            System.out.print("[" + matcher.start()+ "]" + "-" + matcher.group() + " ");
        }
        //int numeroHex = 0xDFA;
        //System.out.println("\n" + numeroHex);
    }
}
