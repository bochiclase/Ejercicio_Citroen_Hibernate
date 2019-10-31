package citroen.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Categorias")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class CategoriaBean {

	
	@Id
	@Column(name="Nombre")
	private String Nombre;
	@Column(name="Plus")
	private int Plus;
	
	
	
	
	
	/*RELACIONES*/
	
	
	/*Trabajador*/
	@OneToMany(mappedBy = "categoria")
	private List <TrabajadorBean> trabajadores = new ArrayList <TrabajadorBean>();
	
	
	
	
	/*METODOS DE LAS RELACIONES*/
	
	
	/*Añadir a la lista trabajadores trabajadores*/
	 public void addTrabajador(TrabajadorBean trabajador) {
		 if (!trabajadores.contains(trabajador)) {
			 trabajadores.add(trabajador);
			 /*Añado esta categoria al trabajador*/
			 trabajador.setCategoria(this);
			
			 
		 }
	 }

	 
	 

	 
	 
	 

		
		/*GETTER AND SETTER*/
		
		 
	
	public String getNombre() {
		return Nombre;
	}





	public void setNombre(String nombre) {
		Nombre = nombre;
	}





	public int getPlus() {
		return Plus;
	}





	public void setPlus(int plus) {
		Plus = plus;
	}





	public List<TrabajadorBean> getTrabajadores() {
		return trabajadores;
	}





	public void setTrabajadores(List<TrabajadorBean> trabajadores) {
		this.trabajadores = trabajadores;
	}
	
	
	
	
}
