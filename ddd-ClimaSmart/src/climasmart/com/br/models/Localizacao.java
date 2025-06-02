package climasmart.com.br.models;

import java.util.Scanner;

public class Localizacao {
    //Nessa classe eu armazeno os dados da localização do usuário para fazer as previsões
    //Atributos
    private String pais;
    private String estado;
    private String cidade;
    private String regiao;

    public String getPais() {return pais;}
    public void setPais(String pais) {this.pais = pais;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}
    public String getRegiao() {return regiao;}
    public void setRegiao(String regiao) {this.regiao = regiao;}

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
        if (pais.equalsIgnoreCase("Brasil")){
            System.out.println("Digite a região do Brasil em qe você se encontra:");
            regiao = leitor.nextLine();
        }
        else{
            return;
        }
        System.out.println("Digite seu estado: ");
        estado = leitor.nextLine();
        System.out.println("Digite sua cidade: ");
        cidade = leitor.nextLine();
    }
    public String exibirLocal() {
        return cidade + ", " + estado + " - " + pais;
    }

    public String eventosRegioes(Usuario usuario, EventoClima eventoClima, Radar radar, Scanner leitor){
        while (true){
            regiao = leitor.nextLine();
            switch (regiao){
                case "Nordeste":
                    System.out.println();
                    return "";
                case "Sul":
                    System.out.println();
                    return "";
                case "Centro-Oeste":
                    System.out.println();
                    return "";
                case "Sudeste":
                    System.out.println();
                    return "";
                case "Norte":
                    System.out.println();
                    return "";
                default:
                    System.out.println();
            }

        }

    }



    public String eventosGlobais(){}



}
