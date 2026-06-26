import java.util.Scanner;


public class Aula09_classeScanner{
  

    public static void main(String[] args){
        Scanner teclado =  new Scanner(System.in);
        Carro09 meuCarro = new Carro09();

        System.out.println("== cadastro do veiculo==");
        System.out.println("digite o modelo do carro");
        meuCarro.modelo = teclado.nextLine();


        System.out.println("digite  a cor do carro");
        meuCarro.modelo = teclado.nextLine();

        System.out.println("digite o ano do carro ");
        meuCarro.modelo = teclado.nextInt();


        System.out.println("\n------carro cadastrado com sucesso");
        System.out.println("modelo"+ meuCarro.modelo);
        System.out.println("cor" + meuCarro.cor);
        System.out.println("ano"+ meuCarro.ano);
        
        teclado.close();
    }
}