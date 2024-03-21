package aula05_estDados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrincipalArquivos {
		private static FileReader fileReader;
		private static BufferedReader bufferedReader;
		private static FileWriter fileWriter;
		private static BufferedWriter bufferedWriter;
		//private static final String FILE_IN="C:\\Users\\FATEC ZONA LESTE\\Documents\\musica.txt"; /*FILE_IN é uma constante smepre em letra maiuscula*/
		//private static final String FILE_OUT="C:\\Users\\FATEC ZONA LESTE\\Documents\\musica2.txt"; 
		
		private static final String FILE_IN="C:\\Users\\FATEC ZONA LESTE\\Documents\\entrada.txt"; 
		private static final String FILE_OUT="C:\\Users\\FATEC ZONA LESTE\\Documents\\saida.txt"; 
		public static void main(String[] args) {
			try {
				fileReader = new FileReader(FILE_IN);
				bufferedReader = new BufferedReader(fileReader);
				fileWriter = new FileWriter(FILE_OUT);
				bufferedWriter = new BufferedWriter(fileWriter);
			} catch (IOException e) {
				System.out.println(e.toString());
			}
			//exemploLeitura();
			//exemploGravacao();
			//ex1Maiusculo();
			//ex2DataSubstring();
			//ex3DataSplit();
			ex04RedeProteina();
			/*	catch (NumberFormatException e) { //pode colocar varios catches para mais de um erro no codigo
				System.out.println(e.toString());
			}
		catch (Exception e) { // classe pai de todos os tipos de Exception que vai dar um erro generico
			System.out.println(e.toString());
		}*/

	}

		

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



		private static void exemploLeitura() {
			try {
			String linha = bufferedReader.readLine();
			while(linha!=null) {
			System.out.println(linha);
			linha = bufferedReader.readLine();
			bufferedWriter.write(linha);
			}
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
			
			
		private static void exemploGravacao() {
			try {
			bufferedWriter.write("Linha 1");
			bufferedWriter.write("Linha 2");
			bufferedWriter.newLine();
			bufferedWriter.write("Linha 3");
			bufferedWriter.flush(); //vai gravar as informações no arquivo de saida um COMMIT
			}catch(IOException e) {
				e.printStackTrace();
			}
		
			
		}
		
		private static void ex1Maiusculo() {
			
			// jogar a linha 1 da musica num outro arquivo novo com letra maiuscula
			
		
			try {
				
				String linha = bufferedReader.readLine();
				while(linha!=null) {
				linha = linha.toUpperCase();
				bufferedWriter.write(linha);
				bufferedWriter.newLine();
				linha = bufferedReader.readLine();
				}
				bufferedWriter.flush();
				
				}catch(IOException e) {
					e.printStackTrace();
				}
				
		}
		
		private static void ex2DataSubstring() {
			//inverter a data maericaa=na para o brasil
			
			String exemplo= "abcdefgh";
			/*exemplo = exemplo.substring(1, 3);
			System.out.println(exemplo);*/
			String dataAmericana ="2024/03/21";
			String ano = dataAmericana.substring(0,4); //inicio 0, para no 3 por isso coloco o 4
			String mes = dataAmericana.substring(5,7);
			String dia = dataAmericana.substring(8,10);
			System.out.println(dia +"/" +mes+ "/"+ano);
		
		}
		
		private static void ex3DataSplit() {
			String dataAmericana ="2024/03/21";
			String[] datas = dataAmericana.split("/"); //passar como critério a barra, ele vai quebrar na barra e dividir em vetores o texto quebrado
			String ano = datas[0];
			String mes = datas[1];
			String dia = datas[2];
			System.out.println(dia +"/" +mes+ "/"+ano);
			
		}
		
		

}
