package calculadora;

public class Fatorial {

	public int calcular(int numero) {
		int resultado = numero;

		for (int i = 1; i <= numero; i++) {
			resultado = resultado * (numero - 1);
			numero--;
		}
		return resultado;
	}
}