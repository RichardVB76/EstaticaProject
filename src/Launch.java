import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Estatica o Dinamica?");

		System.out.println("Que variable se esta buscando?"); // Momentum

		System.out.println("Que puntos hay en el sistema?"); // A,B,C, siendo A, la posicion 0,0

		System.out.println("El punto B se encuentra horizontalmente  ");

		System.out.println("En que punto se considerara para encontrar el momentum?"); // A

		System.out.println("Tipo de Fuerza?(Ejercida, Normal, Gravitatoria, Tension...)"); // marque todas las que
																							// aplique

		// System.out.println("Usted quiere encontrar: "+sc.nextLine());

		System.out.println(("Cuantas lineas (de un punto a otro) hay en el problema?")); // A-B, B-C ---> 2

		System.out.println("Cuantas fuerzas hay aplicadas al sistema?"); // 5

		System.out.println("De esas fuerzas, cuales ya estan definidas?"); // 3

		System.out.println("En la line A-B, cuantas fuerzas hay?"); // loop, preguntando lo mismo de cada linea

		System.out.println("Alguna de esta fuerza esta aplicada en A?"); // loop, preguntando lo mismo en el otro
																			// extremo y finalmente entre medio, las que
																			// esten en el medio tienes que especificar
																			// la distancia del mismo desde un punto de
																			// partida

		System.out.println("Cuantos soportes estan presentes?"); // 1, 0 es opcion

		System.out.println("Indica en que punot se encuentra el soporte"); // A,B,C

		System.out.println("Usted quiere encontrar:    " + sc.nextLine());

		System.out.println("You have entered" + sc.nextLine());

		// sequence1(sc.nextLine().charAt(0));
		System.out.println();
		System.out.println("Please enter a character for sequence 2:" + sc.nextLine());
		// sequence2(sc.nextLine().charAt(0));
		System.out.println();
		System.out.println("Please enter a character for sequence 3:" + sc.nextLine());
		// sequence3(sc.nextLine().charAt(0));

		sc.close();

		System.out.println("Please enter a character for sequence 8:");

	}

}
