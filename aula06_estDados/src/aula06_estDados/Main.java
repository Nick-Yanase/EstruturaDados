package aula06_estDados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
		private static FileReader fileReader;
		private static BufferedReader bufferedReader;
		private static FileWriter fileWriter;
		private static BufferedWriter bufferedWriter;
		//private static final String FILE_IN="C:\\Users\\FATEC ZONA LESTE\\Documents\\musica.txt"; /*FILE_IN é uma constante smepre em letra maiuscula*/
		//private static final String FILE_OUT="C:\\Users\\FATEC ZONA LESTE\\Documents\\musica2.txt"; 
		
		private static final String FILE_IN="C:\\Users\\FATEC ZONA LESTE\\Documents\\ex4_in.txt"; 
		private static final String FILE_OUT="C:\\Users\\FATEC ZONA LESTE\\Documents\\ex4_out.txt"; 
		public static void main(String[] args) {
			try {
				fileReader = new FileReader(FILE_IN);
				bufferedReader = new BufferedReader(fileReader);
				fileWriter = new FileWriter(FILE_OUT);
				bufferedWriter = new BufferedWriter(fileWriter);
			} catch (IOException e) {
				System.out.println(e.toString());
			}
			//ex01();
			//ex02();
			//ex03();
			ex04();
			//ex04RedeProteina();
			/*	catch (NumberFormatException e) { //pode colocar varios catches para mais de um erro no codigo
				System.out.println(e.toString());
			}
		catch (Exception e) { // classe pai de todos os tipos de Exception que vai dar um erro generico
			System.out.println(e.toString());
		}*/

	}

		

		private static void ex01() {
			try {
				String linha = bufferedReader.readLine();
				ArrayList<String> nomes = new ArrayList<>();
				while(linha != null) {
					nomes.add(linha);
					linha = bufferedReader.readLine();
				}
				Collections.sort(nomes);
				
				for(String nome: nomes) {
				bufferedWriter.write(nome);
				bufferedWriter.newLine();
				}
				bufferedWriter.flush();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			}
		}

		
		private static void ex02() {
			try { //
			String linha = bufferedReader.readLine();
			ArrayList<String> nomes = new ArrayList<>();
			while(linha != null) {
				nomes.add(linha);
				linha = bufferedReader.readLine(); //ele ta lendo todos os nomes do documetno e jogando no vetor nome
			}
			Collections.sort(nomes);
			for(String nome: nomes) {
				String[] colunas = nome.split(" ");
				double nota = Double.parseDouble(colunas[colunas.length-1]);//vai pegar a ultima posição contando o numero de elementos presente no vetor colunas e -1 pois queremos a sua posição em vetores que cmeça em 0 
			
				if(nota >= 7) {
				
				bufferedWriter.write(nome);
				bufferedWriter.newLine();
					}
				bufferedWriter.flush();
				}
			}catch(IOException e){
					e.printStackTrace();
				}
			}
		
		
		private static void ex03() {
			try { 
			String linha = bufferedReader.readLine();
			while(linha != null) {
				String[] colunas = linha.split("-");
				String timeCasa = colunas[0];
				String timeFora = colunas[1];
				int golCasa = Integer.parseInt(colunas[2]);
				int golFora = Integer.parseInt(colunas[3]);
				if(golCasa>golFora) 
					bufferedWriter.write(linha + "vencedor" + timeCasa);
				else if(golCasa<golFora)
					bufferedWriter.write(linha + "vencedor" + timeFora);
				else 
					bufferedWriter.write(linha + "empate");
				
			}	
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		private static void ex04() {
			try {
				String linha = bufferedReader.readLine();
				int numTimes = Integer.parseInt(linha);
				String[] nomesTime = new String[numTimes];
				int[] pontosTime = new int[numTimes];
				
				for(int i=0; i<numTimes; i++ ) {
					linha = bufferedReader.readLine();
					String nomeTime = linha.substring(2);
					nomesTime[i] = nomeTime;
				}
				linha = bufferedReader.readLine();
				int numPartidas = Integer.parseInt(linha);
				
				for(int i=0; i<numPartidas; i++ ) {
					linha = bufferedReader.readLine();
					String[] colunas = linha.split(" ");
					int codTimeCasa = Integer.parseInt(colunas[0]);
					int codTimeFora = Integer.parseInt(colunas[1]);
					int golTimeCasa = Integer.parseInt(colunas[2]);
					int golTimeFora = Integer.parseInt(colunas[3]);
					if(golTimeCasa > golTimeFora)
						pontosTime[codTimeCasa] += 3;
					
					else if(golTimeCasa < golTimeFora)
						pontosTime[codTimeFora] += 3;
					
				
					else
						pontosTime[codTimeCasa]++;
						pontosTime[codTimeFora]++;
				}
				int maiorPonto = 0;
				int indMaiorPonto = 0;
				
				for(int i=0; i<pontosTime.length; i++)
					if(pontosTime[i] > maiorPonto) {
						maiorPonto = pontosTime[i];
						indMaiorPonto = i;
					}
				
				System.out.println("Campeão: " +nomesTime[indMaiorPonto]);
				System.out.println("Pontos: " +maiorPonto);
				bufferedWriter.flush();
				
			
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			}
		}
		

			/*while(linha != null) {
				
				linha = bufferedReader.readLine();
				times.add(linha);
			}
			for(String time: times) {
				String[] colunas = time.split("-");
				String n1 = colunas[2];
				String n2 = colunas[3];
				double n01 = Double.parseDouble(colunas[2]);
				double n02 = Double.parseDouble(colunas[3]);
			}
			
			}catch(IOException e){
					e.printStackTrace();
				}
			}*/


		private static void ex04RedeProteina() {
			
			
			try {
				String linha = bufferedReader.readLine();
				while(linha != null) {
					String[] colunas = linha.split(" ");
					String p1 = colunas[0];
					String prob = colunas[1];
					String p2 = colunas[2];
					
					double probD = Double.parseDouble(prob);
					if(probD >= 0.5) {
						bufferedWriter.write(p1 + " ");
						bufferedWriter.write(probD + " ");
						bufferedWriter.write(p2);
						bufferedWriter.newLine();
					}
					linha = bufferedReader.readLine();
				}
				bufferedWriter.flush();

				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}

/*
:::: CODIGO DO PROF ::::
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	private static FileReader fileReader;
	private static BufferedReader bufferedReader;
	private static FileWriter fileWriter;
	private static BufferedWriter  bufferedWriter;
	private static final String FILE_IN = "C:\\Users\\PC\\Desktop\\ex4_in.txt";
	private static final String FILE_OUT = 
			"C:\\Users\\PC\\Desktop\\ex4_out.txt";

	public static void main(String[] args)  {
		try {
			fileReader = new FileReader(FILE_IN);
			bufferedReader = new BufferedReader(fileReader);
			fileWriter = new FileWriter(FILE_OUT);
			bufferedWriter = new BufferedWriter(fileWriter);
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}

		//ex1Ordenacao();
//		ex2NotaAcima();
//		ex3CampeonatoSimples();
		ex3Campeonato();

	}
	
	private static void ex3Campeonato() {
		try {
			String linha = bufferedReader.readLine();
			int nTimes = Integer.parseInt(linha);
			String[] nomes = new String[nTimes];
			int[] pontos = new int[nTimes];
			
			for(int i = 0; i < nTimes; i++) {
				linha = bufferedReader.readLine();
				String nome = linha.substring(2);
				nomes[i] = nome;
			}
			linha = bufferedReader.readLine();
			int nPartidas = Integer.parseInt(linha);
			for(int i = 0; i < nPartidas; i++) {
				linha = bufferedReader.readLine();
				String[] colunas = linha.split(" ");
				int codTimeCasa = Integer.parseInt(colunas[0]);
				int codTimeFora = Integer.parseInt(colunas[1]);
				int golsTimeCasa = Integer.parseInt(colunas[2]);
				int golsTimeFora = Integer.parseInt(colunas[3]);
				if(golsTimeCasa > golsTimeFora)
					pontos[codTimeCasa] += 3;
				else if(golsTimeCasa < golsTimeFora)
					pontos[codTimeFora] += 3;
				else {
					pontos[codTimeFora]++;
					pontos[codTimeCasa]++;
				}				
			}
			int maiorPonto = 0;
			int indMaiorPonto = 0;
			
			for(int i = 0; i < pontos.length; i++) {
				if(pontos[i] > maiorPonto) {
					maiorPonto = pontos[i];
					indMaiorPonto = i;
				}
			}
			System.out.println("Campeão: " + nomes[indMaiorPonto]);
			System.out.println("Pontos: " + maiorPonto);
			
			
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	private static void ex3CampeonatoSimples() {
		try {
			String linha = bufferedReader.readLine();
			while(linha != null) {
				String[] colunas = linha.split("-");
				String timeCasa = colunas[0];
				String timeFora = colunas[1];
				int golCasa = Integer.parseInt(colunas[2]);
				int golFora = Integer.parseInt(colunas[3]);
				if(golCasa > golFora)
					bufferedWriter.write(linha + " Vencedor: " + timeCasa);
				else if(golCasa < golFora)
					bufferedWriter.write(linha + " Vencedor: " + timeFora);
				else
					bufferedWriter.write(linha + " Empate");
				bufferedWriter.newLine();
				linha = bufferedReader.readLine();
			}
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	private static void ex2NotaAcima() {
		try {
			String linha = bufferedReader.readLine();
			while(linha != null) {
				String[] colunas = linha.split(" ");
				double nota = Double.parseDouble(colunas[colunas.length-1]);
				if(nota >= 7) {
					bufferedWriter.write(linha + "\n");
				}
				linha = bufferedReader.readLine();
			}
			
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	private static void ex1Ordenacao() {
		try {
			String linha = bufferedReader.readLine();
			ArrayList<String> nomes = new ArrayList<>();
			while(linha != null) {
				nomes.add(linha);
				linha = bufferedReader.readLine();
			}
			Collections.sort(nomes);
			for (String nome : nomes) {
				bufferedWriter.write(nome);
				bufferedWriter.newLine();
			}
			
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
*/
