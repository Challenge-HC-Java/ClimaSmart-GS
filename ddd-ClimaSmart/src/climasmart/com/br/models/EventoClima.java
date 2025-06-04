package climasmart.com.br.models;
import climasmart.com.br.enums.NivelRisco;
public abstract class EventoClima {
    //Atributos
    public String nome;
    protected NivelRisco nivelRisco;
    //Getters and Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public NivelRisco getNivelRisco() {return nivelRisco;}
    public void setNivelRisco(NivelRisco nivelRisco) {this.nivelRisco = nivelRisco;}
    //Método com sobreescrita
    public abstract String explicacao();
    public abstract String reagir();




}
