package climasmart.com.br.models;
import java.util.Scanner;
public class Menu {
    //Atributos
    //Métodos
    public void apresentacao() {
        System.out.println("\n==============================");
        System.out.println(" Bem-vindo ao ClimaSmart!");
        System.out.println("==============================");
        System.out.println("Nossa plataforma é educacional, de prevenção e apoio,");
        System.out.println("ajudando pessoas a entender, se preparar e reagir aos riscos");
        System.out.println("dos eventos climáticos extremos.");
        System.out.println("==============================\n");
    }

    public void mensagemFinal() {
        System.out.println("\nAgradecemos por usar o ClimaSmart! 🌎✨");
        System.out.println("Mantenha-se seguro e bem informado.");
    }

    public void cadastrarUsuario(Usuario usuario, Scanner leitor) {
        System.out.println("Primeiro, realize seu cadastro no sistema:");
        usuario.receberDados(leitor);
        usuario.exibirDados();
        System.out.println("\n==============================");
        System.out.println(usuario.getLocalizacao().impactoMudancasClimaticas());
        System.out.println("\n==============================");
    }

    public String exibirMenu(Usuario usuario, Scanner leitor) {
            System.out.println("\n==============================");
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - O que são eventos climáticos e seus tipos");
            System.out.println("2 - Como reagir diante de eventos extremos");
            System.out.println("3 - Riscos da minha região");
            System.out.println("4 - Apoio psicológico e abrigos");
            System.out.println("5 - Impactos climáticos no mundo");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");
            return leitor.nextLine();
    }

}
