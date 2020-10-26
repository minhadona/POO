/*
 * 2.	[4,0 PONTOS] Faça um programa que leia a
 *  altura e o sexo de uma pessoa, determine seu peso 
 *  ideal de acordo com as fórmulas a seguir:
 *  para homens o peso ideal é 72.7altura 58
 *  para mulheres o peso ideal é 62.1altura 44.7
 *  Nota: Faça a leitura do sexo como um 
 *  valor inteiro 1- para Homens e 2 – para Mulheres.
 *  O programa deverá repetir o processo enquanto o
 *  usuário desejar. A repetição terminará quando o 
 *  usuário digitar a altura igual a zero. No final 
 *  exibir a altura média das mulheres.
 */
import java.util.Scanner;

public class Exercicio2 
{
	public static void main (String args[]) 
	{
		Scanner input = new Scanner(System.in);
		// declarando
		int sexo, quantidade_mulheres;
		double altura, soma_alturas_mulheres, peso_ideal; 
		
		// inicializando
		sexo = 0;
		quantidade_mulheres = 0;
		altura = 0.00;
		soma_alturas_mulheres = 0.00;
		peso_ideal = 0.00;
		
		// input inicial
		System.out.println("Digite sua altura (use ponto para decimal) ou 0.00 PARA ENCERRAR O PROGRAMA");
		altura = input.nextDouble();
		System.out.println("Digite:\n1 se vc for  homem \n2 se for mulher");
		sexo = input.nextInt(); 
		// contabilização inicial
		if (sexo == 2) {
			soma_alturas_mulheres += altura;
			quantidade_mulheres += 1;
					   }
		// entrando no loop pra ter média de quantas pessoas quiser
		while (altura != 0.00) {
			peso_ideal = CalculaPesoIdeal(sexo,altura); // se a pessoa desistir na primeira pessoa, nem vai entrar no while, entao beleza
			System.out.println("Seu peso ideal para sexo "+sexo+" e altura "+altura+"m EH: "+peso_ideal);
			System.out.println("Digite sua altura (use VIRGULA para decimal) ou ZERO PARA ENCERRAR O PROGRAMA");
			altura = input.nextDouble();
			System.out.println("Digite:\n1 se vc for  homem \n2 se for mulher");
			sexo = input.nextInt();
			if (altura != 0.00 && sexo == 2) { 
				soma_alturas_mulheres += altura;
				quantidade_mulheres += 1;
											}
								}
		
		System.out.println("PROGRAMA SERA ENCERRADO");
		ExibeMediaDasMulheres(soma_alturas_mulheres, quantidade_mulheres);
	
	} // main
	
	public static double CalculaPesoIdeal(int sexo, double altura) 
	{
		double peso_ideal = 0.00; 
		switch(sexo) 
		{
		case 1: { //HOMEM
			peso_ideal = 72.7 * altura -58;
			break;
				}
		case 2: { //MULHER
			peso_ideal = 62.1 * altura - 44.7;
			break;
				}
		}
		return peso_ideal;
	}
	
	public static void ExibeMediaDasMulheres(double soma_alturas_mulheres, int quantidade_mulheres)
	{
		double media_altura_mulheres = 0.00; 
		media_altura_mulheres = soma_alturas_mulheres/quantidade_mulheres;
		if (soma_alturas_mulheres != 0.00)
			System.out.println("A MEDIA DE ALTURA DE MULHERES eh: "+media_altura_mulheres);
		else 
			System.out.println("NÃO HOUVE NENHUMA ENTRADA VÁLIDA DE ALTURA, REINICIE O PROGRAMA");
	}
}// public class
