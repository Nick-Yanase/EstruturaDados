package app;

import ProjetoNo.Pilha;

public class Main {

	public static void main(String[] args) {
		//exemplo();
		//exemplo02();
		exemplo03();
		//historico();
	}

	private static void historico() {
		Pilha pilha = new Pilha();
		pilha.empilhar("g1.com");
		pilha.empilhar("g2.com");
		pilha.empilhar("g3.com");
		
		Object info = pilha.desempilhar();
		while(info != null) {
			System.out.println(info);
			info = pilha.desempilhar();
		}
		
	}

	private static void exemplo() {
		Pilha pilha = new Pilha();
		System.out.println(pilha.estaVazia());
		pilha.empilhar("g1.com");
		pilha.empilhar("bb.com");
		System.out.println(pilha.estaVazia());
		System.out.println(pilha.topo());
		System.out.println(pilha.desempilhar());
		System.out.println(pilha.desempilhar());
		System.out.println(pilha.topo());
	}
	
	private static void exemplo02() {
		Pilha pilha = new Pilha();
		pilha.empilhar("A");
		pilha.empilhar("B");
		pilha.empilhar("C");
		pilha.empilhar("D");
		System.out.println(pilha.topo());
		System.out.println(pilha.desempilhar());
		pilha.empilhar("X");
		System.out.println(pilha.desempilhar());
		System.out.println(pilha.topo());
	}
	
	private static void exemplo03() {
		Pilha pilha = new Pilha();
		pilha.empilhar("A");
		pilha.empilhar("B");
		pilha.empilhar("C");
		pilha.empilhar("D");
		pilha.empilhar("E");
		pilha.empilhar("f");
		while(pilha.desempilhar() != null) {
		System.out.println(pilha.topo());
		System.out.println(pilha.desempilhar());
	}
	
	
	}
}
