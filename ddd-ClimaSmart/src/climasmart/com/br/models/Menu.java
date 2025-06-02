package climasmart.com.br.models;

import java.util.Scanner;

public class Menu {

    //Atributos

    //Métodos
    public void exibirMenu(Usuario usuario, Scanner leitor){
        System.out.println("Bem-vindo ao ClimaSmart!");
        System.out.println("Nossa plataforma é educacional, de prevenção e apoio, que busca ajudar pessoas e comunidades a entender,"+
                "se preparar e reagir aos riscos dos eventos climáticos extremos, que estão aumentando no mundo.  ");
        System.out.println("Primeiro, realize o cadastro no nosso sistema, assim, você terá acesso livre para conhecer nossas explicações e alertas.");
        usuario.receberDados(leitor);
        usuario.exibirDados();
    }
}
