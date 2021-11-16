//Calendario mes

public class Ej3ExA {
	
	public static void main (String[] args) {
		String mes;
		String diaSemana;
		
		int numDias = 31;
		int diaSemanaNum = 0;
		
		System.out.print("Introduce el mes (en minúsculas): ");
		mes = System.console().readLine();
		if (mes.equals("febrero")){
			System.out.print("¿Es un año bisiesto? (s/n): ");
			bisiesto = System.console().readLine().equals("s")?true:false;
		}
		
		System.out.print("Indique el día de la semana en el que empieza el mes (en minúsculas): ");
		diaSemana = System.console().readLine();
		
		switch (mes){
			case "enero";
				numDias = 31;
			case "febrero";
				if (bisiesto){
					numDias = 29;
				  } else {
					numDias = 28;}
			case "marzo";
				numDias = 31;
			case "abril";
				numDias = 30;
			case "mayo";
				numDias = 31;
			case "junio";
				numDias = 30;
			case "julio";
				numDias = 31;
			case "agosto";
				numDias = 30;
			case "septiembre";
				numDias = 30;
			case "octubre";
				numDias = 31;
			case "noviembre";
				numDias = 30;
			case "diciembre";
				numDias = 31;
			break;
			default;
		}
		switch (diaSemana){
			case "lunes";
				diaSemanaNum = 0;
			case "martes";
				diaSemanaNum = 1;
			case "miercoles";
				diaSemanaNum = 2;
			case "jueves";
				diaSemanaNum = 3;
			case "viernes";
				diaSemanaNum = 4;
			case "sabado";
				diaSemanaNum = 5;
			case "domingo";
				diaSemanaNum = 6;
			break;
			default;
		}
		/*COPIAR CALENDARIO*/
		System.out.println();
		
		System.out.println("...Fila de arriba");
		System.out.println("...Fila de días");
		
		int diaAPintar = -diaSemanaNum;
		
		while (diaPintado < numDias){
			System.out.println("...Fila de en medio");
			System.out.print("|");
			for (int i = 0; i < 7; i++){
				diaAPintar++;
				if ((diaAPintar <= 0 || diaAPintar > numDias)){
					System.out.print("   |");
				} else {
				System.out.printf("%2d |",diaAPintar);
				}
				diaAPintar++;
			}
			System.out.println();
		}
		System.out.println("...Fila ultima");
	}
}
