package strategyDiaSemana;

public class MensagemSabado implements MensagemDoDia {

	@Override
	public void imprime() {
		System.out.println("Hoje é sabadão!!! Dia daquela feijoada de novo ;)");
	}

}
