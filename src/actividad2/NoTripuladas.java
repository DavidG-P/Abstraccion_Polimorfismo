package actividad2;

public class NoTripuladas extends VehiculoEspacial{

	public NoTripuladas(String nombre, String nacionalidad, String combustible, String tiempoActividad) {
		super(nombre, nacionalidad, combustible, tiempoActividad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void despegar() {
		System.out.println("nave no tripulada despegando");
	}

	@Override
	public void aterrizar() {
		System.out.println("nave no tripulada aterrizando");
	}
	

	
	
}

