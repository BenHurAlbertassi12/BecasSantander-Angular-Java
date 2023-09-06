package ExemploContinue;

public class ExemploContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // Quando i for igual a 3, o loop continuará com a próxima iteração usando "continue"
                continue;
            }
            System.out.println(i);
        }
    }
}

