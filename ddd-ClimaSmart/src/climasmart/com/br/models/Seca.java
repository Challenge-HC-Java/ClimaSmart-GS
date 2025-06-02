package climasmart.com.br.models;

import climasmart.com.br.enums.NivelRisco;

public class Seca extends EventoClima{

    //Subclasse de EventoClima, aqui tenho que descrever todas as caracterísitcas desse evento.

    @Override
    public String explicacao() {
        return "Seca: Período prolongado de ausência de chuvas, causado por bloqueios atmosféricos e agravado pelo aquecimento global. "
                + "Caracteriza-se pela escassez hídrica, impactos na agricultura e aumento do risco de incêndios."
                + "Sinais de que você está em um região de seca:" +
                "Aumento da temperatura e baixa umidade do ar.\n" +
                "\n" +
                "Vegetação ressecada, rachaduras no solo e diminuição visível do nível de rios, lagos e represas.\n" +
                "\n" +
                "Maior quantidade de poeira no ar.";
    }



}
