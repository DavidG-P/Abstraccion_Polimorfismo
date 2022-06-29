package actividad2;

public abstract class VehiculoEspacial {
	
	private String nombre;
	private String nacionalidad;
	private String combustible;
	private String tiempoActividad;
	
	public VehiculoEspacial(String nombre, String nacionalidad, String combustible, String tiempoActividad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.combustible = combustible;
		this.tiempoActividad = tiempoActividad;
	}
	public abstract void despegar();
	public abstract void aterrizar();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		this.nombre = name;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public String getTiempoActividad() {
		return tiempoActividad;
	}
	public void setTiempoActividad(String tiempoActividad) {
		this.tiempoActividad = tiempoActividad;
	}
	
	
}

