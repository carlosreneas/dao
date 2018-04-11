package convencion.dao;

import java.util.List;

import convencion.model.Participante;

public class ParticipanteDaoMySQL implements ParticipanteDao {
	
	List<Participante> participantes;

	@Override
	public List<Participante> listar() {
		// TODO Auto-generated method stub
		return participantes;
	}

	@Override
	public Participante obtener(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Participante participante) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Participante participante) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Participante participante) {
		// TODO Auto-generated method stub

	}

}
