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

    public String eventosGlobaisPorLocal(String localUsuario) {
        if (localUsuario == null || localUsuario.trim().isEmpty()) {
            return "Localização não informada. Não foi possível identificar os eventos característicos.";
        }

        String local = localUsuario.trim().toLowerCase();

        switch (local) {
            case "rio grande do sul":
            case "sul do brasil":
                return "Eventos mais característicos em " + localUsuario + ":\n" +
                        "- Enchentes intensas devido ao excesso de chuvas.\n" +
                        "- Deslizamentos em áreas montanhosas.\n" +
                        "- Tempestades severas.";

            case "califórnia":
            case "eua":
                return "Eventos mais característicos em " + localUsuario + ":\n" +
                        "- Incêndios florestais causados por secas prolongadas.\n" +
                        "- Ondas de calor.\n" +
                        "- Furacões em áreas do sul e leste.";

            case "índia":
                return "Eventos mais característicos em " + localUsuario + ":\n" +
                        "- Secas severas em algumas regiões.\n" +
                        "- Enchentes durante a monção.\n" +
                        "- Ondas de calor intensas.";

            case "indonésia":
                return "Eventos mais característicos em " + localUsuario + ":\n" +
                        "- Queimadas florestais frequentes.\n" +
                        "- Enchentes tropicais.";

            case "áfrica":
            case "saara":
            case "áfrica austral":
                return "Eventos mais característicos em " + localUsuario + ":\n" +
                        "- Secas prolongadas.\n" +
                        "- Enchentes na África Ocidental.\n" +
                        "- Queimadas em savanas e áreas rurais.";

            case "austrália":
                return "Eventos mais característicos em " + localUsuario + ":\n" +
                        "- Incêndios florestais intensos.\n" +
                        "- Secas severas.\n" +
                        "- Ciclones tropicais no norte.";

            case "europa":
                return "Eventos mais característicos em " + localUsuario + ":\n" +
                        "- Ondas de calor (principalmente na Europa Ocidental e do Sul).\n" +
                        "- Enchentes causadas por chuvas intensas.";

            case "china":
            case "sudeste asiático":
                return "Eventos mais característicos em " + localUsuario + ":\n" +
                        "- Tufões frequentes.\n" +
                        "- Enchentes nas regiões costeiras.";

            default:
                return "Localidade global não reconhecida ou ainda sem registros significativos no sistema.";
        }
    }



}
