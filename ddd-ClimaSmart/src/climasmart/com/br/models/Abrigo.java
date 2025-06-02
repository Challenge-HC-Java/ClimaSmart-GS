package climasmart.com.br.models;

import java.util.Scanner;

public class Abrigo {
    //Atributos
    public String nome;
    public String endereço;
    public String publicoAlvo;

    //Construtor
    public Abrigo(String publicoAlvo, String endereço, String nome) {
        this.publicoAlvo = publicoAlvo;
        this.endereço = endereço;
        this.nome = nome;
    }

    public String explicação(Usuario usuario, Localizacao localizacao, Scanner scanner){
        return " ";
    }
    //public exibirAbrigo
}
