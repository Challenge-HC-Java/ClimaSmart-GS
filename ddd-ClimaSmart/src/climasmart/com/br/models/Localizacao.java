package climasmart.com.br.models;

import java.util.Scanner;

public class Localizacao {
    //Nessa classe eu armazeno os dados da localização do usuário para fazer as previsões
    //Atributos
    private String pais;
    private String estado;
    private String cidade;
    private String regiao;
    //Getters and Setters
    public String getPais() {return pais;}
    public void setPais(String pais) {this.pais = pais;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}
    public String getRegiao() {return regiao;}
    public void setRegiao(String regiao) {this.regiao = regiao;}
    //Construtor
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
    public String eventosRegioes(){
        while (true) {
            estado = estado.trim().toUpperCase();
            switch (estado) {
                // Região Norte
                case "AC":
                case "AP":
                case "AM":
                case "PA":
                case "RO":
                case "RR":
                case "TO":
                    System.out.println(" Eventos mais característicos:\n" +
                            "Enchentes (cheias dos rios) e queimadas.");
                    break;
                // Região Sul
                case "PR":
                case "RS":
                case "SC":
                    System.out.println(" Eventos mais característicos:\n" +
                            "Enchentes, deslizamentos, temporais, ciclones extratropicais e granizo.");
                    break;
                // Região Centro-Oeste
                case "DF":
                case "GO":
                case "MT":
                case "MS":
                    System.out.println(" Eventos mais característicos:\n" +
                            "Queimadas, incêndios florestais e estiagem.");
                    break;
                // Região Sudeste
                case "ES":
                case "MG":
                case "RJ":
                case "SP":
                    System.out.println("Eventos mais característicos:\n" +
                            "Enchentes, deslizamentos, tempestades severas e ondas de calor.");
                    break;
                // Região Nordeste
                case "AL":
                case "BA":
                case "CE":
                case "MA":
                case "PB":
                case "PE":
                case "PI":
                case "RN":
                case "SE":
                    System.out.println("Evento mais característico:\n" +
                            "Secas prolongadas e ondas de calor.");
                    break;
                default:
                    System.out.println();
            }
        }
    }
    //public String eventosGlobais(){}
}
