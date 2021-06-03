package it.polito.tdp.imdb.model;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.imdb.db.ImdbDAO;

public class Model {
	
	private Graph<Actor, DefaultWeightedEdge> grafo;
	private ImdbDAO dao;
	
	public Model() {
		dao = new ImdbDAO();
	}
	
	public void creaGrafo(String genere) {
		
		grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		
		//Vertici
		Graphs.addAllVertices(grafo, dao.getAttoriGenere(genere));
		
		//Archi
		
		
	}
	
	

}
