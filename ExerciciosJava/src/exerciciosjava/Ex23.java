package exerciciosjava;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
			String[] meses = {"janeiro", "fevereiro", "mar�o", "abril", "maio", "junho",
	                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
	int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	Scanner scanner = new Scanner(System.in);

	System.out.print("Digite o nome do m�s (em min�sculas): ");
	String mes = scanner.nextLine();
	
	
	int quantidadeDias = 0;
	for (int i = 0; i < meses.length; i++) {
	  if (mes.equals(meses[i])) {
	      quantidadeDias = dias[i];
	      break;
	  }
	}
	
	if (quantidadeDias > 0) {
	  System.out.printf("O m�s de %s possui %d dias.%n", mes, quantidadeDias);
	} else {
	  System.out.println("M�s inv�lido. Por favor, digite um m�s v�lido.");
	}
	
	
	scanner.close();
	}

}
