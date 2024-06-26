package exerciciosjava;
import java.util.Scanner;

//85) Escreva um programa que leia 5 números inteiros e exiba o maior e o menor valor digitado.

public class Ex85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número inteiro: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);

        scanner.close();
	}

}
