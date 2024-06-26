package exerciciosjava;
import java.util.Scanner;

//108)Faça um programa que leia uma matriz 4x4 de números inteiros e exiba o maior valor presente em cada linha.

public class Ex108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        System.out.println("Digite os valores da matriz 4x4:");

        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Maior valor presente em cada linha:");

        for (int i = 0; i < 4; i++) { 
            int maiorValorLinha = matriz[i][0]; 

            for (int j = 1; j < 4; j++) { 
                if (matriz[i][j] > maiorValorLinha) {
                    maiorValorLinha = matriz[i][j]; 
                }
            }

            System.out.printf("Linha %d: %d\n", i, maiorValorLinha);
        }

        scanner.close();
    }
}