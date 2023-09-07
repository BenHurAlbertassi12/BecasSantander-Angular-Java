package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Candidato> candidatos = new ArrayList<>();


candidatos.add(new Candidato("Pedro Almeida", "pedro@email.com", "5678901234", "Desenvolvedor Full-Stack"));
candidatos.add(new Candidato("Ana Pereira", "ana@email.com", "8765432109", "Especialista em Front-End"));
candidatos.add(new Candidato("Carlos Rodrigues", "carlos@email.com", "2345678901", "Experiência em Python"));
candidatos.add(new Candidato("Larissa Costa", "larissa@email.com", "7890123456", "Designer de UI/UX"));
candidatos.add(new Candidato("Fernando Oliveira", "fernando@email.com", "3456789012", "Engenheiro de Software"));
candidatos.add(new Candidato("Juliana Fernandes", "juliana@email.com", "9012345678", "Scrum Master"));
candidatos.add(new Candidato("Ricardo Martins", "ricardo@email.com", "4321098765", "Analista de Dados"));
candidatos.add(new Candidato("Mariana Silva", "mariana@email.com", "2109876543", "Desenvolvedora Mobile"));
candidatos.add(new Candidato("Luiz Gonçalves", "luiz@email.com", "6543210987", "Arquiteto de Software"));
candidatos.add(new Candidato("Camila Pereira", "camila@email.com", "1098765432", "Especialista em Segurança Cibernética"));
 // Adicione mais candidatos conforme necessário

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar novo candidato");
            System.out.println("2. Validar candidato");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar um novo candidato
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Nome do candidato:");
                    String nome = scanner.nextLine();
                    System.out.println("Email do candidato:");
                    String email = scanner.nextLine();
                    System.out.println("Telefone do candidato:");
                    String telefone = scanner.nextLine();
                    System.out.println("Resumo das qualificações do candidato:");
                    String qualificacoes = scanner.nextLine();
                    Candidato novoCandidato = new Candidato(nome, email, telefone, qualificacoes);
                    candidatos.add(novoCandidato);
                    System.out.println("Candidato adicionado com sucesso!");
                    break;
                case 2:
                    // Validar um candidato
                    scanner.nextLine(); // Limpar o buffer
                    System.out.println("Digite o nome do candidato que deseja validar:");
                    String nomeValidar = scanner.nextLine();
                    boolean encontrado = false;
                    for (Candidato candidato : candidatos) {
                        if (candidato.getNome().equalsIgnoreCase(nomeValidar)) {
                            System.out.println("Candidato encontrado:");
                            System.out.println(candidato);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Candidato não encontrado.");
                    }
                    break;
                case 3:
                    // Sair do programa
                    System.out.println("Saindo do programa. Até mais!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}

class Candidato {
    private String nome;
    private String email;
    private String telefone;
    private String qualificacoes;

    public Candidato(String nome, String email, String telefone, String qualificacoes) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.qualificacoes = qualificacoes;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nEmail: " + email +
                "\nTelefone: " + telefone +
                "\nQualificações: " + qualificacoes;
    }
}
