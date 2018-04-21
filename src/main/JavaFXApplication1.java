/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author EstebanRestrepo
 */
public class JavaFXApplication1 extends Application {
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/vistasFX/FXMLProyectos.fxml"));
       // root.setId("root");
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(this.getClass().getResource("/recursos/style.css").toExternalForm());
        
        stage.setScene(scene);
        stage.setTitle("Proyectos");
        stage.show();
        
        
    }
    


    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        launch(args);
    }
    
}
