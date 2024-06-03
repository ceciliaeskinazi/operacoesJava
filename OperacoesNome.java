import java.util.Scanner;

public class OperacoesNome {

	public static void main(String[] args) {
		Scanner ref = new Scanner (System.in);

		System.out.println("Diga algo para mim: ");
		String frase = ref.nextLine();
		
		System.out.println("Diga mais: ");
		String frase1 = ref.nextLine();
		
		String soma = frase + frase1;
		
		System.out.println("A soma das frases é: " + soma);
	}
}
