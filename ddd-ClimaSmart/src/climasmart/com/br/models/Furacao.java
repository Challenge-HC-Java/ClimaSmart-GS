package climasmart.com.br.models;

import climasmart.com.br.enums.NivelRisco;

public class Furacao extends EventoClima{

    //Subclasse de EventoClima, aqui tenho que descrever todas as caracterísitcas desse evento.
    @Override
    public String explicacao() {
        return "Furacão: Sistema de tempestades de grande escala, formado sobre oceanos quentes. "
                + "Possui ventos superiores a 250 km/h, ondas gigantes e alto poder destrutivo. "
                + "Sua intensidade cresce com o aquecimento dos oceanos."
                +"Sinais de que você está em uma região com risco de furação ou ciclone tropical:"
                +"Alertas meteorológicos indicando formação de ciclones.\n" +
                "\n" +
                "Céu carregado, ventos muito fortes e ondas altas no litoral.\n" +
                "\n" +
                "Queda brusca da pressão atmosférica e sensação de abafamento.\n" +
                "\n" +
                "Sons fortes de ventania e objetos sendo arrastados.";
    }



    }



