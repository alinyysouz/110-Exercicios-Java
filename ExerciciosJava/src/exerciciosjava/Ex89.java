package exerciciosjava;
import java.util.Scanner;

//89) Crie um programa que leia 10 n�meros inteiros e exiba a quantidade de n�meros positivos e a quantidade de n�meros negativos.

public class Ex89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d� n�mero inteiro: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        int quantidadePositivos = 0;
        int quantidadeNegativos = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                quantidadePositivos++;
            } else if (numero < 0) {
                quantidadeNegativos++;
            }
        }

        System.out.printf("Quantidade de n�meros positivos: %d%n", quantidadePositivos);
        System.out.printf("Quantidade de n�meros negativos: %d%n", quantidadeNegativos);

        scanner.close();
	}

}
