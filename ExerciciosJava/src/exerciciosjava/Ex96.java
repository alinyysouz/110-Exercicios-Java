package exerciciosjava;
import java.util.Scanner;

//96) Faça um programa que leia uma matriz 3x3 de números inteiros e exiba a matriz na tela.

public class Ex96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.printf("Digite o valor para a posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz 3x3 informada:");

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }

        scanner.close();
	}

}
