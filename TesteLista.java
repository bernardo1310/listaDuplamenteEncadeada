package listaDuplamenteEncadeada;

public class TesteLista {

	public static void main(String[] args) {
		listaDuplamenteEncadeada l1 = new listaDuplamenteEncadeada();
		
		l1.inserirInicio(1);
		l1.inserirInicio(5);
		l1.inserirInicio(7);
		l1.inserirInicio(0);
		
		System.out.println(l1.mostrarLista());
		l1.removeInicio();
		System.out.println("Lista após a remoção no inicio");
		System.out.println(l1.mostrarLista());
		l1.removeFinal();
		
		System.out.println("Inserindo no final");
		l1.inserirFinal(43);
		System.out.println(l1.mostrarLista());
		
		System.out.println("Removendo Valor: ");
		l1.removerValor(0);
		System.out.println(l1.mostrarLista());
	}
}
