package com.jsv.tfmdemo.modelo;

import org.gephi.graph.api.*;
import org.gephi.project.api.Project;
import org.gephi.project.api.ProjectController;
import org.gephi.project.api.Workspace;
import org.openide.util.Lookup;

public class Grafo {

	private Node n0;
	private Node n1;
	private Node n2;
	private Node n;
	private ProjectController pc;
	private Node[] neighbors;

	public Grafo()
	{
		// Inicio un proyecto y un espacio de trabajo
		pc = Lookup.getDefault().lookup(ProjectController.class);
		pc.newProject();

		Workspace workspace = pc.getCurrentWorkspace();

		// Creo un modelo grafo - existe porque tenemos el workspace
		GraphModel graphModel = Lookup.getDefault().lookup(GraphController.class).getGraphModel(workspace);

		// Creo 3 nodos
		n0 = graphModel.factory().newNode("n0");
		n0.setLabel("Node 0");
		n1 = graphModel.factory().newNode("n1");
		n1.setLabel("Node 1");
		n2 = graphModel.factory().newNode("n2");
		n2.setLabel("Node 2");

		// Creo 3 aristas
		Edge e1 = graphModel.factory().newEdge(n1, n2, 0, 1.0, true);
		Edge e2 = graphModel.factory().newEdge(n0, n2, 0, 2.0, true);
		Edge e3 = graphModel.factory().newEdge(n2, n0, 0, 2.0, true); // This is e2's mutual edge

		// Append as a Directed Graph
		DirectedGraph directedGraph = graphModel.getDirectedGraph();
		directedGraph.addNode(n0);
		directedGraph.addNode(n1);
		directedGraph.addNode(n2);
		directedGraph.addEdge(e1);
		directedGraph.addEdge(e2);
		directedGraph.addEdge(e3);

		// Count nodes and edges
		System.out.println("Nodes: " + directedGraph.getNodeCount() + " Edges: " + directedGraph.getEdgeCount());
		// Get a UndirectedGraph now and count edges
		UndirectedGraph undirectedGraph = graphModel.getUndirectedGraph();
		System.out.println("Edges: " + undirectedGraph.getEdgeCount()); // The mutual edge is automatically merged

		// Iterate over nodes
		
		for ( Node n : directedGraph.getNodes()) 
		{ 
			neighbors =  directedGraph.getNeighbors(n).toArray(); System.out.println(n.getLabel() +
			" has " + neighbors.length + " neighbors"); 
		}
		 
		//Iterate over edges 
		for (Edge e : directedGraph.getEdges()) 
		{
			System.out.println(e.getSource().getId() + " -> " + e.getTarget().getId());
		}
		 
		//Find node by id 
		Node node2 = directedGraph.getNode("n2");
		
		//Get degree 
		System.out.println("Node2 degree: " + directedGraph.getDegree(node2));
		
		// Modify the graph while reading
		// Due to locking, you need to use toArray() on Iterable to be able to modify
		// the graph in a read loop
		/*
		for ( n : directedGraph.getNodes().toArray()) {
			directedGraph.removeNode(n);
		 }
		*/
	}
}
