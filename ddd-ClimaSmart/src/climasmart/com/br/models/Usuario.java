package climasmart.com.br.models;

import java.util.Scanner;

public class Usuario {
    private String nomeCompleto;
    private String contato;
    private Localizacao localizacao;

    public String getNomeCompleto() {return nomeCompleto;}

    public void setNomeCompleto(String nome) {this.nomeCompleto = nome;}

    public String getContato() {return contato;}

    public void setContato(String contato) {this.contato = contato;}

    public Localizacao getLocalizacao() {return localizacao;}

    public void setLocalizacao(Localizacao localizacao) {this.localizacao = localizacao;}

    public void receberDados(Scanner leitor) {
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        setNomeCompleto(nomeCompleto);
        System.out.println("Digite seu contato: ");
        contato = leitor.nextLine();
        System.out.println("\nAgora informe sua localização!(Ex: estou em casa, no trabalho...");
        leitor.nextLine();
        localizacao = new Localizacao();
        localizacao.receberDados(leitor);
    }

    public void exibirDados() {
        System.out.println("\n===== Seus Dados =====");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Contato: " + contato);
        System.out.println("Localização: " + localizacao.exibirLocal());
    }
}
