package citroen.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "Concesionario")
	@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

	public class ConcesionarioBean {
		@Id
		@Column(name ="Nombre")
		private String Nombre;
		@Column(name = "CIF")
		private String CIF;
		@Column(name = "Localidad")
		private String Localidad;
		@Column(name = "Provincia")
		private String Provincia;
		@Column(name = "Telefono")
		private String Teléfono;


	/* RELACIONES */
		
		
		/*Lista de coches en el concesionario*/
		
	@ManyToMany
	
	private List <CocheBean> coches = new ArrayList <CocheBean>();
	
		/*METODO DE LA RELACION*/

		public void addCoche(CocheBean coche) {
			if(!coches.contains(coche)) {
				coches.add(coche);
				
				
				List <ConcesionarioBean> concesionarios= coche.getConcesionarios();
				if(!concesionarios.contains(this)) {
					concesionarios.add(this);
					List<ConcesionarioBean> conce = coche.getConcesionarios();
					if(!conce.contains(this)) {
						conce.add(this);
						coche.setConcesionarios(conce);
					}
					}
			}
			
		}
	
		
		
		/*Añadir trabajadores al concesionario*/
	@OneToMany(mappedBy="concesionario")
	private List <TrabajadorBean> trabajadores = new ArrayList <TrabajadorBean>();
		
		/*METODO DE LA RELACION*/
	
	public void addTrabajador(TrabajadorBean trabajador) {
			if (!trabajadores.contains(trabajador)) {
				trabajadores.add(trabajador);
				trabajador.setConcesionario(this);
			}
		}
	
	

	/*Añadir al concesionario el taller*/
	
	@OneToOne
	private TallerBean taller;

	
	
	
	
	
	
	
	
	/*GETTER AND SETTER*/
	
	
	
	
	
	public String getNombre() {
		return Nombre;
	}

	


	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getCIF() {
		return CIF;
	}



	public void setCIF(String cIF) {
		CIF = cIF;
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



	public List<CocheBean> getCoches() {
		return coches;
	}



	public void setCoches(List<CocheBean> coches) {
		this.coches = coches;
	}



	public List<TrabajadorBean> getTrabajadores() {
		return trabajadores;
	}



	public void setTrabajadores(List<TrabajadorBean> trabajadores) {
		this.trabajadores = trabajadores;
	}



	public TallerBean getTaller() {
		return taller;
	}



	public void setTaller(TallerBean Taller) {
		taller = Taller;
	}
	
	
	
	
	
	
	
	
	
	}