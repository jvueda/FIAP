import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner (System.in);
		
		double x, y, restX, restCbrt;
		
		System.out.println("Digite o valor de X");
		
		x = imput.nextDouble();
		
		restX = x - 1/2;
		restCbrt = Math.cbrt (restX);
		y = Math.sqrt (restCbrt);
		
		System.out.println("Resultado de y --> " + y);
		
		
		
		
	

	}

}
