package com.app;

import javafx.application.Application;
import javafx.stage.Stage;
import com.app.Backend.appBackend;
import com.app.Frontend.appFrontend;

public class Main extends Application {

    @Override
    public void start(Stage arg0) throws Exception {

        appBackend backend = new appBackend();
        appFrontend frontend = new appFrontend();

        backend.start();
        frontend.start(arg0);
    }

    public static void main(String[] args)  {
        Application.launch(args);
    }
}
