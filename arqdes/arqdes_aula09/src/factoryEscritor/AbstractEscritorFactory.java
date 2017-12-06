package factoryEscritor;

public interface AbstractEscritorFactory {
	
	Escritor getEscritorInstance(int escritorType);
}
