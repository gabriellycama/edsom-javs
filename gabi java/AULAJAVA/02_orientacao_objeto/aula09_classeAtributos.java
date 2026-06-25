package 02_orientacao_objeto;

public class aula09_classeAtributos{
    public static  void main(String[] args){
        carro09 meuCarro = new carro09();
        meuCarro.modelo = "fusca";
        meuCarro.cor = "azul";
        meuCarro.ano = 1975;

       System.out.println["carro criado" + meuCarro.modelo+""+meuCarro.cor];
    }
}