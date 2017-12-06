package factoryEscritor;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscritorArquivo implements Escritor {

	@Override
	public void escrever(String texto){
		try {
			PrintWriter writter = new PrintWriter("arquivo.txt");
			writter.write(texto);
			writter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
