package exerciciosjava;
import java.util.Scanner;

//94) Escreva um programa que leia 7 n�meros inteiros e exiba apenas os n�meros pares.

public class Ex94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite o %d� n�mero inteiro: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nN�meros pares digitados:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();

        scanner.close();
	}

}
