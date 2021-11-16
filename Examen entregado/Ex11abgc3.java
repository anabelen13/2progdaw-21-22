//11. Ana Belén Gil Cortés, 08/11/2021
//Programa que presente un horario de acceso a internet.
//Para cada dia de la semana se mostrara si hay acceso o no durante las 24h.
//Solicitara el dia que comienza el acceso a internet, la hora que comienza y acaba, y las horas que se van a restringir.
//Las horas en las que se limitan serán consecutivas.

public class Ex11abgc3 {
	
	public static void main (String[] args) {
    int dia;
    int hora;
    int numhoras;
    boolean error;
    
    do {
    System.out.print("Indique el día de la semana (en minúsculas): ");
    dia = Integer.parseInt(System.console().readLine());
    }
    
    do {
    System.out.print("Indique la hora de inicio (0-12): ");
    hora = Integer.parseInt(System.console().readLine());
    
    error = hora < 0 || hora > 12;
    
    if (error) System.out.print("Valor incorrecto.");
    } while (error);
    
    do {
    System.out.print("Indique el nº de horas: ");
    numhoras = Integer.parseInt(System.console().readLine());
    
    error = numhoras > 91;
    
    if (error) System.out.print("Valor incorrecto.");
    } while (error);
    
    
    System.out.println("┌───┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┐");
    System.out.println("│   │ 0│ 1│ 2│ 3│ 4│ 5│ 6│ 7│ 8│ 9│10│11│12│");
    System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
    System.out.printf(" │ L │  │  │  │  │  │  │  │  │  │  │  │  │  │");
    System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
    System.out.printf(" │ M │  │  │  │  │  │  │  │  │  │  │  │  │  │");
    System.out.prinln(" ├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
    System.out.printf(" │ X │  │  │  │  │  │  │  │  │  │  │  │  │  │");
    System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
    System.out.printf(" │ J │  │  │  │  │  │  │  │  │  │  │  │  │  │");
    System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
    System.out.printf(" │ V │  │  │  │  │  │  │  │  │  │  │  │  │  │");
    System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
    System.out.printf(" │ S │  │  │  │  │  │  │  │  │  │  │  │  │  │");
    System.out.println("├───┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤");
    System.out.printf(" │ D │  │  │  │  │  │  │  │  │  │  │  │  │  │");
    System.out.println("└───┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┘");
    
	}
}
