package exerciciosjava;

import java.util.Scanner;

public class Ex79 {

	public static void main(String[] args) {
		// 79) Escreva um programa que calcule o fatorial de um n�mero inteiro inserido pelo usu�rio.

		
		Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro para calcular o fatorial: ");
        int numero = teclado.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i; 
        }

        System.out.println("O fatorial de " + numero + " �: " + fatorial);

       teclado.close();
	}

}
