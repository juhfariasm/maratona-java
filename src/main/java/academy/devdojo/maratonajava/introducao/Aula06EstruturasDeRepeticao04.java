package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main (String [] args){
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = 1; valorTotal / parcela >= 1000; parcela++){
            double valorParcela = valorTotal / parcela;
            System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
          /* if (valorParcela >=1000){
                System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
            } else {
                 break;
            }
            System.out.println("Fora do if, mas dentro do for " + parcela);
            */
        }
    }
}
