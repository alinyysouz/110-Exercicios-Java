package exerciciosjava;
import java.util.Scanner;

//98) Crie um programa que leia uma matriz 3x3 de n�meros inteiros e exiba a soma dos elementos da diagonal principal.

public class Ex98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.printf("Digite o valor para a posi��o [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }


        System.out.println("\nMatriz 3x3 informada:");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagonalPrincipal);

        scanner.close();
	}

}
