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
}