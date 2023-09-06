package exemplo_try_catch;

public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            // Tentar dividir por zero, o que causará uma exceção
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado); // Esta linha nunca será alcançada
        } catch (ArithmeticException e) {
            // Capturando a exceção do tipo ArithmeticException
            System.err.println("Erro: Divisão por zero não é permitida.");
        }
    }
}


