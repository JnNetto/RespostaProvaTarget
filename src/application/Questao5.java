package application;

import java.util.Scanner;

import functions.Reverse;

public class Questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma String para reverter: ");
		String palavraNormal = sc.next();
		
		char[] charArray = palavraNormal.toCharArray();
		
		Reverse reverse = new Reverse(0, charArray.length - 1);
		
		String palavraReversa = reverse.reverseString(charArray);
		
		System.out.printf("String invertida: %s", palavraReversa);
		
		sc.close();

	}

}
