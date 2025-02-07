package com.jaumzin.window;

import org.lwjgl.glfw.GLFW;
import com.jaumzin.application.API;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Window {

    private long handle;

    public Window(String title, int width, int height, API api)
    {
        glfwInit();
      
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 4);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 6);
        glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE); 
		glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE); 

        handle = glfwCreateWindow(width, height, title, NULL, NULL);
        glfwMakeContextCurrent(handle);
        glfwShowWindow(handle);

    }
    public void OnUpdate()
    {
        GLFW.glfwSwapBuffers(handle);
        glfwPollEvents();
    }
}
