package strategyOrdenacaoNumeros;

public class TesteOrdenacao {

	public static void main(String[] args) {
		int[] numeros = {20,14,57,2,14,25,7};
		
		OrdenacaoStrategy[] ordenacaoNumeros = {
				new BubbleSort(), new InsertionSort(),
				new QuickSort(), new SelectionSort()
		};
		
		OrdernarNumeros ordenar;
		for(OrdenacaoStrategy ordenaNum:ordenacaoNumeros) {
			
			ordenar = new OrdernarNumeros(ordenaNum);
			int ordenado[] = ordenar.ordenar(numeros);
			
			String nomeClasse = ordenaNum.getClass().getSimpleName();
			nomeClasse += ":";
			for(int i=0; i < ordenado.length; i++) {
				nomeClasse +=ordenado[i]+",";
			}
			System.out.println(nomeClasse);
		}
	}

}
