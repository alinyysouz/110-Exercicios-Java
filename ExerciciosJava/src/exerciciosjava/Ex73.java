package exerciciosjava;

import java.util.Scanner;

public class Ex73 {

	public static void main(String[] args) {
		// 73) Escreva um programa que leia um n�mero inteiro e exiba a sequ�ncia de Fibonacci at� o n�mero lido.

		 Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Digite um n�mero inteiro positivo para a sequ�ncia de Fibonacci: ");
	        int numero = scanner.nextInt();

	       
	        if (numero <= 0) {
	            System.out.println("Por favor, insira um n�mero inteiro positivo.");
	        } else {
	            System.out.println("Sequ�ncia de Fibonacci at� " + numero + ":");

	       
	            int a = 0;
	            int b = 1;

	           
	            System.out.print(a + ", " + b);

	            for (int i = 2; i <= numero; i++) {
	                int proximo = a + b;
	                System.out.print(", " + proximo);
	                a = b;
	                b = proximo;
	            }
	            System.out.println(); 
	        }
	        
	        scanner.close();

	}

}
