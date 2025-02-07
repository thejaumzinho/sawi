package com.jaumzin.models;

import org.lwjgl.assimp.AIVector3D;

public class Vertex {
    private AIVector3D position = AIVector3D.create();
    private AIVector3D texture = AIVector3D.create();
    private AIVector3D tangent = AIVector3D.create();
    private AIVector3D normals = AIVector3D.create();
    

    public void SetPostion(float x, float y, float z)
    {
        if(position != null){
            this.position.x(x);
            this.position.y(y);
            this.position.z(z);
        }
    }
    public void SetNormals(float x, float y, float z)
    {
        if(normals != null)
        {
            this.normals.x(x);
            this.normals.y(y);
            this.normals.z(z);
        }
    }
    public void SetTexture(float x, float y, float z)
    {
        if(texture != null)
        {
            this.texture.x(x);
            this.texture.y(y);
            this.texture.z(z);
        }
    }
    public void SetTagent(float x, float y, float z)
    {
        if(tangent != null)
        {
            this.tangent.x(x);
            this.tangent.y(y);
            this.tangent.z(z);
        }
    }
    
    
    public AIVector3D getPosition()
    {
        return this.position;
    }
    public AIVector3D getTexture()
    {
        return this.texture;
    }
    public AIVector3D getTangent()
    {
        return this.tangent;
    }
    public AIVector3D getNormals()
    {
        return this.normals;
    }
}
