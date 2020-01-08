import java.util.Scanner;

public class Mainec02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else {
			System.out.println("Boa tarde!");
		}
		
		sc.close();

	}

}
