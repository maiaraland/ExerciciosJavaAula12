package Exercicios1a4;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Insira o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero �: " + n1);
		}	
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior n�mero �: " + n2);
		}	
		else {
			System.out.println("O maior n�mero �: " + n3);	
		}
	System.out.println("Fim do programa!");	
	}
	
}
