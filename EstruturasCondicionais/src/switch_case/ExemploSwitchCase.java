package switch_case;

public class ExemploSwitchCase {

    public static void main(String[] args) {
        int opcao = 20;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada.");
                break;
            case 2:
                System.out.println("Opção 2 selecionada.");
                break;
            case 3:
                System.out.println("Opção 3 selecionada.");
                break;
            default:
                System.out.println("Opção padrão selecionada.");
                break;
        }
    }
}
