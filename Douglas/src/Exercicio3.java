import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite um numero: ");
			Double numero = scanner.nextDouble();
			
			
			if (numero % 2==0) {
				System.out.println("Numero Par");
				 
			} else
			{ 
				System.out.println ("Numero Impar");
				
			}
			
		
			
			scanner.close();
		}
            
	
}
