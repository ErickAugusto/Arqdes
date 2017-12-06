package factoryEscritor;

public class Teste {

	public static void main(String[] args) {
		Teste teste = new Teste();
		String mensagem = "Hello World";
		EscritorFactory factory = new EscritorFactory();
		Escritor escritor = factory.getEscritorInstance(teste.aleatorio());
		escritor.escrever(mensagem);
	}
	
	public int aleatorio() {
		double decimal = Math.random();
		
		decimal *= 100;
		
		int inteiro = (int)decimal;
		int resto = inteiro%2;
		int resultado = resto+1;
		
		return resultado;
	}
}
