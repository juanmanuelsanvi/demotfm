package com.jsv.tfmdemo.modelo;

public class Arista {
	
	private Integer source;
	
 	private Integer target;
 	
 	private String mensaje;
 	
	public Arista(Integer source, Integer target, String mensaje) {
		super();
		this.source = source;
		this.target = target;
		this.mensaje = mensaje;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getTarget() {
		return target;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Arista [source=" + source + ", target=" + target + ", mensaje=" + mensaje + "]";
	}
	
}
