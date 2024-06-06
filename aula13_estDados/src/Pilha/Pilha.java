package Pilha;

public class Pilha {
	private int tamanho;
	private No topo;
	
	public Pilha() {
		tamanho = 0;
		topo = null;
		
		
	}
	
	public boolean estaVazia() {
		return tamanho == 0; 
		
	}
	
	public Object topo (){ 
		if(estaVazia()) {
			return null; 
		}
		return topo.info; 
	}
	

		public void empilhar(Object info) {	
			No no = new No(info); 
			no.prox = topo; 
			topo = no; 
			tamanho++; 
	}
		public Object desempilhar(){
			if(estaVazia()) {
				return null; 
			}
			Object info = topo.info;
			topo = topo.prox; 
			tamanho--;
			return info;
		}
}
