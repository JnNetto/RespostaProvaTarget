package application;

import java.util.Scanner;

import functions.Fibonacci;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número para verificar se ele pertence a sequência de Fibonacci: ");
		Integer n = sc.nextInt();
		
		Fibonacci fibonacci = new Fibonacci(0, 1);
		
		if (fibonacci.isFibonacci(n)) {
			System.out.printf("O número %d pertence a sequência de Fibonacci.", n);
		} else {
			System.out.printf("O número %d não pertence a sequência de Fibonacci.", n);
		}
		
		sc.close();

	}

}
