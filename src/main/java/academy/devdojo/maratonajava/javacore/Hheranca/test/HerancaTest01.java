package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345-09");

        Pessoa pessoa = new Pessoa ("Julia");
        pessoa.setCpf("860.011.642-29");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("José");
        funcionario.setCpf("000.000.000-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2300);
        System.out.println("--------------");

        funcionario.imprime();
        funcionario.relatorioPagamentos();

    }
}
