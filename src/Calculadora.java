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
		System.out.println("A Soma entre os dois valores �: " + soma);
		menos = primeiroValor - segundoValor;
		System.out.println("A Subtra��o entre os dois valores �: " + menos);
		vezes = primeiroValor * segundoValor;
		System.out.println("A Multiplicacao entre os dois valores �: " + vezes);
		dividir = primeiroValor / segundoValor;
		System.out.println("A Divisao entre os dois valores �: " + dividir);
		
	leitor.next();
		
		leitor.close();
	}

}
