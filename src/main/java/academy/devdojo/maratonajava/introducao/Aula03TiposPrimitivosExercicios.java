package academy.devdojo.maratonajava.introducao;
/* Prática
 *
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 *
 * Eu <nome>, morando no endereço <endereço>,
 * confirmo que recebi o salário de <salario>, na data <data>
 *
 * */

public class Aula03TiposPrimitivosExercicios {
    public static void main (String [] args) {
        String nome = "Júlia";
        String endereco = "Avenida Homero, Bairro Tal, Número 7";
        double salario = 4530.90;
        String dataRecebimentoSalario = "12/11/2025";

        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de "
                + salario + ", na data " + dataRecebimentoSalario + ".";

        System.out.println(relatorio);
    }

}
