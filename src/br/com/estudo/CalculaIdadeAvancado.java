package br.com.estudo;

import java.util.Scanner;

public class CalculaIdadeAvancado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento");
		int anoDeNascimento = scanner.nextInt();
		
		System.out.println("Digite o ano atual");
		int anoAtual = scanner.nextInt();
		
		int idade = anoAtual - anoDeNascimento; 
		
		System.out.println("Sua idade é: " + idade);
		
	
	}
}
