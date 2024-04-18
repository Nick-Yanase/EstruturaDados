package app;

import ProjetoNo.Fila;

public class MainTeste {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enfileirar("Maria");
		fila.enfileirar("nick");
		fila.enfileirar("Kaua");
		/*int a =7;
		String situacao = (a>=7) ? "aprovado" : "reprovado"; //EXEMPLO
		
		System.out.println(fila.estaVazia() ? "vazia" : "não vazia");
		System.out.println(fila.inicio());
		System.out.println(fila.desinfeileirar());
		fila.enfileirar("Maria");
		fila.enfileirar("nick");
		fila.enfileirar("Kaua");
		System.out.println(fila.estaVazia()? "vazia" : "não vazia");
		System.out.println(fila.inicio());
		System.out.println(fila.desinfeileirar());
		System.out.println(fila.inicio());*/
		exibirFila(fila);
	}
	//crie um metodo que receba uma fula e imprima todos os elementos ate que fique vazia
	
	public static void exibirFila(Fila fila) {
		while(!fila.estaVazia()) {
			System.out.println(fila.desinfeileirar());
		}
	}

}
