package com.jaumzin.utils;

import java.util.ArrayList;

import org.lwjgl.assimp.AIFace;
import org.lwjgl.assimp.AIMesh;
import org.lwjgl.assimp.AIScene;
import org.lwjgl.assimp.AIVector3D;
import org.lwjgl.assimp.Assimp;

import com.jaumzin.models.MeshData;
import com.jaumzin.models.Vertex;


public class ResourceManager {

    private static ArrayList<Vertex> vertex = new ArrayList<Vertex>();
    private static ArrayList<Integer> indices = new ArrayList<Integer>();

    public static MeshData loadMesh(String path)
    {
        AIScene scene = Assimp.aiImportFile(path, Assimp.aiProcess_Triangulate | 
        Assimp.aiProcess_GenSmoothNormals | 
        Assimp.aiProcess_FlipUVs |
        Assimp.aiProcess_CalcTangentSpace |
        Assimp.aiProcess_LimitBoneWeights
        );

        AIMesh mesh = AIMesh.create(scene.mMeshes().get(0));
        for (int i = 0; i < mesh.mNumVertices(); i++) 
        {
            
            AIVector3D position = mesh.mVertices().get(i);
            AIVector3D normals = mesh.mNormals() != null ? mesh.mNormals().get(i) : null;
            AIVector3D texture = mesh.mTextureCoords(0) != null ? mesh.mTextureCoords(0).get(i) : null;
            AIVector3D tangent = mesh.mTangents() != null ? mesh.mTangents().get(i) : null;
            
            Vertex ver = new Vertex();

            ver.SetPostion(position.x(), position.y(), position.z());
            ver.SetNormals(normals.x(), normals.y(), normals.z());
            ver.SetTexture(texture.x(), texture.y(), texture.z());
            ver.SetTagent(tangent.x(), tangent.y(), tangent.z());

            vertex.add(ver);
        }

        for (int i = 0; i < mesh.mNumFaces(); i++) {
            AIFace face = mesh.mFaces().get(i);
            for (int j = 0; j < face.mNumIndices(); j++) {
                int index = face.mIndices().get(j);
                indices.add(index);
            }
        }
        return new MeshData(vertex, indices);

    }
    public static void loadShader(String path)
    {
            //TODO
    }
    public static void loadTexture(String path)
    {
        //TODO
    }
}
