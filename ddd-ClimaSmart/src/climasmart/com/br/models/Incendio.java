package climasmart.com.br.models;

import climasmart.com.br.enums.NivelRisco;

public class Incendio extends EventoClima{
    //Subclasse de EventoClima, aqui tenho que descrever todas as caracterísitcas desse evento.
    //Método com sobrescrita
    @Override
    public String explicacao() {
        System.out.println("\n==============================\n");
        return "Incêndio Florestal: Queima descontrolada da vegetação, causada por ação humana ou fenômenos naturais. "
                + "Favorecido por altas temperaturas, baixa umidade e ventos fortes, com impactos severos no meio ambiente e na saúde."+
                "\n=============================="+
                "\n" +"Sinais de que você está em um região propícia a tr incêndios florestais:"
                +"O ar fica muito seco, com baixa umidade.\n" +
                "Sensação de calor extremo e ventos fortes.\n" +
                "Presença de fumaça no horizonte, cheiro de queimado ou fuligem no ar.\n" +
                "Animais fugindo de áreas de mata, céu acinzentado ou avermelhado.";

    }




}




