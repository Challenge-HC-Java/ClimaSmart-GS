package climasmart.com.br.models;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Abrigo {
    //Atributos
    //Métodos
    public String listarAbrigos(Localizacao localizacao) {
        System.out.println("No ClimaSmart, identificamos o seu e exibimos os abrigos mais conhecidos e frequentemente utilizados na sua região, "+
                        "ajudando você a saber para onde ir em caso de necessidade.");
        System.out.println("Abrigos comunitários são locais preparados para oferecer segurança e apoio temporário às pessoas em situações de emergência,"+
                        "como enchentes, deslizamentos, incêndios ou outros eventos climáticos extremos. Esses espaços são organizados por órgãos públicos ou organizações civis e contam, geralmente, com estrutura básica para alimentação, higiene e repouso. ");
        String estado = localizacao.getEstado().toUpperCase();
        String abrigos = obterAbrigosPorEstado(estado);
        return "Abrigos comunitários na região de " + localizacao + ":\n" + abrigos;
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
