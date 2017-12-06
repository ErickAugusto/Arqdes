package factoryEscritor;

public class EscritorFactory implements AbstractEscritorFactory {

	@Override
	public Escritor getEscritorInstance(int escritorType) {
		switch(escritorType) {
			case Escritor.ARQUIVO: return new EscritorArquivo();
			case Escritor.TELA: return new EscritorTela();
			default: return null;
		}
	}

}
