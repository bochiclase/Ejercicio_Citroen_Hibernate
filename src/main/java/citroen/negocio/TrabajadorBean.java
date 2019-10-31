package citroen.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="trabajador")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TrabajadorBean {

	@Id
	@Column(name="DNI")
	private String DNI;
	@Column(name ="Nombre")
	private String Nombre;
	@Column(name ="Apellidos")
	private String Apellidos;
	@Column(name ="Direccion")
	private String Dirección;
	@Column(name ="Localidad")
	private String Localidad;
	@Column(name ="Provincia")
	private String Provincia;
	@Column(name ="Telefono")
	private String Teléfono;
	@Column(name ="Sueldo")
	private float Sueldo;
	
	
	
	
	/*RELACIONES*/
	
	/*ConcesiorarioBean*/
	@ManyToOne(cascade=CascadeType.ALL)
	private ConcesionarioBean concesionario;
	
	/*Categoria*/
	@ManyToOne(cascade=CascadeType.ALL)
	private CategoriaBean categoria;
	
	
	
	
	
	/*GETTER AND SETTER*/
	

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getDirección() {
		return Dirección;
	}

	public void setDirección(String dirección) {
		Dirección = dirección;
	}

	public String getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}

	public String getProvincia() {
		return Provincia;
	}

	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

	public String getTeléfono() {
		return Teléfono;
	}

	public void setTeléfono(String teléfono) {
		Teléfono = teléfono;
	}

	public float getSueldo() {
		return Sueldo;
	}

	public void setSueldo(float sueldo) {
		Sueldo = sueldo;
	}

	public ConcesionarioBean getConcesionario() {
		return concesionario;
	}

	public void setConcesionario(ConcesionarioBean concesionario) {
		this.concesionario = concesionario;
	}

	public CategoriaBean getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaBean categoria) {
		this.categoria = categoria;
	}
	
	

	
}
