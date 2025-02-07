package com.jaumzin.application;

import org.lwjgl.opengl.GL;

import com.jaumzin.utils.ResourceManager;
import com.jaumzin.window.Window;


import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import org.lwjgl.opengl.*;

public class Application {
    private String title;
    private int width;
    private int height;
    private API api;


    private Window window;

    public Application(String title, int width, int height, API api)
    {
        this.title = title;
        this.height = height;
        this.width = width;
        this.api = api;

        window = new Window(title, width, height, api);
      
    }
    public void Run()
    {
        GL.createCapabilities();
        glClearColor(1.0f, 0.0f, 0.0f, 0.0f);
        while(true)
        {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); 
            window.OnUpdate();
        }
    }
}
