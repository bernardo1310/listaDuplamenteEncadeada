package listaDuplamenteEncadeada;

public class listaDuplamenteEncadeada {
	private Nodo inicio;
	private Nodo fim;
	
	public void inserirInicio(int dado) {
		Nodo novo = new Nodo(dado);
		if(inicio != null) {
			inicio.setAnt(novo);
			novo.setProx(inicio);
		}
		inicio = novo;
		if(fim == null) {
			fim = novo;
		}
	}
	
	public void inserirFinal(int dado) {
		Nodo novoNodo = new Nodo(dado);
		if (fim != null) {
			fim.setProx(novoNodo);
			novoNodo.setAnt(fim);
		}
		if(inicio == null) {
			inicio=novoNodo;
		}
		fim=novoNodo;
	}
	
	
	public void removerValor(int valor) {
		Nodo aux = inicio;
		if(inicio.getDado()==valor) {
			removeInicio();
			return;
		}
		while(aux.getProx()!=null) {
			if(aux.getDado() == valor) {
				aux.getAnt().setProx(aux.getProx());
				aux.getProx().setAnt(aux.getAnt());
				return;
			}
			aux = aux.getProx();
		}
		if(fim.getDado()==valor) {
			removeFinal();
			return;
		}
		System.out.println("Valor não encontrado!");
		return;
	}
	
	
	public void removeFinal() {
		Nodo nodoRemovido = fim;
		if(fim == null)return;
		fim = fim.getAnt();
		if(fim!=null)fim.setProx(null);
		if(nodoRemovido == inicio) removeInicio();
	}
	
	public void removeInicio() {
		Nodo nodoRemovido = inicio;
		if(inicio == null) {
			return;
		}
		inicio.setProx(null);
		if(inicio!=null) {
			inicio.setAnt(null);
		}
		if(nodoRemovido == fim) {
			removeFinal();
		}
	}
	
	public String mostrarLista() {
		String lista="";
		if(inicio == null) {
			return lista;
		}
		Nodo aux = inicio;
		while (aux != null) {
			lista+= aux.getDado()+"\n";
			aux = aux.getProx();		
		}
		return lista;
	}
	
	
}
