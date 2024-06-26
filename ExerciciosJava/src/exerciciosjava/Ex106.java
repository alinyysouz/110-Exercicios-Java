package exerciciosjava;
import java.util.Scanner;

//106) Escreva um programa que leia duas matrizes 2x2 de números inteiros e verifique se elas são iguais.

public class Ex106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        System.out.println("Digite os valores da primeira matriz 2x2:");
        lerMatriz(scanner, matriz1);

        System.out.println("Digite os valores da segunda matriz 2x2:");
        lerMatriz(scanner, matriz2);

        boolean iguais = true;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    iguais = false;
                    break; 
                }
            }
            if (!iguais) {
                break;
            }
        }

        if (iguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }

        scanner.close();
    }

    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}
