package actividad2;

import java.util.Scanner;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner esc = new Scanner(System.in);
		int opcion = 1;
		boolean salir = false;
		
		while (!salir) {

			System.out.println("escoja el tipo de vehiculo a crear:");
			System.out.println("1.- lanzadores,2.-no tripuladas,3- tripuladas,4-salir");
			opcion = esc.nextInt();

			switch (opcion) {
			case 1:
				Lanzaderas objLanzador = new Lanzaderas("Saturno V","EE.UU","H(liq) + O(liq)","1967-1973",2900,3500,118,true);
				System.out.println("Nombre: " + objLanzador.getNombre()); 
				System.out.println("Nacionalidad: " + objLanzador.getNacionalidad());
				System.out.println("Combustible: " + objLanzador.getCombustible());
				System.out.println("Tiempo de Actividad: " + objLanzador.getTiempoActividad());
				System.out.println("Peso en toneladas: " + objLanzador.getPeso());
				System.out.println("Empuje en toneladas: " + objLanzador.getEmpuje());
				System.out.println("Capacidad de Carga en toneladas: " + objLanzador.getCapacidadTransporte());
				System.out.println("Capacidad para soltar carga: " + objLanzador.isSoltarCarga());
				break;
			case 2:
				NoTripuladas objNotripuladas = new NoTripuladas("Mariner IV","EE.UU NASA","","1965-Act.");
				System.out.println("Nombre: " + objNotripuladas.getNombre());
				System.out.println("Nacionalidad: " + objNotripuladas.getNacionalidad());
				System.out.println("Combustible: " + objNotripuladas.getCombustible());
				System.out.println("Tiempo de Actividad: " + objNotripuladas.getTiempoActividad());
				
				break;
			case 3:
				Tripuladas objTripulados = new Tripuladas("Apolo","EE.UU","NO4 + UDMH","1966-1975",3);
				System.out.println("Nombre: " + objTripulados.getNombre());
				System.out.println("Nacionalidad: " + objTripulados.getNacionalidad());
				System.out.println("Combustible: " + objTripulados.getCombustible());
				System.out.println("Tiempo de Actividad: " + objTripulados.getTiempoActividad());
				System.out.println("Capacidad de Tripulacion: " + objTripulados.getCapacidadTripulacion());
				
				break;
			case 4:
				salir = true;
				System.out.println("Fin del Programa");
				break;
			default:
				System.out.println("Opcion Incorrecta");
			}
			
		
		}
		esc.close();
	}
}
