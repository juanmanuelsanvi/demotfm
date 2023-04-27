package com.jsv.tfmdemo.modelo;

public class Nodo {
	
	private Integer id;
	
	private String usuario;
	
	private String apellidos;
	
	public Nodo(Integer id, String usuario, String apellidos) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.apellidos = apellidos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Nodo [id=" + id + ", usuario=" + usuario + ", apellidos=" + apellidos + "]";
	}
	
}
