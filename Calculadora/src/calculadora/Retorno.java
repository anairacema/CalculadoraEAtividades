package calculadora;

import java.util.Scanner;

public class Retorno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Selecione a operacao desejada: 1- Soma; 2- Subtracao; 3- Divisao; 4- Mutiplicacao; 5- Exponenciacao, 6- Fatorial");

		int escolha = scanner.nextInt();
		
		Operacao operacao = null;
		
		if (escolha == 1) {
			operacao = new Soma ();
			
			System.out.println("Digite o primeiro valor: ");
			int valor1 = scanner.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			int valor2 = scanner.nextInt();
			
			int resultado = operacao.calcular(valor1, valor2);
			
			System.out.println("Resultado da soma: " + resultado);
			
		} else if (escolha == 2) {
			operacao = new Subtracao ();
			System.out.println("Digite o primeiro valor: ");
			int valor1 = scanner.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			int valor2 = scanner.nextInt();
			
			int resultado = operacao.calcular(valor1, valor2);
			
			System.out.println("Resultado da subtração: " + resultado);
			
		} else if (escolha == 3) {
			operacao = new Divisao ();
			System.out.println("Digite o primeiro valor: ");
			int valor1 = scanner.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			int valor2 = scanner.nextInt();
			
			int resultado = operacao.calcular(valor1, valor2);
			
			System.out.println("Resultado da divisão: " + resultado);
		
		} else if (escolha == 4) {
			operacao = new Multiplicacao ();
			System.out.println("Digite o primeiro valor: ");
			int valor1 = scanner.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			int valor2 = scanner.nextInt();
			
			int resultado = operacao.calcular(valor1, valor2);
			
			System.out.println("Resultado da multiplicação: " + resultado);
		
		} else if (escolha == 5) {
			operacao = new Exponenciacao ();
			System.out.println("Digite o valor ex(1^1):");
			String valor = scanner.next();
			
			String [] numeros = valor.split("\\^");
			int numero = Integer.parseInt(numeros[0]);
			int expoente = Integer.parseInt(numeros[1]);
			
			int resultado = operacao.calcular(numero, expoente);
			
			System.out.println("Resultado da exponenciacao: " + resultado);
			
		} else if (escolha == 6) {
			Fatorial fatorial = new Fatorial ();
			System.out.println("Digite o valor ex(1!):");
			String valor = scanner.next().replace("!", "");
			
			
			int numero = Integer.parseInt(valor);
			
			
			int resultado = fatorial.calcular(numero);
			
			System.out.println("Resultado da fatorial: " + resultado);
			
		}
		
		
		
		
		
		else {
			System.out.println("Valor incorreto");
			
		}
		
		scanner.close();
		
	}

}
