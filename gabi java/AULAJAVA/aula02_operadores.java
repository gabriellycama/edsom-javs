package AULAJAVA;

public class aula02_operadores {

    public static void main(String[] args){
        double nota1 =5.5;
        double nota2 = 45.7;

        double media = (nota1 + nota2) /2;
        System.out.println("media das notas" + media);


        boolean passou = media >= 7.0;
        boolean presencaMinima = true;

        boolean aprovadoFinal = passou && presencaMinima;
        System.out.println("o aluno foi aprovado?"  + aprovadoFinal);
    }
}