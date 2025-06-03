package climasmart.com.br.models;

public class AlertaPsicologico {
    public String mensagemDeApoio() {
        return "Atenção: Cuidar da sua saúde mental é tão importante quanto proteger sua segurança física.\n"
                + "Situações de desastres podem gerar medo, ansiedade, tristeza e estresse.\n"
                + "Procure manter a calma, converse com familiares e amigos, respire profundamente e, se necessário, busque ajuda profissional.\n"
                + "Lembre-se: você não está sozinho. O apoio emocional salva vidas.";
    }

    public String dicasDeCuidadoMental() {
        return "- Mantenha contato com pessoas de confiança.\n"
                + "- Evite exposição excessiva a notícias que te causem estresse.\n"
                + "- Organize sua rotina, mesmo em situações de emergência.\n"
                + "- Pratique exercícios de respiração e relaxamento.\n"
                + "- Se possível, procure apoio psicológico profissional.";
    }

    public String gerarAlertaPsicologico(Usuario usuario) {
        return "Olá " + usuario.getNomeCompleto() + ",\n"
                + "Lembre-se de que sua saúde mental é essencial. Reserve um momento para cuidar de você.\n"
                + mensagemDeApoio() + "\n\n"
                + "Dicas práticas:\n" + dicasDeCuidadoMental();
    }

}
