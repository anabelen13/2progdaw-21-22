//PIN pasado a letras

public class Ej4ExAB {
	
	public static void main (String[] args) {
		int pin;
		
		System.out.print("Introduzca el PIN: ");
		pin = Integer.parseInt(System.console().readLine());
		
		if (pin == 0){
			resultado = "cero";
		} else{
			while (pin > 0){
				int ultimaCifra = pin % 10;
				pin = pin /10;
				switch (ultimaCifra){
					case 0;
						ultimaCifra = "cero";
					case 1;
						ultimaCifra = "uno";
					case 2;
						ultimaCifra = "dos";
					case 3;
						ultimaCifra = "tres";
					case 4;
						ultimaCifra = "cuatro";
					case 5;
						ultimaCifra = "cinco";
					case 6;
						ultimaCifra = "seis";
					case 7;
						ultimaCifra = "siete";
					case 8;
						ultimaCifra = "ocho";
					case 9;
						ultimaCifra = "nueve";
					break;
					default;
				}
				resultado = resultado + " " + ultimaCifraLetra;
			}
		}
		System.out.println(resultado);
	}
}

