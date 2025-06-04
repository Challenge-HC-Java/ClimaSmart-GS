package climasmart.com.br.models;
import climasmart.com.br.enums.NivelRisco;
public class Enchente extends EventoClima{
    //Método com sobrescrita
    @Override
    public String explicacao() {
        System.out.println("\n==============================\n");
        return "Enchente: Acúmulo de água em locais secos, provocado por chuvas intensas, transbordamento de rios ou drenagem insuficiente. "
                + "Intensificado pelas mudanças climáticas e urbanização desordenada."+
                "\n=============================="+
                "\nSinais e padrões de que você está em uma região com riscos de enchentes:"+
                "\n" + "Chuvas muito intensas em pouco tempo.\n" +
                "Elevação rápida do nível de rios, córregos ou canais.\n" +
                "Água saindo dos bueiros, ruas alagando rapidamente.\n" +
                "Sons de água corrente muito forte e presença de lama.";
    }
    public String reagir() {
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
}




