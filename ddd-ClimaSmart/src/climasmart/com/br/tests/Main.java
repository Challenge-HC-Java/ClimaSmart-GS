package climasmart.com.br.tests;

import climasmart.com.br.models.*;

import java.util.Scanner;

public class Main {
    static Scanner leitor = new Scanner (System.in);
    public static void main(String[] args) {
        //Instâncias
        Menu menu = new Menu();
        Usuario usuario = new Usuario();
        EventoClima furacao = new Furacao();//criando um obj da superclasse
        EventoClima seca = new Seca();
        EventoClima enchente = new Enchente();
        EventoClima incendio = new Incendio();

        //Chamando métodos
        menu.exibirMenu(usuario,enchente, leitor);

    }

}
