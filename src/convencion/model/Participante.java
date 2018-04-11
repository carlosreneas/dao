package convencion.model;

import java.io.Serializable;

public class Participante implements Serializable {
	private Integer id;
	private String nombre;
	private String telefono;
	private String email;
	private String estado;

	public Participante() {
		// TODO Auto-generated constructor stub
	}

	public Participante(Integer id, String nombre, String telefono, String email, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.estado = estado;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
