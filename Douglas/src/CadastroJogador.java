import java.util.Scanner;

public class CadastroJogador {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		Jogador jogador3 = new Jogador();
		Jogador jogador4 = new Jogador();

		jogador1.setNome("Ana");
		jogador1.setTime("Flamengo");

		jogador2.setNome("Joiana");
		jogador2.setTime("Fluminense");

		jogador3.setNome("Nikolas");
		jogador3.setTime("Palmeiras");

		jogador1.jogar();
		jogador2.jogar();
		jogador3.jogar();
		jogador4.jogar();
		
		
		jogador1.parar();
		jogador2.parar();
		jogador3.parar();
		jogador4.parar();
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do jogador: ");
		jogador4.setNome(s.nextLine());

		System.out.println("Digite o time do jogador: ");
		jogador4.setTime(s.nextLine());
		
		System.out.println(jogador4.getNome() + " " + jogador4.getTime());
		System.out.println(jogador1.getNome() + " " + jogador1.getTime());
		System.out.println(jogador2.getNome() + " " + jogador2.getTime());
		System.out.println(jogador3.getNome() + " " + jogador3.getTime());
	}

}
