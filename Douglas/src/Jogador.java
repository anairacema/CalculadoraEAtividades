public class Jogador {
	private String nome;
	private String time;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public void jogar(){
		System.out.println("Jogar partida    ->>>    ");
		
	}
	
	public void parar(){
		System.out.println("Parar partida    ->>>    ");
		
	}
	
	

}
