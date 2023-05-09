package com.jsv.tfmdemo.modelo;

import java.sql.Timestamp;
import java.util.List;

import org.gephi.graph.api.*;

import org.gephi.project.api.Project;
import org.gephi.project.api.ProjectController;
import org.gephi.project.api.Workspace;
import org.openide.util.Lookup;
import com.jsv.tfmdemo.modelo.Arista;
import com.jsv.tfmdemo.modelo.GraphDistance;

public class Grafo {

	private Node n0;
	private Node n1;
	private Node n2;
	private ProjectController pc;
	private Node[] neighbors;
	private Integer id;
	private String usuario; 
	private String apellido;
	private String nombre;
	private String email;
	private String fechaActualizacion;
	private Timestamp fecha;
	
	private Integer source;
	private Integer foro;
	private Integer asignatura;
	private Integer numcaracteres;
	private String fechaEnvio;
	private Integer target;
	private GraphModel graphModel;
	private DirectedGraph directedGraph;
	private GraphDistance grafo;
	private Persona per;
	
	public Grafo()
	{
		// Inicio un proyecto y un espacio de trabajo
		pc = Lookup.getDefault().lookup(ProjectController.class);
		pc.newProject();

		Workspace workspace = pc.getCurrentWorkspace();		
		
		// Creo un modelo grafo - existe porque tenemos el workspace
		graphModel = Lookup.getDefault().lookup(GraphController.class).getGraphModel(workspace);

		// Se crean 3 nodos
		n0 = graphModel.factory().newNode("n0");
		n0.setLabel("Node 0");
		n1 = graphModel.factory().newNode("n1");
		n1.setLabel("Node 1");
		n2 = graphModel.factory().newNode("n2");
		n2.setLabel("Node 2");

		// Se crean 3 aristas
		Edge e1 = graphModel.factory().newEdge(n1, n2, 0, 1.0, true);
		e1.setLabel("e1");
		Edge e2 = graphModel.factory().newEdge(n0, n2, 0, 2.0, true);
		e1.setLabel("e2");
		Edge e3 = graphModel.factory().newEdge(n2, n0, 0, 2.0, true); // Arista mutua 0 a 2 y 2 a 0
		e1.setLabel("e3");

		// Se crea como grafo dirigido
		directedGraph = graphModel.getDirectedGraph();
		directedGraph.addNode(n0);
		directedGraph.addNode(n1);
		directedGraph.addNode(n2);
		directedGraph.addEdge(e1);
		directedGraph.addEdge(e2);
		directedGraph.addEdge(e3);
		
	
		// Cuenta nodos y aristas
		System.out.println("Nodos: " + directedGraph.getNodeCount() + " Aristas: " + directedGraph.getEdgeCount());
		
		// Se crea un grafo no dirigido (a través del dirigido) y cuenta aristas
		UndirectedGraph undirectedGraph = graphModel.getUndirectedGraph();
		System.out.println("Aristas grafo ND: " + undirectedGraph.getEdgeCount()); // La arista mutua se convierte fusiona

		// Itera por el grafo (nodos)		
		for ( Node n : directedGraph.getNodes()) 
		{ 
			neighbors =  directedGraph.getNeighbors(n).toArray(); 
			System.out.println(n.getLabel() + " tiene " + neighbors.length + " vecinos"); 
		}
		 
		// Itera por el grafo (aristas) 
		for (Edge e : directedGraph.getEdges()) 
		{
			System.out.println(e.getSource().getId() + " -> " + e.getTarget().getId());
		}
		 
		// Obtiene nodo por el id del nodo 
		Node node2 = directedGraph.getNode("n2");
		
		// Obtiene el grado del grafo 
		System.out.println("Node2 degree: " + directedGraph.getDegree(node2));
		
		// Modifica el grafo mientras lo recorre
		// Necesita usar toArray() para modificar el grafo en el for		
		//for ( Node n : directedGraph.getNodes().toArray()) {
		//	directedGraph.removeNode(n);
		//}
		
		// Añadir información de una Persona
		id = 1;
		usuario = "usuario1";
		apellido = "Márquez";
		nombre = "Pepe";
		email ="pepemarquez@uned.es";
		long time = System.currentTimeMillis();	
		Timestamp fecha = new Timestamp(time);
		fechaActualizacion = fecha.toString();
		
		// Añade columnas para atributos de una persona (NODO)
		// Las columnas son comunes a todos los nodos del grafo
		graphModel.getNodeTable().addColumn("idenfier", Integer.class);
		graphModel.getNodeTable().addColumn("usuario", String.class);
		graphModel.getNodeTable().addColumn("apellido", String.class);
		graphModel.getNodeTable().addColumn("nombre", String.class);
		graphModel.getNodeTable().addColumn("email", String.class);
		graphModel.getNodeTable().addColumn("fecha", String.class);
		
		// Establece valores en cada una de las columnas
		// Como es ya algo de cada grafo concreto, se aplica sobre directedGraph
		for ( Node n : directedGraph.getNodes()) 
		{ 		
			n.setAttribute("idenfier", id);
			n.setAttribute("usuario", usuario);
			n.setAttribute("apellido", apellido);
			n.setAttribute("nombre", apellido);
			n.setAttribute("email", email);
			n.setAttribute("fecha", fechaActualizacion);
			id += 1;
		}
		/*
		for ( Node n : directedGraph.getNodes()) 
		{ 	
			System.out.println("Nodo: " + n.getLabel());
	        //Lista las columnas de un nodo, el n0 
	        for (Column col : graphModel.getNodeTable()) {
	            System.out.println(col.getTitle() + ": " + n.getAttribute(col) );
	        }
		}    
		*/
		source = 1;
		foro = 343;
		asignatura = 45;
		numcaracteres = 231;
		fechaEnvio ="04/05/2023";
		target = 2;
		
		// Añade columnas para atributos de un mensaje (ARISTA)
		graphModel.getEdgeTable().addColumn("origen", Integer.class);
		graphModel.getEdgeTable().addColumn("foro", Integer.class);
		graphModel.getEdgeTable().addColumn("asignatura", Integer.class);
		graphModel.getEdgeTable().addColumn("numcaracteres", Integer.class);
		graphModel.getEdgeTable().addColumn("fechaEnvio", String.class);
		graphModel.getEdgeTable().addColumn("target", Integer.class);     
	
		for ( Edge e : directedGraph.getEdges()) 
		{ 
			// Establece valores en cada una de las columnas
			e.setAttribute("origen", source);
			e.setAttribute("foro", foro);
			e.setAttribute("asignatura", asignatura);
			e.setAttribute("numcaracteres", numcaracteres);
			e.setAttribute("fechaEnvio", fechaEnvio);
			e.setAttribute("target", target);	
		}
		/*
		for ( Edge e : directedGraph.getEdges()) 
		{ 	
			System.out.println("Edge: " + e.getLabel());
	        //Lista las columnas de un nodo, el n0 
	        for (Column col : graphModel.getEdgeTable()) 
	        {
	            System.out.println(col.getTitle() + ": " + e.getAttribute(col) );
	        }
		}  
		*/
		grafo = new GraphDistance();
		grafo.execute(graphModel);

		for ( Node n : directedGraph.getNodes()) 
		{ 	
			System.out.println("Nodo: " + n.getLabel());
	        //Lista las columnas de un nodo, el n0 
	        for (Column col : graphModel.getNodeTable()) {
	            System.out.println(col.getTitle() + ": " + n.getAttribute(col) );
	        }
		}  
		System.out.println("Informe: " + grafo.getReport());

	}
	

}
