/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ana
 */
public class Aresta {
    private int numeroAresta;
    private Vertice vertice;

    public int getNumeroAresta() {
        return numeroAresta;
    }

    public void setNumeroAresta(int numeroAresta) {
        this.numeroAresta = numeroAresta;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public Aresta() {
    }

    public Aresta(int numeroAresta, Vertice vertice) {
        this.numeroAresta = numeroAresta;
        this.vertice = vertice;
    }
    
}
