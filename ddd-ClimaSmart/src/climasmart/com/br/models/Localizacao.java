package climasmart.com.br.models;
import java.util.Scanner;
public class Localizacao {
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
    public Localizacao() {

    }
    //Métodos
    public void receberDados(Scanner leitor) {
        System.out.println("Digite seu país: ");
        pais = leitor.nextLine();
        if (pais.equalsIgnoreCase("Brasil")) {
            System.out.println("Digite a região do Brasil em que você se encontra:");
            regiao = leitor.nextLine();
        } else {
            regiao = "";
        }
        System.out.println("Digite a sigla do seu  estado: ");
        estado = leitor.nextLine();
        System.out.println("Digite sua cidade: ");
        cidade = leitor.nextLine();
    }
    public String exibirLocal() {
        return cidade + ", " + estado + " - " + pais;
    }
    public String impactoMudancasClimaticas() {
        return "O ClimaSmart apresenta uma explicação clara sobre como o aquecimento global influencia diretamente o aumento e a intensidade dos desastres naturais em diversas partes do mundo. " +
                "O aumento na emissão de gases de efeito estufa, como o dióxido de carbono (CO₂) e o metano (CH₄), eleva a temperatura da atmosfera e dos oceanos. " +
                "Esse desequilíbrio nos padrões naturais do clima contribui para a intensificação de fenômenos extremos como secas, enchentes, furacões, ondas de calor, queimadas e deslizamentos. " +
                "Quanto mais quente o planeta se torna, mais energia há no sistema climático, tornando esses eventos mais frequentes, intensos e imprevisíveis.\n\n" +

                "O aquecimento global, que é o aumento gradual da temperatura média da Terra, é considerado o principal fator por trás da intensificação desses desastres climáticos.\n\n" +

                "Exemplos recentes que evidenciam esse impacto incluem:\n" +
                "- As enchentes no estado do Rio Grande do Sul, que deixaram diversas cidades submersas devido a um volume de chuva muito acima do normal.\n" +
                "- Os incêndios florestais em Los Angeles, impulsionados por ondas de calor extremas, secas prolongadas e ventos fortes.\n\n" +

                "Esses eventos não são isolados. Eles fazem parte de um padrão crescente em escala global, resultado direto das mudanças climáticas agravadas pelo aquecimento global.";
    }
    public void descricao() {
        System.out.println("Vamos te mostrar os eventos climáticos mais característicos da sua região do Brasil. ");
    }
    public String eventosRegioes(Localizacao localizacao) {
        String estado = localizacao.getEstado();
        if (estado == null || estado.trim().isEmpty()) {
            return "Estado não informado. Não foi possível identificar os eventos característicos.";
        }
        String estadoFormatado = estado.trim().toUpperCase();
        switch (estadoFormatado) {
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
        return "";
    }
    public String eventosGlobais() {
        return "O ClimaSmart apresenta um panorama dos eventos climáticos extremos que afetam diferentes continentes do mundo. " +
                "Esses eventos são consequências das mudanças climáticas e impactam milhões de pessoas todos os anos. " +
                "Conhecer esses fenômenos é essencial para promover a conscientização e incentivar ações de prevenção e adaptação.\n\n" +
                "Eventos Climáticos Globais\n\n" +
                "América do Sul:\n" +
                "- Enchentes na Amazônia, causadas pelo aumento do nível dos rios na época de chuvas.\n" +
                "- Enchentes urbanas no sul devido às chuvas torrenciais.\n" +
                "- Queimadas no Cerrado e Pantanal, impulsionadas por secas prolongadas, atividades humanas e desmatamento.\n" +
                "- Secas no Nordeste, pelas mesmas causas.\n\n" +
                "Austrália:\n" +
                "- Incêndios florestais.\n" +
                "- Secas severas.\n" +
                "- Ciclones no norte do país.\n\n" +
                "Europa:\n" +
                "- Ondas de calor.\n" +
                "- Enchentes na Europa Central e do Sul, devido a tempestades intensas que sobrecarregam os sistemas urbanos.\n\n" +
                "Ásia:\n" +
                "- Tufões.\n" +
                "- Enchentes no Sudeste Asiático.\n" +
                "- Queimadas na Indonésia.\n" +
                "- Secas na Índia.\n\n" +
                "América do Norte:\n" +
                "- Incêndios na Califórnia e Canadá, causados por seca, calor e ventos fortes.\n" +
                "- Furacões no Caribe.\n" +
                "- Ondas de calor no México e nos Estados Unidos.\n\n" +
                "África:\n" +
                "- Secas no Saara e África Austral.\n" +
                "- Enchentes na África Ocidental.\n" +
                "- Queimadas na savana.\n";
    }
    public String eventosGlobaisPorLocal(Localizacao localizacao) {
        if (localizacao == null) {
            return "Localização não informada. Não foi possível identificar os eventos característicos.";
        }
        String estado = localizacao.getEstado();
        if (estado != null && !estado.trim().isEmpty()) {
            String local = estado.trim().toLowerCase();
            switch (local) {
                case "rio grande do sul":
                case "sul do brasil":
                case "rs":
                    return "Eventos mais característicos em " + estado + ":\n" +
                            "- Enchentes intensas devido ao excesso de chuvas.\n" +
                            "- Deslizamentos em áreas montanhosas.\n" +
                            "- Tempestades severas.";
            }
        }
        String pais = localizacao.getPais();
        if (pais != null && !pais.trim().isEmpty()) {
            String local = pais.trim().toLowerCase();
            switch (local) {
                case "brasil":
                    return "Eventos mais característicos no Brasil:\n" +
                            "- Variações climáticas regionais intensas.\n" +
                            "- Enchentes, secas e tempestades em várias regiões.";
                case "eua":
                case "estados unidos":
                case "califórnia":
                    return "Eventos climáticos do país:"+ localizacao.getPais()+
                            "- Incêndios florestais devastadores causados por secas prolongadas e ventos fortes, como o Camp Fire em 2018.\n" +
                            "- Ondas de calor intensas, que afetam cidades como Phoenix e Los Angeles, aumentando riscos à saúde.\n" +
                            "- Furacões poderosos que atingem as regiões sul e leste, como o furacão Katrina (2005), trazendo ventos fortes e inundações.\n";
                case "índia":
                    return "Eventos climáticos do país:"+ localizacao.getPais()+
                            "- Secas severas, especialmente em regiões áridas como Rajastão, impactando agricultura e recursos hídricos.\n" +
                            "- Enchentes durante o período de monções, como as enchentes históricas em Kerala em 2018, causando deslizamentos e deslocamento de pessoas.\n" +
                            "- Ondas de calor intensas que aumentam riscos para populações vulneráveis, especialmente idosos e crianças.\n";
                case "indonésia":
                    return "Eventos climáticos do país:"+ localizacao.getPais()+
                            "- Queimadas florestais frequentes, principalmente em áreas de florestas tropicais e turfas, contribuindo para a poluição do ar e perda de biodiversidade.\n" +
                            "- Enchentes tropicais que afetam grandes áreas urbanas, como Jacarta, causando transtornos e prejuízos econômicos.\n";
                case "áfrica":
                case "saara":
                case "áfrica austral":
                    return "Eventos climáticos do país:"+ localizacao.getPais()+
                            "- Secas prolongadas, especialmente na região do Saara e África Austral, prejudicando a agricultura e o abastecimento de água.\n" +
                            "- Enchentes repentinas, principalmente na África Ocidental, causando danos significativos.\n" +
                            "- Queimadas em savanas e áreas rurais, afetando ecossistemas locais e comunidades.";
                case "austrália":
                    return "Eventos climáticos do país:"+ localizacao.getPais()+
                            "- Incêndios florestais intensos, como os \"bushfires\" que devastaram grandes áreas em 2019-2020.\n" +
                            "- Secas severas que afetam o interior do país, comprometendo a produção agrícola.\n" +
                            "- Ciclones tropicais que atingem a costa norte, causando ventos fortes e inundações.\n";
                case "europa":
                    return "Eventos climáticos do país:"+ localizacao.getPais()+
                            "- Ondas de calor (principalmente na Europa Ocidental e do Sul).\n" +
                            "- Enchentes causadas por chuvas intensas.";
                case "china":
                case "sudeste asiático":
                    return "Eventos climáticos do país:"+ localizacao.getPais()+
                            "- Tufões frequentes que atingem a costa, com ventos fortes e chuvas intensas, como o tufão Haiyan em 2013.\n" +
                            "- Enchentes nas regiões costeiras e interiores, afetando grandes cidades como Guangzhou e Bangkok, causando deslocamento de populações e perdas econômicas.\n";
                default:
                    return "Localidade global não reconhecida ou ainda sem registros significativos no sistema.";
            }
        }
        return "Localidade global não reconhecida ou ainda sem registros significativos no sistema.";
    }
}
