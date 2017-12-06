package strategyDiaSemana;

public class TesteMensagem {

	public static void main(String[] args) {
		MensagemDoDia[] mensagens = {
				new MensagemDomingo(), new MensagemSegunda(),
				new MensagemTerca(), new MensagemQuarta(),
				new MensagemQuinta(), new MensagemSexta(),
				new MensagemSabado()};
		
		PainelDeMensagens painel;
		for(MensagemDoDia mensagem:mensagens) {
			painel = new PainelDeMensagens(mensagem);
			painel.mostarMensagem();
		}
	}

}
