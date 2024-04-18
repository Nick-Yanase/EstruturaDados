package ProjetoNo;
//somente as classes que estao dentro desse packege conseguem acessar pq a classe é public
 
/*modificador: package quando n tem public, private, ou # */
class No {
	
	Object info;
	No prox; // td atributo do tipo classe, ele vem como nulo
	
	//construtor como private,fora da classe vc n pode instanciar
	 No(Object info) {
			this.info = info;
			this.prox = null;
	}
	
	/*PILHA: Last in, first out OU ultimo que entra,é o primeiro que sai
	 *ex: no histórico de navegador web 
	 * a recursividade uioliza tbm
	 * chamadas de metodos o sistema esta colocando eles em uma pilha
	 * estouro de pilha conhecido coo stack ovewflow
	 * pilha estatica,horrivel pois usaum vetor definido
	 
	 
	       
	 
class No {
	Object info;
	No prox;
	 
	  No(Object info) {
			this.info = info;
			this.prox = null;
	}
}
	 */
	
}
