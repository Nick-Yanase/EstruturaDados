package ProjetoNo;

public class No {
	
	
	Object info; //pode ser qualquer tipo
	No prox; //ponteiro que referencia a propria classe

	 No(Object info){
		this.info = info;
		this.prox = null;
	}
}

