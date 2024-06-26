package exerciciosjava;
import java.util.Scanner;

//109) Escreva um programa que leia uma matriz 3x3 de números inteiros e verifique se ela é uma matriz identidade.

public class Ex109 {

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

        boolean eIdentidade = true;

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    eIdentidade = false;
                    break; 
                }
            }
            if (!eIdentidade) {
                break; 
            }
        }

        System.out.println("\nMatriz 3x3 informada:");
        exibirMatriz(matriz);

        if (eIdentidade) {
            System.out.println("\nA matriz é uma matriz identidade.");
        } else {
            System.out.println("\nA matriz não é uma matriz identidade.");
        }

        scanner.close();
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
		}
	}
}
