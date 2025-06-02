package climasmart.com.br.models;

import java.util.Scanner;

public class Localizacao {
    private String pais;
    private String estado;
    private String cidade;

    public Localizacao() {
    }

    public Localizacao(String cidade, String estado, String pais) {
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

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
