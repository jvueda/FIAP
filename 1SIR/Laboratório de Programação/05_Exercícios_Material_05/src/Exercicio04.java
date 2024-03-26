import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double salarioMinimo, qtdKw;
		double valorDoKw, valorTotal, valorComDesconto;
		DecimalFormat mascara = new DecimalFormat("#.00");
		
		System.out.print("Valor do salário mínimo --> R$ ");
		salarioMinimo = in.nextDouble();
		System.out.print("Quantidade de kilowatt consumida --> ");
		qtdKw = in.nextDouble();
		
		valorDoKw = salarioMinimo / 7 / 100;
		valorTotal = valorDoKw * qtdKw;
		valorComDesconto = valorTotal * 0.90;
		
		System.out.println("valor do kilowatt --> R$ " + mascara.format(valorDoKw));
		System.out.println("valor total a pagar --> R$ " + mascara.format(valorTotal));
		System.out.println("valor total com 10% de desconto --> R$ " + mascara.format(valorComDesconto));
		

	}
}
