package exerciciosjava;

import java.util.Scanner;

public class Ex69 {

	public static void main(String[] args) {
		// 69) Fa�a um programa que leia 5 n�meros inteiros e exiba a m�dia aritm�tica dos valores lidos. 
	
		  Scanner teclado = new Scanner (System.in);
		  
	        int soma = 0;
	        int quantidadeNumeros = 5;

	        System.out.println("Por favor, insira " + quantidadeNumeros + " n�meros inteiros:");

	       
	        for (int i = 1; i <= quantidadeNumeros; i++) {
	            System.out.print("Digite o n�mero " + i + ": ");
	            int numero = teclado.nextInt();
	            soma += numero;  
	        }

	        double media = (double) soma / quantidadeNumeros;

	        System.out.println("A m�dia aritm�tica dos n�meros inseridos �: " + media);

	        teclado.close();
	
	
	
	
	}
	
	

}
