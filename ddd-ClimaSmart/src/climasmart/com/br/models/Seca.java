package climasmart.com.br.models;
import climasmart.com.br.enums.NivelRisco;
public class Seca extends EventoClima{
    //Método com sobrescrita
    @Override
    public String explicacao() {
        System.out.println("\n==============================\n");
        return "Seca: Período prolongado de ausência de chuvas, causado por bloqueios atmosféricos e agravado pelo aquecimento global. "
                + "Caracteriza-se pela escassez hídrica, impactos na agricultura e aumento do risco de incêndios."+
                "\n=============================="+
                "\n" +"Sinais de que você está em um região de seca:" +
                "Aumento da temperatura e baixa umidade do ar.\n" +
                "Vegetação ressecada, rachaduras no solo e diminuição visível do nível de rios, lagos e represas.\n" +
                "Maior quantidade de poeira no ar.";
    }
    public String reagir(){
        return "Como reagir : "
                + "Economize água em todas as atividades: banho, limpeza, irrigação e uso doméstico.\n" +
                "\n" +
                "Armazene água de forma segura, evitando contaminações.\n" +
                "\n" +
                "Evite queimadas e descarte de lixo que possam gerar fogo.\n" +
                "\n" +
                "Proteja-se do calor, utilizando roupas leves e mantendo-se hidratado.\n" +
                "\n" +
                "Atenção especial a idosos, crianças e animais, que são mais sensíveis aos efeitos da seca.";
    }
}
