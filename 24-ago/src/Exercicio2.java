import java.util.Scanner; 
public class Exercicio2 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in) ;
		

		float reais; 
		
		// 1 real = 0,18 dollars 
		double cambio, dollars;
		cambio = 0.18; 
		
		
		System.out.print ("Digite o valor em reais: ");
		reais = input.nextFloat(); 
		
		dollars = reais * cambio;
		System.out.printf("Isso sao %4.2f dolares", reais * cambio) ;

	}

}
