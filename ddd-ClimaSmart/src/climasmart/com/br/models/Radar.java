package climasmart.com.br.models;

public class Radar {
    private String localizacao;

    public Radar(String localizacao) {
    }

    //aqui eu faço as previsões e depois exibo na classe    Localização
//ALERTa
    //O Brasil, embora não tenha furacões tropicais como o Caribe, tem registrado o aumento dos ciclones extratropicais, especialmente no Rio Grande do Sul e Santa Catarina, além de ondas de calor, enchentes e incêndios florestais em crescimento acelerado.
    public String emitirAlertaPorLocalizacao(EventoClima evento) {
        String estado = extrairEstado(localizacao);
        String regiao = identificarRegiao(estado);
        String riscosDaRegiao = obterRiscosPorRegiao(regiao);

        return "ALERTA DE " + evento.getClass().getSimpleName().toUpperCase() + "!\n"
                + "Local: " + localizacao + "\n"
                + "Descrição do evento: " + evento.explicacao() + "\n"
                + "Nível de risco: " + evento.nivelRisco + "\n"
                + "Status: " + evento.status + "\n\n"
                + riscosDaRegiao + "\n\n"
                + "Siga imediatamente as orientações de segurança.";
    }

    private String extrairEstado(String localizacao) {
        String[] partes = localizacao.split("-");
        if (partes.length >= 2) {
            return partes[1].trim().toUpperCase();
        } else {
            return "";
        }
    }

    private String identificarRegiao(String estado) {
        switch (estado) {
            case "RS":
            case "SC":
            case "PR":
                return "Sul";
            case "SP":
            case "RJ":
            case "MG":
            case "ES":
                return "Sudeste";
            case "MT":
            case "MS":
            case "GO":
            case "DF":
                return "Centro-Oeste";
            case "BA":
            case "PE":
            case "CE":
            case "PB":
            case "RN":
            case "PI":
            case "MA":
            case "SE":
            case "AL":
                return "Nordeste";
            case "AM":
            case "PA":
            case "RO":
            case "RR":
            case "AC":
            case "AP":
            case "TO":
                return "Norte";
            default:
                return "Região não identificada";
        }
    }

    private String obterRiscosPorRegiao(String regiao) {
        switch (regiao) {
            case "Sul":
                return "Riscos na região Sul: enchentes, ciclones extratropicais, granizo e deslizamentos.";
            case "Sudeste":
                return "Riscos na região Sudeste: enchentes, deslizamentos, tempestades severas e ondas de calor.";
            case "Centro-Oeste":
                return "Riscos na região Centro-Oeste: queimadas, incêndios florestais e estiagem.";
            case "Nordeste":
                return "Riscos na região Nordeste: secas prolongadas, ondas de calor e aumento de queimadas.";
            case "Norte":
                return "Riscos na região Norte: enchentes (cheias dos rios) e queimadas na estação seca.";
            default:
                return "Não foi possível identificar os riscos da região.";
        }
    }






    //  Sobrecarga - vários métodos alertarPopulacao com parâmetros diferentes

    public void alertarPopulacao() {
        System.out.println("Atenção! Há risco devido a um evento climático.");
    }

    public void alertarPopulacao(String local) {
        System.out.println("Atenção população de " + local + "! Há risco devido a um evento climático.");
    }

    public void alertarPopulacao(String local, int grau) {
        System.out.println("ALERTA para " + local + "! Grau de risco: " + grau);
    }

    public void alertarPopulacao(int grau) {
        System.out.println("Atenção! Grau de risco atual: " + grau);
    }


}
