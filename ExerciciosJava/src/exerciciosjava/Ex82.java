package exerciciosjava;

import java.util.Scanner;

public class Ex82 {

	public static void main(String[] args) {
		// 82) Escreva um programa que leia 10 n�meros inteiros e exiba a soma deles.
	
	
	      Scanner teclado = new Scanner(System.in);

	        
	        int[] numeros = new int[10];

	        System.out.println("Digite 10 n�meros inteiros:");

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("N�mero " + (i + 1) + ": ");
	            numeros[i] = teclado.nextInt();
	        }
	        
	        int soma = 0;
	        
	        for (int i = 0; i < numeros.length; i++) {
	            soma += numeros[i];
	        }

	        System.out.println("A soma dos n�meros �: " + soma);

	        teclado.close();
	
	
	
	
	
	
	}

}
