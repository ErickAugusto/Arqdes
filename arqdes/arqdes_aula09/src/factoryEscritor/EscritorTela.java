package factoryEscritor;

public class EscritorTela implements Escritor {

	@Override
	public void escrever(String texto) {
		System.out.println(texto);
	}
}
