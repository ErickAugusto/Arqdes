package templateTexto;

import java.util.Scanner;

public class TextoTeste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ConverteTexto converte = new ConverteTexto();
		
		System.out.println("Digite qualquer texto.");
		String textoEntrada = scanner.nextLine();
		scanner.close();
		
		converte.transformar(textoEntrada);
	}

}
