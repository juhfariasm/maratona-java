package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main (String [] agrs) {
        // Utilizando o switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte diaSemana = 1;
        String diaUtil = "Dia útil";
        String finalSemana = "Final de semana";

        switch(diaSemana) {
            case 1:
                System.out.println("Domingo!! " + finalSemana);
                break;
            case 2:
                System.out.println("Segunda!! " + diaUtil);
                break;
            case 3:
                System.out.println("Terça!! " + diaUtil);
                break;
            case 4:
                System.out.println("Quarta!! " + diaUtil);
                break;
            case 5:
                System.out.println("Quinta!! " + diaUtil);
                break;
            case 6:
                System.out.println("Sexta!! " + diaUtil);
                break;
            case 7:
                System.out.println("Sábado!! " + finalSemana);
                break;
            default:
                System.out.println("Inválido");
        }

        // Forma do vídeo de resolver
        switch (diaSemana){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
