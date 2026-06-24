package AULAJAVA;

public class aula04_SwitchCase {
    public static void main(String[] args) {
        int opcaoMenu = 2;
        switch (opcaoMenu) {
            case 1:
                System.out.println("iniciando");
                break;
        
            case 2:
                System.out.println("CARREGANDO JOGO SALVO");
                break;

            case 3:

                System.out.println("SAINDO DO  PROGRAMA");
                break;
                
            default:
                break;
        }
    }
    
}
