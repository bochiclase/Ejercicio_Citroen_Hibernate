package citroen.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Taller")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TallerBean {
	
	@Id
	@Column(name="Matricula")
	private String Matricula;
	@Column(name="Marca")
	private String Marca;
	@Column(name="Modelo")
	private String Modelo;
	@Column(name="Color")
	private String Color;
	@Column(name="Bastidor")
	private String Bastidor;
	@Column(name="Descripcion_Averia")
	private String Descripcion_Averia;
	@Column(name="Presupuesto")
	private float Presupuesto;
	
	
	
	
	/*RELACIONES*/
	/**
	 * En las relaciones OneToOne en uno de las 2 clases no hay que poner nada
	 */

	
	
	
	/*GETTER AND SETTER*/
	
	
	public String getMatrícula() {
		return Matricula;
	}
	public void setMatrícula(String matrícula) {
		Matricula = matrícula;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getBastidor() {
		return Bastidor;
	}
	public void setBastidor(String bastidor) {
		Bastidor = bastidor;
	}
	public String getDescripcion_Averia() {
		return Descripcion_Averia;
	}
	public void setDescripcion_Averia(String descripcion_Averia) {
		Descripcion_Averia = descripcion_Averia;
	}
	public float getPresupuesto() {
		return Presupuesto;
	}
	public void setPresupuesto(float presupuesto) {
		Presupuesto = presupuesto;
	}

	

	
	
	
	
}
