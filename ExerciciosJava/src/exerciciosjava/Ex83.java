package exerciciosjava;

import java.util.Scanner;

public class Ex83 {

	public static void main(String[] args) {
		// 83) Crie um programa que leia 7 n�meros inteiros e exiba a m�dia aritm�tica dos valores lidos.
	
	
		Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[7];

  
        System.out.println("Digite 7 n�meros inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("A m�dia aritm�tica dos n�meros �: " + media);

        teclado.close();
	
	
	}

}
