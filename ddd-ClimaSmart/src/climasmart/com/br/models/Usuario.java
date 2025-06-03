package climasmart.com.br.models;

import climasmart.com.br.enums.StatusAlerta;

import java.util.Scanner;

public class Usuario {
    //Atributos
    private String nomeCompleto;
    private String contato;
    private Localizacao localizacao;
    //Getters and Setters
    public String getNomeCompleto() {return nomeCompleto;}
    public void setNomeCompleto(String nome) {this.nomeCompleto = nome;}
    public String getContato() {return contato;}
    public void setContato(String contato) {this.contato = contato;}
    public Localizacao getLocalizacao() {return localizacao;}
    public void setLocalizacao(Localizacao localizacao) {this.localizacao = localizacao;}
    //Métodos
    public void receberDados(Scanner leitor) {
        System.out.println("Digite seu nome: ");
        String nomeCompleto = leitor.nextLine();
        setNomeCompleto(nomeCompleto);
        System.out.println("Digite seu contato: ");
        contato = leitor.nextLine();
        System.out.println("\nAgora informe sua localização!");
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

    //public void statusAlerta(){
     //   System.out.println("Alerta!" + StatusAlerta.ATIVO);

   // }
}
