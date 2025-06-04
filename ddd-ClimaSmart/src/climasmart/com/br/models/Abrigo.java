package climasmart.com.br.models;
public class Abrigo {
    //Atributos
    //Métodos
    //Método com sobrecarga
    public String listarAbrigos(Localizacao localizacao) {
        System.out.println("No ClimaSmart, identificamos o seu e exibimos os abrigos mais conhecidos e frequentemente utilizados na sua região, "+
                        "ajudando você a saber para onde ir em caso de necessidade.");
        System.out.println("Abrigos comunitários são locais preparados para oferecer segurança e apoio temporário às pessoas em situações de emergência,"+
                        "como enchentes, deslizamentos, incêndios ou outros eventos climáticos extremos. Esses espaços são organizados por órgãos públicos ou organizações civis e contam, geralmente, com estrutura básica para alimentação, higiene e repouso. ");
        String estado = localizacao.getEstado().toUpperCase();
        String abrigos = obterAbrigosPorEstado(estado);
        return "Abrigos comunitários na região de " + localizacao + ":\n" + abrigos;
    }
    public String listarAbrigos(Localizacao localizacao, String tipoAbrigo) {
        String estado = localizacao.getEstado().toUpperCase();
        String abrigos = obterAbrigosPorEstado(estado);
        return "Abrigos do tipo '" + tipoAbrigo + "' na região de " + localizacao + ":\n"
                + filtrarPorTipo(abrigos, tipoAbrigo);
    }
    private String filtrarPorTipo(String abrigos, String tipoAbrigo) {
        String[] listaAbrigos = abrigos.split("\n");
        StringBuilder resultado = new StringBuilder();
        for (String abrigo : listaAbrigos) {
            if (abrigo.toLowerCase().contains(tipoAbrigo.toLowerCase())) {
                resultado.append(abrigo).append("\n");
            }
        }
        if (resultado.length() == 0) {
            return "Nenhum abrigo do tipo '" + tipoAbrigo + "' encontrado.";
        }
        return resultado.toString();
    }
    private String obterAbrigosPorEstado(String estado) {
        switch (estado) {
            case "RS":
                return "- Ginásio Tesourinha (Porto Alegre) - Ginásio\n"
                        + "- Escola Municipal Porto Seguro (Porto Alegre) - Escola\n"
                        + "- Centro Vida (Porto Alegre) - Centro Comunitário";
            case "SP":
                return "- Expo Center Norte (São Paulo) - Centro de Convenções\n"
                        + "- Ginásio do Ibirapuera (São Paulo) - Ginásio\n"
                        + "- Escola Estadual São Paulo (São Paulo) - Escola";
            case "MT":
                return "- Centro Comunitário do Pantanal (Cuiabá) - Centro Comunitário\n"
                        + "- Escola Estadual Dom Bosco (Cuiabá) - Escola\n"
                        + "- Ginásio Verdão (Cuiabá) - Ginásio";
            case "BA":
                return "- Centro de Convenções (Salvador) - Centro de Convenções\n"
                        + "- Ginásio de Esportes Antônio Balbino (Salvador) - Ginásio\n"
                        + "- Escola Estadual Dois de Julho (Salvador) - Escola";
            case "AM":
                return "- Centro Cultural Povos da Amazônia (Manaus) - Centro Cultural\n"
                        + "- Ginásio Renné Monteiro (Manaus) - Ginásio\n"
                        + "- Escola Estadual Amazonas (Manaus) - Escola";
            default:
                return "Não há registros de abrigos para essa localidade ou estado não identificado.";
        }
    }
}