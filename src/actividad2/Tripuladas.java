package actividad2;

public class Tripuladas extends VehiculoEspacial {
	
	private int capacidadTripulacion;

	public Tripuladas(String nombre, String nacionalidad, String combustible, String tiempoActividad,
			int capacidadTripulacion) {
		super(nombre, nacionalidad, combustible, tiempoActividad);
		this.capacidadTripulacion = capacidadTripulacion;
	}

	@Override
	public void despegar() {
		System.out.println("nave tripulada despegando");
	}

	@Override
	public void aterrizar() {
		System.out.println("nave tripulada aterrizando");
	}

	public int getCapacidadTripulacion() {
		return capacidadTripulacion;
	}

	public void setCapacidadTripulacion(int capacidadTripulacion) {
		this.capacidadTripulacion = capacidadTripulacion;
	}
	
	

	
	
}
