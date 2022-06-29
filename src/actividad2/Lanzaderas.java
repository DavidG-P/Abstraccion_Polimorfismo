package actividad2;

public class Lanzaderas extends VehiculoEspacial {
	
	
	
	public Lanzaderas(String nombre, String nacionalidad, String combustible, String tiempoActividad,
			int peso, int empuje, int capacidadTransporte, boolean soltarCarga) {
		super(nombre, nacionalidad, combustible, tiempoActividad);
		
		this.peso = peso;
		this.empuje = empuje;
		this.capacidadTransporte = capacidadTransporte;
		this.soltarCarga = soltarCarga;
	}
	private int peso;
	private int empuje;
	private int capacidadTransporte;
	private boolean soltarCarga;
	
	
	@Override
	public void despegar() {
		System.out.println("nave lanzador despegando");
	}
	@Override
	public void aterrizar() {
		System.out.println("nave lanzador aterrizando");
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getEmpuje() {
		return empuje;
	}
	public void setEmpuje(int empuje) {
		this.empuje = empuje;
	}
	public int getCapacidadTransporte() {
		return capacidadTransporte;
	}
	public void setCapacidadTransporte(int capacidadTransporte) {
		this.capacidadTransporte = capacidadTransporte;
	}
	public boolean isSoltarCarga() {
		return soltarCarga;
	}
	public void setSoltarCarga(boolean soltarCarga) {
		this.soltarCarga = soltarCarga;
	}
	
	
	
	
	
	
	
}
