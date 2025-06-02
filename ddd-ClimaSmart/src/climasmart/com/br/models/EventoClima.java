package climasmart.com.br.models;

import climasmart.com.br.enums.NivelRisco;

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



    public String explicacao(){
        return "Esse é um evento climático.";
    }

    public void evento(Furacao furacao){
        if (getNome().equalsIgnoreCase("Furacão")) {
            furacao.descreverEvento();
        }
    }
    public void evento(Seca seca){
        if (getNome().equalsIgnoreCase("Seca")) {
            seca.descreverEvento();
        }
    }
    public void evento(Enchente enchente){
        if (getNome().equalsIgnoreCase("Enchente")) {
            enchente.descreverEvento();
        }
    }
    public void evento(Incendio incendio){
        if (getNome().equalsIgnoreCase("Incêndio")) {
            incendio.descreverEvento();
        }
    }









}
