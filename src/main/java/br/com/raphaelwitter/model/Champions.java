package br.com.raphaelwitter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="champs")
@Entity
public class Champions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String habilidades;
	private String build;
	private String counters;
	public Champions(int id, String nome, String habilidades, String build, String counters) {
		this.id = id;
		this.nome = nome;
		this.habilidades = habilidades;
		this.build = build;
		this.counters = counters;
	}
	public Champions() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	public String getCounters() {
		return counters;
	}
	public void setCounters(String counters) {
		this.counters = counters;
	}

	
	
}
