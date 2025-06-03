package climasmart.com.br.models;

import climasmart.com.br.enums.NivelRisco;

import java.util.Arrays;
import java.util.List;

public class Radar {
    //aqui eu faço as previsões e depois exibo na classe    Localização
    //Métodos
    public String alertas(Localizacao localizacao) {
        String mensagem = "Alertas!!\n";
        mensagem += "Você está na região " + localizacao.getRegiao() + " no estado " + localizacao.getEstado() + ".\n";
        List<String> estadosAfetados = Arrays.asList(
                "RS", // Rio Grande do Sul
                "SC", // Santa Catarina
                "PR", // Paraná
                "MG", // Minas Gerais
                "RJ", // Rio de Janeiro
                "ES", // Espírito Santo
                "BA", // Bahia
                "CE", // Ceará
                "PE", // Pernambuco
                "RN", // Rio Grande do Norte
                "MT", // Mato Grosso
                "MS", // Mato Grosso do Sul
                "GO", // Goiás
                "PA", // Pará
                "AM", // Amazonas
                "RO", // Rondônia
                "SP"  // São Paulo
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
