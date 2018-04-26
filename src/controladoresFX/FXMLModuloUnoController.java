
package controladoresFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EstebanRestrepo
 */
public class FXMLModuloUnoController implements Initializable {

    @FXML private Label labelTitulo;
    @FXML private HBox containerActividades;
    private Stage stageModulos;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
    public HBox getContainer(){
     return containerActividades;
 }
    
    public void setStageModulos(Stage stage){
    stageModulos = stage;
   
}

    public void volverAModulos(){
    stageModulos.show();
    Stage thisStage = (Stage) labelTitulo.getScene().getWindow();
    thisStage.close();
    
}
 
    public void btn_agregarActividad(){
        //ABRIR LA VENTANA PARA CREAR ACTIVIDAD
             try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistasFX/FXMLCrearActividad.fxml"));
            Stage stageCrearActividad = new Stage();
            stageCrearActividad.setScene(new Scene( (AnchorPane) loader.load()));
            
            FXMLCrearActividadController crearActividadController = loader.<FXMLCrearActividadController>getController();
            crearActividadController.setModuloUnoController(this);
           
            stageCrearActividad.show();
             
        } catch (IOException ex) {
            Logger.getLogger(FXMLProyectosController.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    
    public void insertarActividad(String nombreActividad){
            //SE CREA EL BOTÓN CORRESPONDIENTE A LA ACTIVIDAD
        Double tamano=  containerActividades.getPrefWidth();
        containerActividades.setPrefWidth(tamano+300);
        
        VBox infoActividad = new VBox();
        infoActividad.setAlignment(Pos.CENTER);
        infoActividad.setPrefWidth(300);
        infoActividad.setPrefHeight(450);
        Button  button = new Button (nombreActividad);
        button.setPrefSize(100, 100);
        button.setOnAction((ActionEvent e1) -> {
            this.abrirActividad();
        });
        
        infoActividad.getChildren().add(button);
        containerActividades.getChildren().add(infoActividad);
    }
    
    public void abrirActividad(){
            try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistasFX/FXMLActividad.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene( (AnchorPane) loader.load()));

            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLCrearActividadController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
    
}
