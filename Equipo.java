package TrabajoIntegrador;

public class Equipo {

	String nombre;
	String descripcion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	 public Equipo (String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
		Equipo equipo1 = new Equipo("Ardillas", "Chiquitos y Rapidos");
		Equipo equipo2 = new Equipo ("Aguilas", "Rapidos y Feroces");
}
