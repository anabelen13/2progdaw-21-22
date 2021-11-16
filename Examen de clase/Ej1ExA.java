

public class Ej1ExA {
	
	public static void main (String[] args) {
		long anios;
		long numeroVueltas;
		
		System.out.print("Introduzca el número de años: ");
		anios = Integer.parseInt(System.console().readLine());
		
		numeroVueltas = (long)anios * 365;
		
		System.out.printf("En ese tiempo, la Tierra ha dado %d vueltas sobre sí misma.\n",numeroVueltas);
		
	}
}

