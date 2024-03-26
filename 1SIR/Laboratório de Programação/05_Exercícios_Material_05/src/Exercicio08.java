import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		
		int x, resultado;
		
		System.out.println("Digite um número de X: ");
		
		x = imput.nextInt();
		
		resultado = (x/10) % 10;
		
		System.out.println("Resultado da dezena é --> " + resultado);
		
		
		
		
		

	}

}
