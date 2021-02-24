import java.util.Scanner;
public class RecebendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//A linha abaixo cria uma variável (espaço na memória)
		String nomeUsuario;
		
		
		System.out.println("Escreva seu Nome");
		// alinha abaixo receber a imformação digitada pelo teclado
		
		nomeUsuario = leitor.next();
		
		System.out.println("Obrigado por utilizar o programa, " + nomeUsuario);
		
		
		
		
		leitor.next();
		
		leitor.close();

	}

}
