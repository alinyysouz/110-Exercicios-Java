package exerciciosjava;

import java.util.Scanner;

public class Ex70 {

	public static void main(String[] args) {
		// 70) Escreva um programa que leia um n�mero inteiro e exiba a tabuada desse n�mero at� o d�cimo valor.

		
		Scanner teclado = new Scanner(System.in);
		
		 System.out.print("Digite um n�mero inteiro para ver sua tabuada: ");
	        int numero = teclado.nextInt();

	        
	        System.out.println("Tabuada de " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }

	       teclado.close();
		
		
	}

}
