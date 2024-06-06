package App;

import Pilha.Pilha;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = {
				{0, 1, 0, 0, 0, 0,}, 
				{0, 0, 1, 0, 0, 0,}, 
				{0, 1, 0, 1, 0, 0,}, 
				{0, 1, 0, 0, 1, 1,}, 
				{0, 0, 0, 1, 0, 0,}, 
				{0, 0, 0, 0, 0, 1,}
				};
		boolean encontrou = buscaProfundidade(2,5, matriz);
		System.out.println(encontrou);
	}

	private static boolean buscaProfundidade(int orig, int dest, int[][] matriz) {
		int ordem = matriz.length;
		boolean[] visitados = new boolean[ordem];
		Pilha adjacentes = new Pilha();
		int vAtual = orig;
		
		adjacentes.empilhar(vAtual);
		while(!adjacentes.estaVazia()) {
			
			vAtual = (int) adjacentes.desempilhar();
			if(vAtual == dest) return true;
			visitados[vAtual] = true;
			
			for(int i = 0; i < ordem; i++) {
				if(matriz[vAtual][i] == 1 && !visitados[i]) {
					adjacentes.empilhar(i);
				}
			}
		}
		return false;
	}

}
