import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 48;
		double x = 10.35784;
		
		// ultimo exercicio
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
				
		System.out.print("Ola, mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		// maskara de formatação
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		// configurando a formatação virgula para ponto
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		


	}

}
