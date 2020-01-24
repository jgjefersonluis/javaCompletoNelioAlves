package variaveis;

/*
 * PRG04.java
 * Operações binarias ( +, -, *, /)
 */

public class prg04 {

	public static void main(String[] args) {

		float a = 10f;
		float b = 30f;
		float c = 50f;
		float d = 80f;
		float resultado = 0f;

		resultado = a + b;
		System.out.println("a + b = " + resultado + "\n");

		resultado = c - b;
		System.out.println("c - b = " + resultado + "\n");

		resultado = d * c;
		System.out.println("d * c = " + resultado + "\n");

		resultado = d / a;
		System.out.println("d / a = " + resultado + "\n");

	}

}
