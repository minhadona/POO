import java.util.Scanner; 
public class Exercicio3 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in) ;
		
		double celsius; 
		double fahrenheit;
		
		System.out.print("Digite a temperatura em celsius: ");
		celsius = input.nextDouble(); 
		
		fahrenheit =  celsius * 1.8 + 32 ;
		
		System.out.printf("%3.2f graus celsius sao %3.2f graus fahrenheits",celsius,fahrenheit); 

		
	}
}
