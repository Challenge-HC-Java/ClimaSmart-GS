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
        System.out.println("Cadastro do usuário:");
        usuario.receberDados(leitor);
        usuario.exibirDados();
        Localizacao localizacao = usuario.getLocalizacao();
        Radar radar = new Radar();
        Abrigo abrigo = new Abrigo();
        AlertaPsicologico alertaPsicologico = new AlertaPsicologico();
        String decisao = " ";
        System.out.println("\n==============================");
        System.out.println("Nosso código possui explicações sobre o que são eventos climáticos, como tomar decisões inteligentes diante de situações extremas, " +
                "\nquais são os principais riscos de acrodo com a sua região e também oferece apoio psicológico para que você esteja no comando das suas emoções.");
        System.out.println("\n==============================");
        System.out.println(localizacao.impactoMudancasClimaticas());
        while (true) {
            System.out.println("Agora escolha dentre as opções abaixo o que você deseja ver no nosso sistema:" +
                    "\n1-O que são eventos climáticos e seus tipos" +
                    "\n2-Como reagir diante de eventos extremos " +
                    "\n3-Riscos da minha região" +
                    "\n4-Apoio psicológico" +
                    "\n5-Impactos climáticos no mundo" +
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
                        System.out.println("Ótimo " + usuario.getNomeCompleto() + ", vamos te explicar sobre " + eventoEscolhido + "!");
                        Furacao furacao = new Furacao();
                        System.out.println(furacao.explicacao());
                    } else if (eventoEscolhido.equalsIgnoreCase("Seca")) {
                        System.out.println("Ótimo " + usuario.getNomeCompleto() + ", vamos te explicar sobre " + eventoEscolhido + "!");
                        Seca seca = new Seca();
                        System.out.println(seca.explicacao());
                    } else if (eventoEscolhido.equalsIgnoreCase("Enchente")) {
                        System.out.println("Ótimo " + usuario.getNomeCompleto() + ", vamos te explicar sobre " + eventoEscolhido + "!");
                        Enchente enchente = new Enchente();
                        System.out.println(enchente.explicacao());
                    } else if (eventoEscolhido.equalsIgnoreCase("Incêndio") || eventoEscolhido.equalsIgnoreCase("Incendio")) {
                        System.out.println("Ótimo " + usuario.getNomeCompleto() + ", vamos te explicar sobre " + eventoEscolhido + "!");
                        Incendio incendio = new Incendio();
                        System.out.println(incendio.explicacao());
                    } else {
                        System.out.println("Evento não reconhecido.");
                    }
                    System.out.println("\n==============================");
                    System.out.println("Escolha outra função do nosso site ou digite 0 para sair.");
                    break;
                case "2":
                    System.out.println("Digite qual evento extremo você deseja saber como reagir (Furacão, Seca, Enchente, Incêndio): ");
                    String eventoReagir = leitor.nextLine().trim().toLowerCase();
                    switch (eventoReagir) {
                        case "furacão":
                        case "furacao":
                            Furacao furacao = new Furacao();
                            System.out.println(furacao.reagir(furacao));
                            break;
                        case "seca":
                            Seca seca = new Seca();
                            System.out.println(seca.reagir(seca));
                            break;
                        case "enchente":
                            Enchente enchente = new Enchente();
                            System.out.println(enchente.reagir(enchente));
                            break;
                        case "incêndio":
                        case "incendio":
                            Incendio incendio = new Incendio();
                            System.out.println(incendio.reagir(incendio));
                            break;
                        default:
                            System.out.println("Evento não reconhecido para reação.");
                            break;
                    }
                    System.out.println("\n==============================");
                    System.out.println("Escolha outra função do nosso site ou digite 0 para sair.");
                    break;
                case "3":
                    String pais = localizacao.getPais();
                    String estadoOuLocal = localizacao.getEstado();
                    String[] estadosBR = {
                            "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
                            "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC",
                            "SP", "SE", "TO"
                    };
                    boolean ehBrasil = pais != null && pais.equalsIgnoreCase("Brasil");
                    boolean ehEstadoBR = false;
                    if (ehBrasil && estadoOuLocal != null) {
                        for (String estadoBR : estadosBR) {
                            if (estadoBR.equalsIgnoreCase(estadoOuLocal.trim())) {
                                ehEstadoBR = true;
                                break;
                            }
                        }
                    }
                    if (ehBrasil && ehEstadoBR) {
                        localizacao.descricao();
                        System.out.println(localizacao.eventosRegioes(localizacao));
                        System.out.println(radar.alertas(localizacao));
                    } else {
                        System.out.println("\nDetectamos que você não está em uma localidade brasileira.");
                        String eventos = localizacao.eventosGlobaisPorLocal(localizacao);
                        System.out.println(eventos);
                        System.out.println("\n==============================");
                        System.out.println("Escolha outra função do nosso site ou digite 0 para sair.");
                        break;
                    }
                case "4":
                    System.out.println("\n--- Abrigos Disponíveis ---");
                    System.out.println(abrigo.listarAbrigos(usuario.getLocalizacao()));
                    System.out.println("\n--- Alerta de Apoio Psicológico ---");
                    System.out.println(alertaPsicologico.gerarAlertaPsicologico(usuario));
                    System.out.println("\n==============================");
                    System.out.println("Escolha outra função do nosso site ou digite 0 para sair.");
                    break;
                        case "5":
                            System.out.println("\n==============================");
                            System.out.println(localizacao.eventosGlobais());
                            System.out.println("Escolha outra função do nosso site ou digite 0 para sair.");
                            break;
                        default:
                            System.out.println("\nOpção inválida. Tente novamente.");
                            break;
                    }
            }
        return decisao;
    }
}