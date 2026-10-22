package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Avenida Tal");
        Aluno aluno = new Aluno("Julia", 18);
        Professor professor = new Professor("Sergio", "Historia");
        Aluno [] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("II Guerra Mundial", alunosParaSeminario, local);

        Seminario [] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();


    }
}
