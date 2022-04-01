package Exercicios1a4;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String [] args ) {
		
		int num, resto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		resto = num % 2;
		
		if (resto == 0) {
			System.out.println("O número " + num + " é par e a sua raiz quadrada é " + Math.sqrt(num));
		}
		else {
			System.out.println("O número " + num + " é impar e ele elevado ao quadrado é " + Math.pow(num, 2));
		}
	}
}
