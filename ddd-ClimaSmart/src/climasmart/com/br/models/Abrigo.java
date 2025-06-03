package climasmart.com.br.models;

import java.util.Scanner;

public class Abrigo {
    //Atributos

    //Métodos

    public String listarAbrigos(Localizacao localizacao) {
        String estado = localizacao.getEstado().toUpperCase();
        String abrigos = obterAbrigosPorEstado(estado);
        return "Abrigos comunitários na região de " + localizacao + ":\n" + abrigos;
    }
    private String extrairEstado(String localizacao) {
        String[] partes = localizacao.split("-");
        if (partes.length >= 2) {
            return partes[1].trim().toUpperCase();
        } else {
            return "";
        }
    }
    private String obterAbrigosPorEstado(String estado) {
        switch (estado) {
            case "RS":
                return "- Ginásio Tesourinha (Porto Alegre)\n- Centro Vida (Porto Alegre)";
            case "SP":
                return "- Expo Center Norte (São Paulo)\n- Ginásio do Ibirapuera (São Paulo)";
            case "MT":
                return "- Centro Comunitário do Pantanal (Cuiabá)\n- Escola Estadual Dom Bosco (Cuiabá)";
            case "BA":
                return "- Centro de Convenções (Salvador)\n- Ginásio de Esportes Antônio Balbino (Salvador)";
            case "AM":
                return "- Centro Cultural Povos da Amazônia (Manaus)\n- Ginásio Renné Monteiro (Manaus)";
            default:
                return "Não há registros de abrigos para essa localidade ou estado não identificado.";
        }
    }

}
