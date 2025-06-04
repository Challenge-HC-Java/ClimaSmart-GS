package climasmart.com.br.tests;
import climasmart.com.br.enums.NivelRisco;
import climasmart.com.br.models.*;
import java.util.Scanner;
public class Main {
    static Scanner leitor = new Scanner (System.in);
    public static void main(String[] args) {
        // Instâncias principais
        Menu menu = new Menu();
        Usuario usuario = new Usuario();
        Radar radar = new Radar();
        Abrigo abrigo = new Abrigo();
        AlertaPsicologico alertaPsicologico = new AlertaPsicologico();
        // Eventos climáticos
        EventoClima seca = new Seca();
        EventoClima enchente = new Enchente();
        EventoClima furacao = new Furacao();
        EventoClima incendio = new Incendio();
        // Coleta dados via menu
        menu.apresentacao();
        menu.cadastrarUsuario(usuario, leitor);
        Localizacao localizacao = usuario.getLocalizacao();

        String decisao = " ";
        do {
            decisao = menu.exibirMenu(usuario, leitor);
            switch (decisao) {
                case "1":
                    System.out.println("Digite qual evento você deseja saber mais sobre (Furacão, Seca, Enchente, Incêndio): ");
                    String eventoEscolhido = leitor.nextLine().trim();
                    if (eventoEscolhido.equalsIgnoreCase("Furacão") || eventoEscolhido.equalsIgnoreCase("Furacao")) {
                        System.out.println("Ótimo " + usuario.getNomeCompleto() + ", vamos te explicar sobre " + eventoEscolhido + "!");

                        System.out.println(furacao.explicacao());
                    } else if (eventoEscolhido.equalsIgnoreCase("Seca")) {
                        System.out.println("Ótimo " + usuario.getNomeCompleto() + ", vamos te explicar sobre " + eventoEscolhido + "!");

                        System.out.println(seca.explicacao());
                    } else if (eventoEscolhido.equalsIgnoreCase("Enchente")) {
                        System.out.println("Ótimo " + usuario.getNomeCompleto() + ", vamos te explicar sobre " + eventoEscolhido + "!");

                        System.out.println(enchente.explicacao());
                    } else if (eventoEscolhido.equalsIgnoreCase("Incêndio") || eventoEscolhido.equalsIgnoreCase("Incendio")) {
                        System.out.println("Ótimo " + usuario.getNomeCompleto() + ", vamos te explicar sobre " + eventoEscolhido + "!");

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
                            System.out.println(furacao.reagir());
                            break;
                        case "seca":
                            System.out.println(seca.reagir());
                            break;
                        case "enchente":
                            System.out.println(enchente.reagir());
                            break;
                        case "incêndio":
                        case "incendio":
                            System.out.println(incendio.reagir());
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
                    break;
                case "4":
                    System.out.println("\n--- Abrigos Disponíveis ---");
                    System.out.println("Deseja filtrar os abrigos por algum tipo específico? (S para Sim / N para Não)");
                    String resposta = leitor.nextLine().trim();

                    if (resposta.equalsIgnoreCase("S")) {
                        System.out.println("Informe o tipo de abrigo que deseja buscar (Ex.: Ginásio, Escola, Centro): ");
                        String tipoAbrigo = leitor.nextLine().trim();

                        System.out.println(abrigo.listarAbrigos(usuario.getLocalizacao(), tipoAbrigo));
                    } else {
                        System.out.println(abrigo.listarAbrigos(usuario.getLocalizacao()));
                    }
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
                case "0":
                    menu.mensagemFinal();
                    System.out.println("\nSaindo do sistema. Obrigado por usar o ClimaSmart! ");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }while (!decisao.equals("0"));
    }
}

