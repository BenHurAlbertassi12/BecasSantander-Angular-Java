package candidatura;

public class ProcessoSeletivo {
    static double salarioBase = 2000.00; // Declarando a variável salarioBase fora do método main

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        double salarioPretendido = 2200.00; // Definindo o salário pretendido (você pode alterar esse valor)

        analisarCandidato(salarioPretendido); // Chamando o método analisarCandidato com o salário pretendido como argumento
    }

    // Definindo o método analisarCandidato com um parâmetro de entrada (salarioPretendido)
    static void analisarCandidato(double salarioPretendido) {
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Aguardando resposta do candidato");
        } else {
            System.out.println("Ligar para o candidato com contra proposta");
        }
    }
}
