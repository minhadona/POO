/* 
 * 01) Elaborar um programa que declare um vetor 
 * de 20 elementos reais. O programa deve requisitar ao usu�rio 
 * um valor real a ser pesquisado no conjunto. 
 * Caso seja encontrado, deve-se exibir a mensagem de que o mesmo 
 * foi encontrado e em qual posi��o. Em caso de n�o exist�ncia, 
 * exiba mensagem apropriada.
 * 
 * 02) Elaborar um programa que declare uma matriz 
 * bidimensional que represente uma estante com 4 prateleiras 
 * e 3 compartimentos cada prateleira. Fa�a um programa que leia 
 * a quantidade de pe�as em cada compartimento de prateleira. 
 * Exiba os valores das pe�as por prateleira.
 */
import java.util.Scanner;

public class Exercicio1 {

	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int N[] = new int[20];
		for (int i=0; i<N.length ; i++) {
			N[i] = i * 2 ;
		} // atribuindo os valores p vetor como o dobro do valor do �ndice
		System.out.print("Digite o numero a ser buscado: ");
		double search_value = input.nextDouble(); 
		String encontrado = "";
		for (int i=0;i<N.length ;i++) {
			if (N[i] == search_value) {System.out.print("N�mero encontrado na "+(i+1)+"a posi��o"); encontrado = "sim"; break; }
		}
		if (encontrado != "sim") System.out.print("N�MERO N�O ENCONTRADO NO VETOR"); 
	}
	
}
