package Exercicios1a4;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria é a infantil.");
		}	
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria é a juvenil.");
		}		
		else if (idade >= 18 && idade <= 15) {
				System.out.println("Sua categoria é a adulto.");
		}		
		else {
			System.out.println("Você não tem idade para entrar.");
		}
		
	}

}
