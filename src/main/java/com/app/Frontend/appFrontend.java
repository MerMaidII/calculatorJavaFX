package com.app.Frontend;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class appFrontend {

    public void start(Stage stageArg) throws IOException {


		Parent root = FXMLLoader.load(this.getClass().getResource("MainApp.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(this.getClass().getResource("Styles.css").toExternalForm());

		stageArg.setTitle("Calculator");
		stageArg.setResizable(false);

		stageArg.setOnCloseRequest(
				event -> {
					event.consume();
					this.close(stageArg);
				}
		);

		stageArg.setScene(scene);
		stageArg.show();

    }

    private void close(Stage stageArg) {
        Alert alertWin = new Alert(AlertType.CONFIRMATION);
        alertWin.setTitle("Exit application?");
        alertWin.setHeaderText("You are about to close the calculator");
        alertWin.setContentText("Press \"OK\" to exit");

        if( alertWin.showAndWait().get() == ButtonType.OK ) {
            com.app.Backend.appBackend.exit();
            stageArg.close();
        }
        return;
    }
}
