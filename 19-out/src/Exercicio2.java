/*
 * 02) Elaborar um programa que declare uma matriz 
 * bidimensional que represente uma estante com 4 prateleiras 
 * e 3 compartimentos cada prateleira. Faça um programa que leia 
 * a quantidade de peças em cada compartimento de prateleira. 
 * Exiba os valores das peças por prateleira.
 */ 
import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args[]) 
	{
		
		Scanner input = new Scanner(System.in);
		int prateleira[][] = new int[4][3]; //quatro prateleiras com 3 compartimentos
		for (int prate = 0 ; prate <4 ; prate++)
		{
			for (int comp =0; comp<3; comp++)
			{
				System.out.print("Digita quantas peças tem na "+(prate+1)+"a prateleira, no "+(comp+1)+"o compartimento:\n");
				prateleira[prate][comp] = input.nextInt(); 
			}
		}
		ExibePorPrateleira(prateleira);
		System.out.print("Fim do programa");
	}

public static void ExibePorPrateleira(int arr[][]){
	int soma = 0;
	int TotalPorPrateleira[] = new int[4];
	for (int p=0 ; p<4; p++) {
		for (int c=0 ; c<3; c++) soma += arr[p][c];
		TotalPorPrateleira[p] = soma;
		soma = 0;
		}
	for (int i=0; i<4; i++) System.out.print("O total de objetos da "+(i+1)+"a prateleira é: "+TotalPorPrateleira[i]+'\n');
}


}