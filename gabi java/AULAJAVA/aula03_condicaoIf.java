package AULAJAVA;

public class aula03_condicaoIf{

    public static void  main(String[] args){
        double nota = 5.5;

        if(nota>=7.0){
            System.out.println("aprovado");
        }else if (nota >= 5.0){
            System.out.println("recuperacao");
        }else{System.out.println("reprovado");}
    }

}