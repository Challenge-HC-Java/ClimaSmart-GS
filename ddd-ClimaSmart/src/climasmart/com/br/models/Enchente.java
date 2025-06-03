package climasmart.com.br.models;

import climasmart.com.br.enums.NivelRisco;

public class Enchente extends EventoClima{
    //Subclasse de EventoClima, aqui tenho que descrever todas as caracterísitcas desse evento.
    //Método com sobrescrita
    @Override
    public String explicacao() {
        System.out.println("\n==============================\n");
        return "Enchente: Acúmulo de água em locais secos, provocado por chuvas intensas, transbordamento de rios ou drenagem insuficiente. "
                + "Intensificado pelas mudanças climáticas e urbanização desordenada."+
                "\n=============================="+
                "Sinais e padrões de que você está em uma região com riscos de enchentes:"+
                "\n" + "Chuvas muito intensas em pouco tempo.\n" +
                "Elevação rápida do nível de rios, córregos ou canais.\n" +
                "Água saindo dos bueiros, ruas alagando rapidamente.\n" +
                "Sons de água corrente muito forte e presença de lama.";
    }
    }




