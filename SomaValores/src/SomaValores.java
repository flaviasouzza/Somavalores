import java.util.Scanner;

public class SomaValores {

	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		
		System.out.println("Digite o valor para A");
		Double a = scanner.nextDouble ();
	
		System.out.println("Digite o valor para B");
		Double b = scanner.nextDouble ();
		
		double  resultado1 = a + b; 
					
				
		
		System.out.println(" x " + resultado1);		
		
		scanner.close();
	}
}
