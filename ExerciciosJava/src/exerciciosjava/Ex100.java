package exerciciosjava;
import java.util.Scanner;

//100) Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba o maior valor presente na matriz.

public class Ex100 {

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

        int maiorValor = matriz[0][0]; 

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }

        System.out.println("Matriz 3x3 informada:");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("O maior valor na matriz é: " + maiorValor);

        scanner.close();
	}

}
