package climasmart.com.br.tests;

import climasmart.com.br.models.*;

public class Testes {
    public static void main(String[] args) {
        Localizacao local = new Localizacao();
        Abrigo abrigo = new Abrigo();
        Usuario usuario = new Usuario();
        System.out.println(abrigo.listarAbrigos(local));
        System.out.println();
        AlertaPsicologico alertaPsico = new AlertaPsicologico();
        System.out.println(alertaPsico.gerarAlertaPsicologico(usuario));
    }

}

