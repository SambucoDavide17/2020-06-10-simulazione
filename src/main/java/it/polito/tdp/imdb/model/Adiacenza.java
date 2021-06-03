package it.polito.tdp.imdb.model;

public class Adiacenza {
	
	private int actor1id;
	private int actor2id;
	private int peso;
	
	public Adiacenza(int actor1id, int actor2id, int peso) {
		super();
		this.actor1id = actor1id;
		this.actor2id = actor2id;
		this.peso = peso;
	}
	public int getActor1id() {
		return actor1id;
	}
	public void setActor1id(int actor1id) {
		this.actor1id = actor1id;
	}
	public int getActor2id() {
		return actor2id;
	}
	public void setActor2id(int actor2id) {
		this.actor2id = actor2id;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Attore 1: " + actor1id + ", Attore 2: " + actor2id + ", insieme: " + peso;
	}
	
	

}
