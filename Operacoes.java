import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		Scanner ref = new Scanner (System.in);

		System.out.println("Insira um número inteiro: ");
		double num = ref.nextDouble();
		
		System.out.println("Insira outro número inteiro: ");
		double numDois = ref.nextDouble();
		
		System.out.println("Insira mais um número: ");
		double numTres = ref.nextDouble();
		
		double soma = num + numDois + numTres;
		
		System.out.println("A soma dos números é: " + soma);
		
		double mult = num * numDois * numTres;
		
		System.out.println("A multiplicação dos números é: " + mult);
		
		double div = ((num / numDois)/numTres);
		
		System.out.println("A divisão dos números é: " + div);
		
		double sub = num - numDois - numTres;
		
		System.out.println("A subtração dos números é: " + sub);
	}

}
