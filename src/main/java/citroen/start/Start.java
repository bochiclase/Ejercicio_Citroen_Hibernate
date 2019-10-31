package citroen.start;

import citroen.modelo.categoria.CreateCategoria;
import citroen.modelo.coche.CreateCoche;
import citroen.modelo.concesionario.CreateConcesionario;
import citroen.modelo.taller.CreateTaller;
import citroen.modelo.trabajdor.CreateTrabajador;
import citroen.negocio.CategoriaBean;
import citroen.negocio.CocheBean;
import citroen.negocio.ConcesionarioBean;
import citroen.negocio.TallerBean;
import citroen.negocio.TrabajadorBean;


public class Start {

	public static void main(String[] args) {
		
		/*CREACION DE LOS OBJETOS*/

		CocheBean coche1 = new CocheBean();
		coche1.setBastidor("67H356VF36890PSF7812");
		coche1.setModelo("C4 Picasso");
		coche1.setColor("Blanco");
		coche1.setPlazas(7);
		coche1.setCaballos(150);
		coche1.setEjes(4);
		coche1.setPrecio_mínimo_venta(19000);
		
		CocheBean coche2 = new CocheBean();
		coche2.setBastidor("689OGN59CNDH56093H45");
		coche2.setModelo("C3");
		coche2.setColor("Gris");
		coche2.setPlazas(4);
		coche2.setCaballos(90);
		coche2.setEjes(4);
		coche2.setPrecio_mínimo_venta(9000);
		
		
		
		
		
		
		
		
		TallerBean taller1 = new TallerBean();
		taller1.setMatrícula("3023JBC");
		taller1.setMarca("Alfa Romeo");
		taller1.setModelo("Gulietta");
		taller1.setColor("Rojo");
		taller1.setBastidor("AVL456920KGHS2857362BD");
		taller1.setDescripcion_Averia("Cambio de embrague");
		taller1.setPresupuesto(750);
		
		TallerBean taller2 = new TallerBean();
		taller2.setMatrícula("4958GHJ");
		taller2.setMarca("Renault");
		taller2.setModelo("Megane");
		taller2.setColor("Amarillo");
		taller2.setBastidor("1298YHN347645DC4356Y");
		taller2.setDescripcion_Averia("Cambio de correa de distribucion");
		taller2.setPresupuesto(980);
		
		
		
		
		

		TrabajadorBean trabajador1 = new TrabajadorBean();
		trabajador1.setDNI("345783094G");
		trabajador1.setNombre("Manolo");
		trabajador1.setApellidos("Garcia");
		trabajador1.setDirección("Calle General Mayor");
		trabajador1.setLocalidad("Oviedo");
		trabajador1.setProvincia("Astruias");
		trabajador1.setTeléfono("95745698");
		trabajador1.setSueldo(1200);
		
		TrabajadorBean trabajador2 = new TrabajadorBean();
		trabajador2.setDNI("349583755H");
		trabajador2.setNombre("Pedro");
		trabajador2.setApellidos("Fernandez");
		trabajador2.setDirección("Barrio Manzanares");
		trabajador2.setLocalidad("Leganes");
		trabajador2.setProvincia("Madrid");
		trabajador2.setTeléfono("9547685");
		trabajador2.setSueldo(2300);
		
		
		CategoriaBean categoria1 = new CategoriaBean();
		categoria1.setNombre("Gerente");
		categoria1.setPlus(500);
		
		CategoriaBean categoria2 = new CategoriaBean();
		categoria2.setNombre("Responsable");
		categoria2.setPlus(350);
		
		CategoriaBean categoria3 = new CategoriaBean();
		categoria3.setNombre("Jefe_Taller");
		categoria3.setPlus(250);
		
		
		CategoriaBean categoria4 = new CategoriaBean();
		categoria4.setNombre("Mecanico");
		categoria4.setPlus(100);
		
		CategoriaBean categoria5 = new CategoriaBean();
		categoria5.setNombre("Vendedor");
		categoria5.setPlus(150);
		
		CategoriaBean categoria6 = new CategoriaBean();
		categoria6.setNombre("Aprendiz");
		categoria6.setPlus(0);
	
		
		categoria1.addTrabajador(trabajador1);
		categoria4.addTrabajador(trabajador2);
		
		
		ConcesionarioBean concesonario1 = new ConcesionarioBean();
		concesonario1.setNombre("Citroen MotorSport");
		concesonario1.setCIF("948375699R");
		concesonario1.setLocalidad("Vallecas");
		concesonario1.setProvincia("Madrid");
		concesonario1.setTeléfono("943256454");
		
		ConcesionarioBean concesonario2 = new ConcesionarioBean();
		concesonario2.setNombre("Citroen Juan Jose");
		concesonario2.setCIF("98764599P");
		concesonario2.setLocalidad("Siero");
		concesonario2.setProvincia("Astruias");
		concesonario2.setTeléfono("943256027");
		
		concesonario1.addCoche(coche1);
		concesonario1.addTrabajador(trabajador2);
		concesonario1.setTaller(taller1);
		
		concesonario2.addCoche(coche2);
		concesonario2.addTrabajador(trabajador1);
		concesonario2.setTaller(taller2);
		
		
		
		
		
		

		CreateCategoria guardar_categoria = new CreateCategoria();
		guardar_categoria.create(categoria1);
		guardar_categoria.create(categoria2);
		guardar_categoria.create(categoria3);
		guardar_categoria.create(categoria4);
		guardar_categoria.create(categoria5);
		guardar_categoria.create(categoria6);
		
		System.out.println("Control");
		
		CreateConcesionario guardar_concesionarios = new CreateConcesionario();
		guardar_concesionarios.create(concesonario1);
		guardar_concesionarios.create(concesonario2);
		
		
		
		CreateTrabajador guardar_trabajadores = new CreateTrabajador();
		guardar_trabajadores.create(trabajador1);
		guardar_trabajadores.create(trabajador2);
		

		
		

		CreateTaller guardar_talleres = new CreateTaller();
		guardar_talleres.create(taller1);
		guardar_talleres.create(taller2);
		
		
		CreateCoche guardar_coches = new CreateCoche();
		guardar_coches.create(coche1);
		guardar_coches.create(coche2);
		
		
		
	}

}
