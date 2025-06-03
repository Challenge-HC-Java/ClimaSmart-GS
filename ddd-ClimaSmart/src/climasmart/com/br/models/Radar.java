package climasmart.com.br.models;

import climasmart.com.br.enums.NivelRisco;

import java.util.Arrays;
import java.util.List;

public class Radar {
    //Métodos
    public String alertas(Localizacao localizacao) {
        String mensagem = "Alertas!!\n";
        mensagem += "Você está na região " + localizacao.getRegiao() + " no estado " + localizacao.getEstado() + ".\n";
        List<String> estadosAfetados = Arrays.asList(
                "RS",
                "SC",
                "PR",
                "MG",
                "RJ",
                "ES",
                "BA",
                "CE",
                "PE",
                "RN",
                "MT",
                "MS",
                "GO",
                "PA",
                "AM",
                "RO",
                "SP"
        );
        String estado = localizacao.getEstado();
        boolean estadoEstaNaLista = estadosAfetados.stream()
                .anyMatch(e -> e.equalsIgnoreCase(estado));
        if (estadoEstaNaLista) {
            System.out.println(estado + " é um dos estados mais afetados por eventos climáticos extremos.");
            System.out.println("O nível de risco desse estado é " + NivelRisco.EXTREMO);
        } else {
            System.out.println(estado + " não está entre os estados mais afetados.");
            System.out.println("O nível de risco desse estado é " + NivelRisco.MODERADO);
        }
        return mensagem;
    }
}