//11. Ana Belén Gil Cortés, 08/11/2021
//Programa que dibuje una pirámide rellena porosa.
//El programa solicita al usuario la altura y caracter de la piramide.
//Se pinta un carácter de relleno sí y otro no. 

public class Ex11abgc2 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca la altura de la piramide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter de relleno: ");
    int relleno = Integer.parseInt(System.console().readLine());
    
    int planta = 1;
    int longlinea = 1;
    int espacios = altura-1;
    
    while (planta <= altura){
      
      for (int i = 0; i < espacios; i++){
        System.out.print(" ");
      }
        
      for (int j = relleno; j > 0; j--){
        System.out.print(relleno);
      }
      System.out.println();
      
    }
	}
}
