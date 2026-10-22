package academy.devdojo.maratonajava.javacore.Vio.test;

// File = Arquivo
// FileWriter = Escrever arquivo sem otimização
// FileReader = Somente leitura
// BufferedWriter = Escrita em arquivo, performance trabalhando com dados em memória, melhor que FileWriter
// BufferedReader = Leitura, performance melhor que FileReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O DevDojo é lindo, é o melhor curso do brasillllllll\nContinuando a cantoria na próxima linha\n");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
