import java.util.Scanner; 
public class Exercicio4 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in) ;
		
		double p1, p2, t, media;
		
		System.out.print ("Digite a nota da P1: ");
		p1 = input.nextDouble();
		
		System.out.print ("Digite a nota da P2: ");
		p2 = input.nextDouble();
		
		System.out.print ("Digite a nota do trabalho: ");
		t = input.nextDouble();
		
		media = (p1+p2+t)/3 ;
		
		System.out.printf("a media do aluno foi %2.1f",media);
	}

}
