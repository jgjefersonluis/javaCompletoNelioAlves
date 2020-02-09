package triangulo;

/*
 * Calculando e mostrando a area de um triangulo
 * Area = (base * altura)/2 
 */

public class prg06 {

	public static void main(String[] args) {

		float base = 0f;
		float altura = 0f;
		float area = 0f;

		base = new Float(args[0]).floatValue();
		altura = new Float(args[1]).floatValue();

		area = (base * altura) / 2;
		System.out.println("area = " + area + "\n");

	}

}
