package br.com.estudo;

import java.util.Scanner;

public class CalculaIdadeAvancadoComNome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine(); //Le o nome digitado pelo usuario 
		
		System.out.println("Digite seu ano de nascimento");
		int anoDeNascimento = sc.nextInt(); //Le o ano de nascimento 
		
		System.out.println("Digite o ano atual");
		int anoAtual = sc.nextInt(); //Le o ano atual
		
		int idade = anoAtual - anoDeNascimento; //Faz o calculo da idade atual 
		
	
		System.out.println(nome + " sua idade é: " + idade); //Imprime na tela as informacoes digitadas pelo usuario 
		
		
		//Fazer o sistema repetir ate o usuario apertar pra sair
		//Loop (laços de repetiçao) 
		//If else (condicionais)
		

	}

}
