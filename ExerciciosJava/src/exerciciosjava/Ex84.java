package exerciciosjava;

import java.util.Scanner;

public class Ex84 {

	public static void main(String[] args) {
		// 84) Faça um programa que leia 5 números inteiros e exiba quantos deles são pares.
	
		
		 Scanner teclado = new Scanner(System.in);

	        int[] numeros = new int[5];
	        int Pares = 0;

	        System.out.println("Digite 5 números inteiros:");

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = teclado.nextInt();

	            if (numeros[i] % 2 == 0) {
	                Pares++;
	            }
	        }
	        
	        System.out.println("Quantidade de números pares: " + Pares);

	        teclado.close();
	
	
	
	
	}

}
