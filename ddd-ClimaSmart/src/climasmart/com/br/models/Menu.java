package climasmart.com.br.models;

import java.util.Scanner;

public class Menu {

    //Atributos

    //Métodos

    public String exibirMenu(Usuario usuario,EventoClima eventoClima, Scanner leitor) {
        System.out.println("Bem-vindo ao ClimaSmart!");
        System.out.println("\n==============================");
        System.out.println("Nossa plataforma é educacional, de prevenção e apoio, que busca ajudar pessoas e comunidades a entender, se preparar e reagir aos riscos dos eventos climáticos extremos, que estão aumentando no mundo.");
        System.out.println("\n==============================");
        System.out.println("Primeiro, realize o cadastro no nosso sistema, assim, você terá acesso livre para conhecer nossas explicações e alertas.");
        System.out.println("\n==============================");
        usuario.receberDados(leitor);
        usuario.exibirDados();

        String decisao = " ";
        while (true) {
            System.out.println("\n==============================");
            System.out.println("Nosso código possui explicações sobre o que são eventos climáticos, como tomar decisões inteligentes diante de situações extremas, " +
                    "\nquais são os principais riscos de acrodo com a sua região e também oferece apoio psicológico para que você esteja no comando das suas emoções.");
            System.out.println("\n==============================");
            System.out.println("Agora escolha dentre as opções abaixo o que você deseja ver no nosso sistema:" +
                    "\n1-O que são eventos climáticos e seus tipos" +
                    "\n2-Como reagir diante de eventos extremos " +
                    "\n3-Riscos da minha região" +
                    "\n4-Apoio psicológico");
            decisao = leitor.nextLine();
            switch (decisao){
                case "1":
                    eventoClima.explicacao();
                    System.out.println("Digite qual evento você deseja saber mais sobre: ");
                    String eventoEscolhido = leitor.nextLine();
                    if (eventoEscolhido.equalsIgnoreCase("Furacão")) {
                        Furacao furacao = new Furacao();
                        furacao.explicacao();
                    } else if (eventoEscolhido.equalsIgnoreCase("Seca")) {
                        Seca seca = new Seca();
                        seca.explicacao();
                    } else if (eventoEscolhido.equalsIgnoreCase("Enchente")) {
                        Enchente enchente = new Enchente();
                        enchente.explicacao();
                    } else if (eventoEscolhido.equalsIgnoreCase("Incêndio")) {
                        Incendio incendio = new Incendio();
                        incendio.explicacao();
                    } else {
                        System.out.println("Evento não reconhecido.");
                    }

                    System.out.println("Ótimo " + ", vamos te explicar sobre " + eventoEscolhido + "!");
                    break;


                case "2":

                case "3":

                case "4":

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }

            return "";
        }
    }


}
