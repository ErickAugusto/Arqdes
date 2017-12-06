package templateTexto;

public class ConverteTexto extends TextoTemplate{

	@Override
	protected void textoMaiusculo(String texto) {
		System.out.println("Texto Maiúsculo: "+ texto.toUpperCase());
	}

	@Override
	protected void textoMinusculo(String texto) {
		System.out.println("Texto Minúsculo: "+ texto.toLowerCase());
	}

	@Override
	protected void duplicaTexto(String texto) {
		System.out.println("Texto Duplicado: "+texto+texto);
	}

	@Override
	protected void inverteTexto(String texto) {
		String txtInvertido = new StringBuilder(texto).reverse().toString();
		System.out.println("Texto invertido: "+txtInvertido);
	}

}
