import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Digite o seu sexo: ");
			String sexo = scanner.nextLine();
			
			System.out.println("Digite a sua altura: ");
			Double altura = scanner.nextDouble();
			
		    Double valor = 0.0;
			if (sexo.equals( "M")) {
				valor = ((72.7*altura)-58);
			}

			else if (sexo.equals ("F")) {
				valor = ((62.1*altura)-44.7);
				
				

			}
			System.out.println(valor);
			
			scanner.close();
		}
	
}

