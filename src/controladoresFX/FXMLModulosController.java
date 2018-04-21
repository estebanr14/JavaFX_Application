/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoresFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EstebanRestrepo
 */
public class FXMLModulosController implements Initializable {

    @FXML private Text textNombre;
    private Stage stageProyectos;

    public void setTextNombre(String textNombre) {
        //this.textNombre = textNombre;
       this.textNombre.setText(textNombre);
     }
    
    public void setStageProyectos(Stage stage) {
        stageProyectos=stage;
    }
    
    public void volverAProyectos (ActionEvent e){
        stageProyectos.show();
       Stage thisStage = (Stage) textNombre.getScene().getWindow();
       thisStage.close();
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    
}
