import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double primeiroValor;
		double segundoValor;
		double soma, menos, vezes, dividir;
		
		System.out.println("Digite um valor: ");
		primeiroValor = leitor.nextDouble();
		System.out.println("Digite o segundo Valor: ");
		segundoValor = leitor.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A Soma entre os dois valores é: " + soma);
		menos = primeiroValor - segundoValor;
		System.out.println("A Subtração entre os dois valores é: " + menos);
		vezes = primeiroValor * segundoValor;
		System.out.println("A Multiplicacao entre os dois valores é: " + vezes);
		dividir = primeiroValor / segundoValor;
		System.out.println("A Divisao entre os dois valores é: " + dividir);
		
	leitor.next();
		
		leitor.close();
	}

}
