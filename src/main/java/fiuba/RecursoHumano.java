package fiuba;

public class RecursoHumano {
	
	private String nombre;
	private Boolean disponible;
	
	public RecursoHumano(String nombre){
		this.disponible = true;
		this.nombre = nombre;
	} 
	
	public boolean estaDisponible(){
		return this.disponible;
	}
	
	public void tomaLicencia(){
		this.disponible = false;
	}
	
	public void disponible(){
		this.disponible = true;
	}
	
	public String nombre(){
		return this.nombre;
	}
}
