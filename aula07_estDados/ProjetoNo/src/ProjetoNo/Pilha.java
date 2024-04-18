package ProjetoNo;

public class Pilha {
	private int tamanho;
	private No topo;
	
	public Pilha() {
		tamanho = 0;
		topo = null;
		
		//é uma boa pratica pra falar que eles possuem tal valor, MAS 
	}
	
	public boolean estaVazia() {
		return tamanho == 0; //como é boolean se ele tiver return =  o valor de tamanho vai ser true, else false
		
		/*if(tamanho==0) 
			return true;
		else 
			return false;*/
	}
	
	public Object topo (){ //quer a infromação do no
		if(estaVazia()) {
			return null; //retornar null pode
		}
		return topo.info; //acessar algo null não pode
	}
	

		public void empilhar(Object info) {	
			No no = new No(info); //instancia uma classe no pra pegar o novo topo
			no.prox = topo; // topo atual vai ser o proximo
			topo = no; // recebe a nova instancia como novo topo 
			tamanho++; //aumenta pra caber a insstancia nova
	}
		public Object desempilhar(){
			if(estaVazia()) {
				return null; 
			}
			Object info = topo.info;
			topo = topo.prox; //Esse topo.prox na real vai ser o anterior
			tamanho--;
			return info;
		}
		
}
	

