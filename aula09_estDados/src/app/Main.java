package app;

import estruturas.Lista;

public class Main {

	public static void main(String[] args) throws Exception {
		Lista lista = new Lista();
		lista.adicionar("a");
		lista.adicionar("b");
		lista.adicionar("c");
		lista.adicionar("d");
		lista.remover(2);
		imprimeLista(lista);
		System.out.println(" ");
		lista.remover(3);
		imprimeLista(lista);
	}

	private static void imprimeLista(Lista lista) throws Exception {
		int i = 0;
		Object info = lista.get(i);
		while(info != null) {
			System.out.println(info);
			i++;
			info = lista.get(i);
		}
		
	}

}
