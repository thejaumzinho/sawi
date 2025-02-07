package com.jaumzin.models;


import java.util.ArrayList;

public class MeshData {

    private ArrayList<Vertex> vertex = new ArrayList<Vertex>();
    private ArrayList<Integer> indices = new ArrayList<Integer>();
    public MeshData(ArrayList<Vertex> vertex, ArrayList<Integer> indices)
    {
        this.vertex = vertex;
        this.indices = indices;
    }
    public ArrayList<Vertex> getVertex()
    {
        return this.vertex;
    }
    public ArrayList<Integer> getIndices()
    {
        return this.indices;
    }
}
