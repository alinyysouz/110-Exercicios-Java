package exerciciosjava;

import java.util.Scanner;

public class Ex81 {

	public static void main(String[] args) {
		// 81) Fa�a um programa que leia 5 n�meros inteiros e exiba-os na ordem inversa em que foram digitados.

		Scanner teclado = new Scanner (System.in);
		
		int[] numeros = new int[5];
		
		System.out.println("Digite 5 n�meros inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("N�meros na ordem inversa:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        teclado.close(); 
	}

}
