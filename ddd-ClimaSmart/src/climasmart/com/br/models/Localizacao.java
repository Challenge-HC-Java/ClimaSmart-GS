package climasmart.com.br.models;

import java.util.Scanner;

public class Localizacao {
    //Atributos
    private String pais;
    private String estado;
    private String cidade;

    public String getPais() {return pais;}
    public void setPais(String pais) {this.pais = pais;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}

    //Construtores
    public Localizacao() {}
    public Localizacao(String cidade, String estado, String pais) {
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    //Métodos
    public void receberDados(Scanner leitor) {
        System.out.println("Digite seu país: ");
        pais = leitor.nextLine();
        System.out.println("Digite seu estado: ");
        estado = leitor.nextLine();
        System.out.println("Digite sua cidade: ");
        cidade = leitor.nextLine();
    }
    public String exibirLocal() {
        return cidade + ", " + estado + " - " + pais;
    }
}
