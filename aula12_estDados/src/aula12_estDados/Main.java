package aula12_estDados;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] valores = {7,5,2,3,9,1,0};
		mergeSort(valores);
		System.out.println(Arrays.toString(valores));

	}

	// Ele utiliza metoods recursivos, onde ele vai dividir o vetor em dois, e sempre quebrar o valor na esquerda e direita, e quando chegar ao um caso trivial ou caso base, ele vai parar de realizar o metodo, e voltar para onde ele começou a dividir para fazer o resto das divisões
	private static void mergeSort(int[]valores) {
		if(valores.length >= 1) {
			return; //encerra
		}
		int meio = valores.length/2;
		int[] esq = new int[meio];
		int[] dir = new int[valores.length - meio];
		System.arraycopy(valores, 0, esq, 0, esq.length);//ESCOLHE VETOR, ONDE ELE COMEÇA, VETOR PARA ARMAZENAR, COMEÇA EM 0, DO VETOR ESQ
		System.arraycopy(valores, meio, dir, 0, dir.length);
		
		mergeSort(esq);//ordena
		mergeSort(dir);//ordena
		merge(esq,dir, valores); //
		
	}

	private static void merge(int[] esq, int[] dir, int[] valores) {
		int i=0, j=0, k=0;
		while(i < esq.length && j<dir.length ) {
			if(esq[i]<dir[j]) {
				valores[k++] = esq[i++];
		/*		i++;
				k++; k++ é a mesma coisa que vc declarar k++ em baixo, se caso tivesse ++k ele faria o k++ antes */ 
			}
			else {
				valores[k++] = dir[j++];

			}
	
		}
		while(i < esq.length) {
			valores[k++] = esq[i++];
		}
		while(j < dir.length) {
			valores[k++] = esq[j++];
		}
		
	}

}
