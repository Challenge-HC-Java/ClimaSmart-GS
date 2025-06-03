package climasmart.com.br.models;
import java.util.Scanner;
public class Menu {
    //Atributos
    //Métodos
    public String exibirMenu(Usuario usuario, Scanner leitor) {
        System.out.println("Bem-vindo ao ClimaSmart!");
        System.out.println("\n==============================");
        System.out.println("Nossa plataforma é educacional, de prevenção e apoio, que busca ajudar pessoas e comunidades a entender, se preparar e reagir aos riscos dos eventos climáticos extremos, que estão aumentando no mundo.");
        System.out.println("\n==============================");
        System.out.println("Primeiro, realize o cadastro no nosso sistema, assim, você terá acesso livre para conhecer nossas explicações e alertas.");
        System.out.println("\n==============================");
        usuario.receberDados(leitor);
        usuario.exibirDados();
        Localizacao localizacao = new Localizacao();
        usuario.setLocalizacao(localizacao);
        Radar radar = new Radar();
        Abrigo abrigo = new Abrigo();
        AlertaPsicologico alertaPsicologico = new AlertaPsicologico();
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
                    "\n4-Apoio psicológico"+
                    "\n0 - Sair");
            decisao = leitor.nextLine();

            if (decisao.equals("0")) {
                System.out.println("Saindo do sistema. Obrigado por usar o ClimaSmart!");
                break;
            }
            switch (decisao) {
                case "1":
                    System.out.println("Digite qual evento você deseja saber mais sobre (Furacão, Seca, Enchente, Incêndio): ");
                    String eventoEscolhido = leitor.nextLine().trim();
                    if (eventoEscolhido.equalsIgnoreCase("Furacão") || eventoEscolhido.equalsIgnoreCase("Furacao")) {
                        Furacao furacao = new Furacao();
                        furacao.explicacao();
                    } else if (eventoEscolhido.equalsIgnoreCase("Seca")) {
                        Seca seca = new Seca();
                        seca.explicacao();
                    } else if (eventoEscolhido.equalsIgnoreCase("Enchente")) {
                        Enchente enchente = new Enchente();
                        enchente.explicacao();
                    } else if (eventoEscolhido.equalsIgnoreCase("Incêndio") || eventoEscolhido.equalsIgnoreCase("Incendio")) {
                        Incendio incendio = new Incendio();
                        incendio.explicacao();
                    } else {
                        System.out.println("Evento não reconhecido.");
                    }
                    System.out.println("Ótimo " + usuario.getNomeCompleto() + ", vamos te explicar sobre " + eventoEscolhido + "!");

                    break;
                case "2":
                    System.out.println("Digite qual evento extremo você deseja saber como reagir (Furacão, Seca, Enchente, Incêndio): ");
                    String eventoReagir = leitor.nextLine().trim().toLowerCase();
                    switch (eventoReagir) {
                        case "furacão":
                        case "furacao":
                            Furacao furacao = new Furacao();
                            furacao.reagir(furacao);
                            break;
                        case "seca":
                            Seca seca = new Seca();
                            seca.reagir(seca);
                            break;
                        case "enchente":
                            Enchente enchente = new Enchente();
                            enchente.reagir(enchente);
                            break;
                        case "incêndio":
                        case "incendio":
                            Incendio incendio = new Incendio();
                            incendio.reagir(incendio);
                            break;
                        default:
                            System.out.println("Evento não reconhecido para reação.");
                            break;
                    }
                    break;
                case "3":
                    localizacao.eventosRegioes();
                    radar.alertas(localizacao);
                    break;
                case "4":
                    System.out.println("\n--- Abrigos Disponíveis ---");
                    System.out.println(abrigo.listarAbrigos(usuario.getLocalizacao()));
                    System.out.println("\n--- Alerta de Apoio Psicológico ---");
                    System.out.println(alertaPsicologico.gerarAlertaPsicologico(usuario));
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        }
        return decisao;
    }
}
