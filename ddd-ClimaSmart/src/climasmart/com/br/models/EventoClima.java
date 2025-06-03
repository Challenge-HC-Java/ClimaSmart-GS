package climasmart.com.br.models;
import climasmart.com.br.enums.NivelRisco;
public abstract class EventoClima {
    //Atributos
    public String nome;
    protected NivelRisco nivelRisco;
    //Getters and Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public NivelRisco getNivelRisco() {return nivelRisco;}
    public void setNivelRisco(NivelRisco nivelRisco) {this.nivelRisco = nivelRisco;}
    //Método com sobreescrita
    public abstract String explicacao();
    //Método com sobrecarga
    public String reagir(Enchente enchente) {
        return "Como reagir: "
                + "Saia imediatamente de áreas de risco, como encostas, beiras de rios, vales e baixadas.\n" +
                "\n" +
                "Nunca tente atravessar ruas alagadas, seja a pé ou de carro.\n" +
                "\n" +
                "Desligue energia elétrica, gás e água ao evacuar sua casa.\n" +
                "\n" +
                "Prepare uma mochila de emergência com documentos, água, alimentos e itens essenciais.\n" +
                "\n" +
                "Após a enchente, evite contato com a água contaminada e tenha cuidado com estruturas que possam ter sido comprometidas.";
    }
    public String reagir(Seca seca){
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
    public String reagir(Incendio incendio) {
        return "Como reagir:"
                +"Ao avistar fumaça ou fogo, avise imediatamente as autoridades (Defesa Civil, Bombeiros).\n" +
                "\n" +
                "Não tente combater incêndios grandes sozinho.\n" +
                "\n" +
                "Deixe o local rapidamente, priorizando sua segurança.\n" +
                "\n" +
                "Feche portas, janelas e qualquer entrada de ar, se estiver próximo ao fogo.\n" +
                "\n" +
                "Use panos úmidos para proteger nariz e boca contra a fumaça.\n" +
                "\n" +
                "Tenha um plano de evacuação para sua casa, propriedade ou comunidade.";
    }
    public String reagir(Furacao furacao) {
        return "Como reagir: "
                +"Siga imediatamente os alertas das autoridades e evacue, se for orientado.\n" +
                "\n" +
                "Se não houver tempo para evacuar, procure um cômodo interno, sem janelas, preferencialmente no andar mais baixo da casa.\n" +
                "\n" +
                "Estoque alimentos não perecíveis, água potável, lanternas, rádio e medicamentos.\n" +
                "\n" +
                "Desligue gás, água e energia elétrica antes de se abrigar.\n" +
                "\n" +
                "Após a passagem do furacão, só saia do abrigo quando as autoridades confirmarem que é seguro.";
    }
}
