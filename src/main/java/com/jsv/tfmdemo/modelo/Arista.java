package com.jsv.tfmdemo.modelo;

import org.gephi.graph.api.Edge;
import org.gephi.graph.api.Node;

public class Arista 
{
	private Integer source;

	private Integer foro;

	private Integer asignatura;	

	private Integer numcaracteres;

	private String fechaEnvio;
	
	private Integer target;	

	public Arista() {}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Integer getForo() {
		return foro;
	}

	public void setForo(Integer foro) {
		this.foro = foro;
	}

	public Integer getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Integer asignatura) {
		this.asignatura = asignatura;
	}

	public Integer getNumcaracteres() {
		return numcaracteres;
	}

	public void setNumcaracteres(Integer numcaracteres) {
		this.numcaracteres = numcaracteres;
	}

	public String getFechaEnvio() {
		return fechaEnvio;
	}

	public void setFechaenvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public Integer getTarget() {
		return target;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

	public Arista(Integer source, Integer foro, Integer asignatura, Integer numcaracteres, String fechaEnvio,
			Integer target) {
		super();
		this.source = source;
		this.foro = foro;
		this.asignatura = asignatura;
		this.numcaracteres = numcaracteres;
		this.fechaEnvio = fechaEnvio;
		this.target = target;
	}

	@Override
	public String toString() {
		return "Arista [source=" + source + ", foro=" + foro + ", asignatura=" + asignatura + ", numcaracteres="
				+ numcaracteres + ", fechaEnvio=" + fechaEnvio + ", target=" + target + "]";
	}

}
