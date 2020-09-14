import java.util.Scanner;
/*
 * Fazer um programa para a eleição do Prefeito de SP. Sejam os candidatos:
 * 
 * Legenda 10) Mônica
 * Legenda 20) Cebolinha
 * Legenda 30) Cascão
 * Legenda 40) Magali
 * Legenda 0) em Branco
 * Legenda 1) Nulo
 * 
 * A legenda -1 indica o fim da eleição. Exibir o nome do candidato vencedor.
 * 
 */
public class Teste {
	public static void main (String args[]) {
		
		Scanner input = new Scanner (System.in) ;
		
		int voto;
		int Monica, Cebolinha, Cascao, Magali, Branco, Nulo;
		Monica = Cebolinha = Cascao = Magali = Branco = Nulo =0;
		
		System.out.print ("Digite o seu voto: \n(10) Monica\n(20) Cebolinha\n(30) Cascão\n(40) Magali\n(0) Em branco\n(1) Nulo\n\nOU DIGITE -1 PARA FINALIZAR A VOTAÇÃO:\n");
		voto = input.nextInt();
		
		while (voto != -1) 
		{
			switch(voto) {
			case 10: Monica += 1; break;
			case 20: Cebolinha += 1; break;
			case 30: Cascao += 1; break;
			case 40: Magali += 1; break;
			case 0: Branco += 1; break;
			case 1: Nulo += 1; break;
			default: System.out.printf ("Nenhum voto foi computado, não há candidatos com o código %d", voto); break;
			}
			
			System.out.print ("Digite o próximo voto: \n(10) Monica\n(20) Cebolinha\n(30) Cascão\n(40) Magali\n(0) Em branco\n(1) Nulo\n\nOU DIGITE -1 PARA FINALIZAR A VOTAÇÃO\n");
			voto = input.nextInt();
		}
		
		int Max;
		Max = Monica; 
		String ganhador = "Monica";
		if (Cebolinha > Max) {Max = Cebolinha; ganhador = "Cebolinha";}
		if (Cascao > Max) {Max = Cascao; ganhador = "Cascao";}
		if (Magali > Max) {Max = Magali; ganhador = "Magali";}
		
		System.out.printf ("\n-----------------------------------------------\nVOTAÇÃO FINALIZADA\n-----------------------------------------------\nCom %d votos, o(a) ganhador(a) foi %s!!!",Max,ganhador);
		System.out.printf ("\n\n\n Tabela de votos:\n\n Monica: %d votos\n Cebolinha: %d votos\n Cascao? %d votos\n Magali %d votos\n Em branco: %d votos\n Nulo: %d votos",Monica,Cebolinha,Cascao,Magali,Branco,Nulo);
	}
}