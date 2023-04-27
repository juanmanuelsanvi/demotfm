package com.jsv.tfmdemo.modelo;

import org.gephi.graph.api.*;
import org.gephi.project.api.*;
import org.openide.util.Lookup;
import org.springframework.beans.factory.annotation.Autowired;

public class Grafo {

    //Inicio un proyecto y un espacio de trabajo
    ProjectController pc = Lookup.getDefault().lookup(ProjectController.class);
    Project project = pc.newProject();

    Workspace workspace = pc.getCurrentWorkspace();	

    //Creo un modelo grafo - existe porque tenemos el workspace
    GraphModel graphModel = Lookup.getDefault().lookup(GraphController.class).getGraphModel(workspace);
    
    // Creo 3 nodos
    Node nPepe = graphModel.factory().newNode("Pepe");
    nPepe.setLabel("Node 0");
    Node nAntonio = graphModel.factory().newNode("Antonio");
    nAntonio.setLabel("Node 1");
    Node nAna = graphModel.factory().newNode("Ana");
    nAna.setLabel("Node 2");

    //Creo 3 aristas
    Edge e1 = graphModel.factory().newEdge(nAntonio, nAna, 0, 1.0, true);
    Edge e2 = graphModel.factory().newEdge(nPepe, nAna, 0, 2.0, true);
    Edge e3 = graphModel.factory().newEdge(nAna, nPepe, 0, 2.0, true);   //This is e2's mutual edge

    //Append as a Directed Graph
    DirectedGraph directedGraph = graphModel.getDirectedGraph();
    directedGraph.addNode(nPepe);
    directedGraph.addNode(nAntonio);
    directedGraph.addNode(nAna);
    directedGraph.addEdge(e1);
    directedGraph.addEdge(e2);
    directedGraph.addEdge(e3);

    //Count nodes and edges
    System.out.println("Nodes: " + directedGraph.getNodeCount() + " Edges: " + directedGraph.getEdgeCount());
    //Get a UndirectedGraph now and count edges
    UndirectedGraph undirectedGraph = graphModel.getUndirectedGraph();
    System.out.println("Edges: " + undirectedGraph.getEdgeCount());   //The mutual edge is automatically merged

    //Iterate over nodes
    for (Node n : directedGraph.getNodes()) {
        Node[] neighbors = directedGraph.getNeighbors(n).toArray();
        System.out.println(n.getLabel() + " has " + neighbors.length + " neighbors");
    }

    //Iterate over edges
    for (Edge e : directedGraph.getEdges()) {
        System.out.println(e.getSource().getId() + " -> " + e.getTarget().getId());
    }

    //Find node by id
    Node node2 = directedGraph.getNode("n2");

    //Get degree
    System.out.println("Node2 degree: " + directedGraph.getDegree(node2));

    //Modify the graph while reading
    //Due to locking, you need to use toArray() on Iterable to be able to modify
    //the graph in a read loop
    for (Node n : directedGraph.getNodes().toArray()) {
        directedGraph.removeNode(n);
    }    
}
