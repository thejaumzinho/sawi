package com.jaumzin;

import com.jaumzin.application.API;
import com.jaumzin.application.Application;

public class Main {
    public static void main(String[] args) {
       Application app = new Application("Sawi", 800, 600, API.OPENGL);
       app.Run();
    }
}