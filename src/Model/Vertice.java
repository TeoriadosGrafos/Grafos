/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Ana Carolyne
 */
public class Vertice {

    private String nomeVertice;
    private ArrayList<Aresta> arestas = new ArrayList<>();

    public String getNomeVertice() {
        return nomeVertice;
    }

    public void setNomeVertice(String nomeVertice) {
        this.nomeVertice = nomeVertice;
    }
    
    void adcionaAresta (Aresta aresta){
        arestas.add(aresta);
    }
    
    void mostraArestas (){
        System.out.println("Vertice: "+this.getNomeVertice());
        for (Aresta aresta : arestas) {
            System.out.println("Arestas: "+aresta.getNumeroAresta());
        }
    }

    public Vertice(String nomeVertice) {
        this.nomeVertice = nomeVertice;

    }

    public Vertice() {
    }

}
