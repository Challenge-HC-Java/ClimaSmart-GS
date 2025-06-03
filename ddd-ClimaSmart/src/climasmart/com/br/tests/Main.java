package climasmart.com.br.tests;

import climasmart.com.br.enums.NivelRisco;
import climasmart.com.br.models.*;

import java.util.Scanner;

public class Main {
    static Scanner leitor = new Scanner (System.in);
    public static void main(String[] args) {
        //Instâncias
        Menu menu = new Menu();
        Usuario usuario = new Usuario();
        Radar radar = new Radar();
        Localizacao local = usuario.getLocalizacao();

        // Eventos climáticos disponíveis
        EventoClima seca = new Seca();
        EventoClima enchente = new Enchente();
        EventoClima furacao = new Furacao();
        EventoClima incendio = new Incendio();

        // Coleta dados via menu
        menu.exibirMenu(usuario,leitor);










    }

}
