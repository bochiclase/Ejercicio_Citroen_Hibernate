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
import javax.persistence.Table;

@Entity
@Table(name="coche")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CocheBean {

	@Id
	@Column(name="Bastidor")
	private String Bastidor; 
	@Column(name="Modelo")
	private String Modelo;
	@Column(name="Color")
	private String Color;
	@Column(name="Plazas")
	private int Plazas;
	@Column(name="Caballos")
	private int Caballos;
	@Column(name="Ejes")
	private int Ejes;
	@Column(name="Precio_minimo")
	private int Precio_mínimo_venta;
	
	
	/*RELACIONES*/
	
	@ManyToMany(mappedBy="coches")
	private List <ConcesionarioBean> Concesionarios = new ArrayList <ConcesionarioBean>();


	

	/*GETTER AND SETTER*/
	

	public String getBastidor() {
		return Bastidor;
	}


	public void setBastidor(String bastidor) {
		Bastidor = bastidor;
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


	public int getPlazas() {
		return Plazas;
	}


	public void setPlazas(int plazas) {
		Plazas = plazas;
	}


	public int getCaballos() {
		return Caballos;
	}


	public void setCaballos(int caballos) {
		Caballos = caballos;
	}


	public int getEjes() {
		return Ejes;
	}


	public void setEjes(int ejes) {
		Ejes = ejes;
	}


	public int getPrecio_mínimo_venta() {
		return Precio_mínimo_venta;
	}


	public void setPrecio_mínimo_venta(int precio_mínimo_venta) {
		Precio_mínimo_venta = precio_mínimo_venta;
	}


	public List<ConcesionarioBean> getConcesionarios() {
		return Concesionarios;
	}


	public void setConcesionarios(List<ConcesionarioBean> concesionarios) {
		Concesionarios = concesionarios;
	}


	





}
