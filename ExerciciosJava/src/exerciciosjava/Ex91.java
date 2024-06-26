package exerciciosjava;
import java.util.Scanner;

//91) Escreva um programa que leia 10 números inteiros e exiba a soma dos valores positivos e a soma dos valores negativos.

public class Ex91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número inteiro: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        int somaPositivos = 0;
        int somaNegativos = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                somaNegativos += numero;
            }
        }

        System.out.printf("Soma dos valores positivos: %d%n", somaPositivos);
        System.out.printf("Soma dos valores negativos: %d%n", somaNegativos);

        scanner.close();
	}

}
