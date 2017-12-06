package factoryEscritor;

public interface Escritor {
	final static int TELA = 1;
	final static int ARQUIVO = 2;
	void escrever(String texto);
}
