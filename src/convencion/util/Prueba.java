package convencion.util;

import convencion.dao.ParticipanteDao;
import convencion.dao.ParticipanteDaoMySQL;
import convencion.model.Participante;

public class Prueba {

	public static void main(String[] args) {
		// objeto para manipular el dao
		ParticipanteDao pDao = new ParticipanteDaoMySQL();
		
		Participante n = new Participante();
		n.setEmail("email");
		n.setEstado("activo");
		n.setNombre("nombre");
		n.setTelefono("telefono");
		
		pDao.insertar(n);
 
		// imprimir los clientes
		pDao.listar().forEach(System.out::println);

		// obtner un cliente
		Participante participante = pDao.obtener(1);
		participante.setNombre("Pardo");
		//actualizar cliente
		pDao.actualizar(participante);
 /*
		// imprimir los clientes
		System.out.println("*****");
		clienteDao.obtenerClientes().forEach(System.out::println);
		*/
	}

}
