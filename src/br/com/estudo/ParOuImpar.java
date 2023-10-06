package br.com.estudo;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = scanner.nextInt(); //Le o numero digitado pelo usuario 

		if (numero % 2 == 0) {		// Verifica se o numero digitado dividido por 2 tem como resto 0, confirmando que a condicao é verdadeira , portanto par
			System.out.println("Voce digitou um número par!");
		}

		else {
			System.out.println("Você digitou um número ímpar!");
		}

		scanner.close();
	}

}
