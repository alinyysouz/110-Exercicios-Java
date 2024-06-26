package exerciciosjava;

import java.util.Scanner;

public class Ex83 {

	public static void main(String[] args) {
		// 83) Crie um programa que leia 7 números inteiros e exiba a média aritmética dos valores lidos.
	
	
		Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[7];

  
        System.out.println("Digite 7 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("A média aritmética dos números é: " + media);

        teclado.close();
	
	
	}

}
