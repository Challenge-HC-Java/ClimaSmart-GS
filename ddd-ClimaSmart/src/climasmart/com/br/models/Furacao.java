package climasmart.com.br.models;
import climasmart.com.br.enums.NivelRisco;
public class Furacao extends EventoClima{
    //Método com sobrescrita
    @Override
    public String explicacao() {
        System.out.println("\n==============================\n");
        return "Furacão: Sistema de tempestades de grande escala, formado sobre oceanos quentes. "
                + "Possui ventos superiores a 250 km/h, ondas gigantes e alto poder destrutivo. "
                + "Sua intensidade cresce com o aquecimento dos oceanos."+
                "\n=============================="+
                "Sinais de que você está em uma região com risco de furação ou ciclone tropical:"+
                "\n" +
                "Alertas meteorológicos indicando formação de ciclones.\n" +
                "Céu carregado, ventos muito fortes e ondas altas no litoral.\n" +
                "Queda brusca da pressão atmosférica e sensação de abafamento.\n" +
                "Sons fortes de ventania e objetos sendo arrastados.";
    }
    public String reagir() {
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