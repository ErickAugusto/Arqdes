package strategyDiaSemana;

public class PainelDeMensagens {
	private final MensagemDoDia mensagem;
	
	public PainelDeMensagens(MensagemDoDia m) {
		mensagem = m;
	}
	
	public void mostarMensagem() {
		mensagem.imprime();
	}
}
