package convencion.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import convencion.model.Participante;
import convencion.util.Conexion;

public class ParticipanteDaoMySQL implements ParticipanteDao {
	
	private Conexion cn;
	List<Participante> participantes;

	public ParticipanteDaoMySQL() {
		this.cn = Conexion.getConexion();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Participante> listar() {
		// TODO Auto-generated method stub
		String sql="select * from participante";
		participantes = new ArrayList<Participante>();
		
		try {			
			
			ResultSet res=cn.query(sql);
			while (res.next()) {
				Participante c = new Participante();
				c.setId(res.getInt(1));
				c.setNombre(res.getString(2));
				c.setEmail(res.getString(3));
				c.setTelefono(res.getString(4));
				c.setEstado(res.getString(5));
				participantes.add(c);
			}
			res.close();

		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método obtener");
			e.printStackTrace();
		}
		return participantes;
	}

	@Override
	public Participante obtener(int id) {
		// TODO Auto-generated method stub
		try {
     	   ResultSet res = cn.query("SELECT * FROM participante where id = " + id + " ");
     	   while(res.next()){
	        	    Participante participante = new Participante();
	        	    participante.setId(res.getInt("id"));
	        	    participante.setNombre(res.getString("nombre"));
	        	    participante.setEmail(res.getString("email"));
	        	    participante.setEstado(res.getString("estado"));
	        	    participante.setTelefono(res.getString("telefono"));
	        	    return participante;
     	   }
          res.close();

     	  
     	  } catch (Exception e) {
     		  System.out.println(e.getMessage());
     	   //JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
     	  }
     return null;
	}

	@Override
	public void insertar(Participante participante) {
		// TODO Auto-generated method stub
		try {
			String consulta = "INSERT INTO participante (nombre, email, telefono, estado) VALUES ('"+participante.getNombre()+"', "+ 
		 			"'" +participante.getEmail()+"','" +participante.getTelefono()+"', '"+participante.getEstado()+"')";
			System.out.println(consulta);
 		   cn.insert(consulta);

 		    
 		  } catch (SQLException e) {
 		            System.out.println(e.getMessage());
 		   //JOptionPane.showMessageDialog(null, "No se Registro la persona");
 		  }

	}

	@Override
	public void actualizar(Participante participante) {
		// TODO Auto-generated method stub
		
		String sql="UPDATE participante SET nombre='"+participante.getNombre()+"', email='"+participante.getEmail()+"', telefono='"+participante.getTelefono()+"', estado='"+participante.getEstado()+"'" +" WHERE id="+participante.getId();
		try {
			cn.insert(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}	

	}

	@Override
	public void eliminar(Participante participante) {
		// TODO Auto-generated method stub

	}

}
