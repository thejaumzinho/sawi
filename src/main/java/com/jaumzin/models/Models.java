package com.jaumzin.models;

import org.lwjgl.assimp.Assimp;
import org.lwjgl.opengl.GL;

import com.jaumzin.utils.ResourceManager;

import java.util.ArrayList;

public class Models {

    private ArrayList<Vertex> vertex = new ArrayList<Vertex>();
    private ArrayList<Integer> indices = new ArrayList<Integer>();

    
    private int VAO;
    private int VBO;
    private int EBO;

    public void SetMesh(String path)
    {
        var mesh  = ResourceManager.loadMesh(path);

        this.vertex = mesh.getVertex();
        this.indices = mesh.getIndices();

    }
    public void Draw()
    {

    }
}
