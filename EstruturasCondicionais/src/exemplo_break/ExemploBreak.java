package exemplo_break;

public class ExemploBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // Quando i for igual a 3, o loop será interrompido com o "break"
                break;
            }
            System.out.println(i);
        }
    }
}