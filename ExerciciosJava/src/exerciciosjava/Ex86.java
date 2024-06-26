package exerciciosjava;
import java.util.Scanner;

//86) Crie um programa que leia 10 números inteiros e exiba-os em ordem crescente.

public class Ex86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número inteiro: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println(); 

        scanner.close();
    }
}
