package climasmart.com.br.tests;

import climasmart.com.br.models.Localizacao;
import climasmart.com.br.models.Menu;
import climasmart.com.br.models.Usuario;

import java.util.Scanner;

public class Main {
    static Scanner leitor = new Scanner (System.in);
    public static void main(String[] args) {
        //Instâncias
        Menu menu = new Menu();
        Usuario usuario = new Usuario();


        //Chamando métodos
        menu.exibirMenu(usuario,leitor);

    }

}
