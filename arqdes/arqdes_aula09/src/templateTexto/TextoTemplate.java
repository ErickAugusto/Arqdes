package templateTexto;

public abstract class TextoTemplate {
	protected String texto;
	
	public void transformar(String texto) {
		textoMaiusculo(texto);
		textoMinusculo(texto);
		duplicaTexto(texto);
		inverteTexto(texto);
	}

	protected abstract void textoMaiusculo(String texto);

	protected abstract void textoMinusculo(String texto);

	protected abstract void duplicaTexto(String texto);
	
	protected abstract void inverteTexto(String texto);
}
