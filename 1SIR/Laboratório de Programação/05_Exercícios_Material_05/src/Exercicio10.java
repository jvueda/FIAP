import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner imput = new Scanner(System.in);
		
		int valorBinario, valorDecimal;
		int d1, d2, d3, d4;
		
		System.out.println("Informe um valor em binário com 4 dígitos: ");
		valorBinario = imput.nextInt();
		
		d1 = valorBinario / 1000 * 8;
		d2 = valorBinario % 1000 / 100 * 4;
		d3 = valorBinario % 100 / 10 * 2;
		d4 = valorBinario % 10 * 1;
		
		valorDecimal = d1 + d2 + d3 + d4;
		
		System.out.println(valorBinario + " --> " + valorDecimal);
		
		
       
		
		
		
		
		
		
		

	}

}
