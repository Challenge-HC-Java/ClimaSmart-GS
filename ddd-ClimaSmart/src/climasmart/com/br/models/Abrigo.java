package climasmart.com.br.models;
public class Abrigo {
    //Atributos
    //Métodos
    //Método com sobrecarga
    public String listarAbrigos(Localizacao localizacao) {
        System.out.println("No ClimaSmart, identificamos a sua região e exibimos os abrigos mais conhecidos e frequentemente utilizados na sua região, "+
                        "ajudando você a saber para onde ir em caso de necessidade.");
        System.out.println("Abrigos comunitários são locais preparados para oferecer segurança e apoio temporário às pessoas em situações de emergência,"+
                        "como enchentes, deslizamentos, incêndios ou outros eventos climáticos extremos. Esses espaços são organizados por órgãos públicos ou organizações civis e contam, geralmente, com estrutura básica para alimentação, higiene e repouso. ");
        String estado = localizacao.getEstado().toUpperCase();
        String abrigos = obterAbrigosPorEstado(estado);
        return "Abrigos comunitários em sua localização" + ":\n" + abrigos;
    }
    public String listarAbrigos(Localizacao localizacao, String tipoAbrigo) {
        String estado = localizacao.getEstado().toUpperCase();
        String abrigos = obterAbrigosPorEstado(estado);
        return "Abrigos do tipo '" + tipoAbrigo + ":\n"
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
                //Siglas das capitais dos países globais principais
            case "DC": //Washington, D.C., EUA
                return "- Centro Rayburn Shelter – Abrigo de emergência da Cruz Vermelha usado em eventos climáticos.\n "
                        + "- Escola Coolidge High School – Usada como abrigo durante tempestades e crises sociais\n"
                        +"- Ginásio Deanwood Recreation Center — ginásio com abrigo emergencial durante nevascas.";
            case "DL"://Nova Délhi,Índia
                return "- Centro Yamuna Flood Shelter – Abrigos temporários em áreas vulneráveis às cheias do rio Yamuna.\n"
                        +"- Escola Rajkiya Sarvodaya Vidyalaya – Escola convertida em abrigo durante enchentes e ondas de calor.\n"
                        +"- Chattarpur Relief Camp (Centro comunitário) — abrigo para desalojados durante inundações.";
            case "JK"://Jacarta, Indonésia
                return "- Centro Pusat Evakuasi Kelurahan – Centros de evacuação comunitária em bairros de risco.\n"
                        +"- Ginásio Gelanggang Remaja Jakarta Timur – Usado como abrigo para vítimas de enchentes.\n"
                        +"- Escola Sekolah Dasar Negeri (Escolas primárias públicas) — com estrutura adaptada para evacuação. ";
            case "MP"://Maputo, Moçambique, África
                return "- Centro de Acolhimento de Desastres – Beira, Moçambique\n"
                        +"- Escola Secundária de Inhagoia – Acolheu deslocados após ciclones e cheias.\n"
                        +"- Ginásio Pavilhão Municipal de Maxaquene — ginásio que abriga famílias em emergência climática.";
            case "ACT": //Camberra,Austrália
                return "- Ginásio Evacuation Centre - Canberra Showground – Abrigo para evacuação em incêndios e enchentes.\n"
                        +"- Centro EPIC (Exhibition Park in Canberra) – Abrigo ativado durante incêndios florestais.\n "
                        +"- Escola Narrabundah College — designado como ponto de evacuação pelo governo local.";
            case "BJ"://Pequim (Beijing), China
                return "- Centro Beijing Emergency Shelter System – Rede de abrigos sísmicos em zonas de risco.\n"
                        +"- Escola Chaoyang Emergency Center / Primary Schools – Abrigos sísmicos integrados à infraestrutura escolar.\n"
                        +"- Ginásio Chaoyang Emergency Command Center — centro público multifuncional para desastres.";
            default:
                return "Não há registros de abrigos para essa localidade ou estado não identificado.";
        }
    }
}