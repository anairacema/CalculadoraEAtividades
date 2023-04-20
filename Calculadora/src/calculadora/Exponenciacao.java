package calculadora;

public class Exponenciacao extends Operacao{
	
	@Override
	public int calcular(int numero, int expoente) {
		int resultado = numero;
		
		for (int i = 0; i < expoente - 1; i++) {
			resultado *= numero;
		}
			
	return resultado;
	}

}
