package ProjetoNo;

public class Fila {
	private int tamanho;
	private No inicio;
	private No fim;
	
	public Fila() {
		this.tamanho = 0;
		this.inicio = null;
		this.fim = null;
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	public Object inicio() {
		if (estaVazia()) {
			return null;
	}
		return this.inicio.info; //pode retornar nulo, acessar nulo n da
	}
	
	public void enfileirar(Object info) {
		No no = new No(info);
		if(estaVazia()) {
			this.inicio = no;
			this.fim = no;
		}else {
			this.fim.prox = no; //MANDA O FIM APONTAR PRO POR
		}
		this.fim = no;
		this.tamanho++;
		/* VAZIA = O PRIMEIRO É O INICIO E FIM
		 * NÃO VAZIA = O PRIMEIRO APONTA PRO ULTIMO 
		 */
	}
	
	public Object desinfeileirar() {
		if (estaVazia()) {
			return null;
		}else {
			
			Object info = this.inicio.info;
			this.inicio = inicio.prox; // B APONTA PRA C
			tamanho--;
			if (estaVazia()) {
				return this.fim = null;
			
			}
			return info;
		}
	}
}
