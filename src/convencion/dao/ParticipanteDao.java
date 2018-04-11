package convencion.dao;

import java.util.List;

import convencion.model.Participante;

public interface ParticipanteDao {
	
	public List<Participante> listar();
	public Participante obtener(int id);
	public void insertar(Participante participante);
	public void actualizar(Participante participante);
	public void eliminar(Participante participante);

}
