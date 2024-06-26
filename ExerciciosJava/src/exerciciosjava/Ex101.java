package exerciciosjava;
import java.util.Scanner;

//101) Crie um programa que leia uma matriz 4x4 de números inteiros e exiba a média aritmética dos elementos.

public class Ex101 {

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

        int somaElementos = 0;
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
                somaElementos += matriz[i][j];
            }
        }

        double mediaElementos = (double) somaElementos / (4 * 4); 

        System.out.println("Matriz 4x4 informada:");
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) { 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }

        System.out.println("A média aritmética dos elementos da matriz é: " + mediaElementos);

        scanner.close();
	}

}
