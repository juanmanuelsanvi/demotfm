package com.jsv.tfmdemo.modelo;

import java.sql.Timestamp;

public class Persona
{
		private Integer id;
		
		private String usuario;
		
		private String apellidos;

		private String nombre;

		private String email;
		
		private Timestamp fechaActualizacion;

		public Persona(String usuario, String apellidos, String nombre, String email) {
			super();
			this.usuario = usuario;
			this.apellidos = apellidos;
			this.nombre = nombre;
			this.email = email;
		}

		public Persona()
		{
			
		}
		
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Timestamp getFechaActualizacion() {
			return fechaActualizacion;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		
		@Override
		public String toString() {
			return "Persona [id=" + id + ", usuario=" + usuario + ", apellidos=" + apellidos + ", nombre=" + nombre
					+ ", email=" + email + ", fechaActualizacion=" + fechaActualizacion + "]";
		}		
	}
