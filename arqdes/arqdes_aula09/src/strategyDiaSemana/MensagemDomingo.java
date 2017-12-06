package strategyDiaSemana;

public class MensagemDomingo implements MensagemDoDia {

	@Override
	public void imprime() {
		System.out.println("Hoje é domingueira. Manda bala naquela macarronada!");
	}

}
