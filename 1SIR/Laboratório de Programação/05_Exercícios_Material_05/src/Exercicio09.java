import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int valor, valorInvertido;
		int centena, dezena, unidade;
		
		System.out.print("Valor com 3 dígitos (100 - 999) ");
		
		valor = in.nextInt();
		
		centena = valor / 100;
		dezena = valor % 100 /10;
		unidade = valor % 10;
		
		valorInvertido = unidade * 100 + dezena * 10 + centena;
		
		System.out.println(valor + " --> " + valorInvertido);
	
	}

}
