package climasmart.com.br.models;

import java.util.Scanner;

public class Usuario {
    private String nome;
    private String contato;
    private Localizacao localizacao;

    public void receberDados(Scanner leitor) {
        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();

        System.out.println("Digite seu contato: ");
        contato = leitor.nextLine();

        System.out.println("\nAgora informe sua localização!");
        System.out.println("\n");
        localizacao = new Localizacao();
        localizacao.receberDados(leitor);
    }

    public void exibirDados() {
        System.out.println("\n===== Seus Dados =====");
        System.out.println("Nome: " + nome);
        System.out.println("Contato: " + contato);
        System.out.println("Localização: " + localizacao.exibirLocal());
    }
}
