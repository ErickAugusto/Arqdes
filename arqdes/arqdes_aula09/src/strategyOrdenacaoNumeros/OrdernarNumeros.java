package strategyOrdenacaoNumeros;

public class OrdernarNumeros {
	private final OrdenacaoStrategy ordenacao;
	
	public OrdernarNumeros(OrdenacaoStrategy o) {
		ordenacao = o;
	}
	
	public int[] ordenar(int v[]) {
		int ordenados[] = ordenacao.ordena(v);
		return ordenados;
	}
}
