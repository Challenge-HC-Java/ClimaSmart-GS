package climasmart.com.br.models;

import climasmart.com.br.enums.NivelRisco;

public class Enchente extends EventoClima{

    //Subclasse de EventoClima, aqui tenho que descrever todas as caracterísitcas desse evento.

    @Override
    public String explicacao() {

        return "Enchente: Acúmulo de água em locais secos, provocado por chuvas intensas, transbordamento de rios ou drenagem insuficiente. "
                + "Intensificado pelas mudanças climáticas e urbanização desordenada."
                +"Sinais e padrões de que você está em uma região com riscos de enchentes:"
                +"Chuvas muito intensas em pouco tempo.\n" +
                "\n" +
                "Elevação rápida do nível de rios, córregos ou canais.\n" +
                "\n" +
                "Água saindo dos bueiros, ruas alagando rapidamente.\n" +
                "\n" +
                "Sons de água corrente muito forte e presença de lama."
                +"Como reagir: "
                +"Saia imediatamente de áreas de risco, como encostas, beiras de rios, vales e baixadas.\n" +
                "\n" +
                "Nunca tente atravessar ruas alagadas, seja a pé ou de carro.\n" +
                "\n" +
                "Desligue energia elétrica, gás e água ao evacuar sua casa.\n" +
                "\n" +
                "Prepare uma mochila de emergência com documentos, água, alimentos e itens essenciais.\n" +
                "\n" +
                "Após a enchente, evite contato com a água contaminada e tenha cuidado com estruturas que possam ter sido comprometidas.";
    }



}
