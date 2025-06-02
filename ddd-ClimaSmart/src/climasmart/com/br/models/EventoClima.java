package climasmart.com.br.models;

import climasmart.com.br.enums.NivelRisco;
import climasmart.com.br.enums.StatusAlerta;

import java.util.Scanner;

public abstract class EventoClima {
    //classe abstrata que não pode ser instanciada, aqui eu vou chamar as descrições, por exemplo
    //Seca ....
    //Atributos
    public String nome;


    protected NivelRisco nivelRisco;


    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public NivelRisco getNivelRisco() {return nivelRisco;}
    public void setNivelRisco(NivelRisco nivelRisco) {this.nivelRisco = nivelRisco;}

    //Construtor permite criar o objeto direto, já com todos os dados preenchidos.

//define que toda subclasse deve ter esse método, é abstrato pois não se pode descrever "realmente" um evento

    //método com sobreescrita
    public String explicacao() {
        return "Agora você irá ter acesso sobre o que são os eventos climáticos extremos, como surgem, quais os principais fatores que contribuem para seu aumento nos últimos anos e quais são suas características mais marcantes.";
    }



}














