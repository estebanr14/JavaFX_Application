/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoresFX;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import static javafx.scene.AccessibleAttribute.FONT;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EstebanRestrepo
 */
public class FXMLProyectosController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private VBox proyectosContainer;
    @FXML private VBox containerCuerpo;
    @FXML private VBox containerCabeza;
    @FXML private VBox containerPie;
    private int contadorProyectos=0;

    
    public void BTNcrearProyecto(ActionEvent e){
        Double alturaContainer = proyectosContainer.getPrefHeight();
        proyectosContainer.setPrefHeight(alturaContainer+120);
        
        contadorProyectos++;
        
        Button btnProyecto = new Button();
        btnProyecto.setPrefHeight(90.0);
        btnProyecto.setPrefWidth(790.0);
        btnProyecto.setText("Proyecto "+contadorProyectos);
        btnProyecto.setFont(Font.font("System", FontWeight.NORMAL, 50));
        btnProyecto.setOnAction((ActionEvent e1) -> {
             
            abrirProyecto(btnProyecto.getText());
        });
        
      //  btnProyecto.setFont(FONT.);
        proyectosContainer.getChildren().add(btnProyecto);

    }
    
    public void abrirProyecto(String nombreProyecto) {       
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistasFX/FXMLModulos.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene( (AnchorPane) loader.load()));
            
            FXMLModulosController controller = loader.<FXMLModulosController>getController();
            controller.setTextNombre(nombreProyecto);
            controller.setStageProyectos((Stage) containerCuerpo.getScene().getWindow());
            
            stage.show();
            
           Stage thisStage = (Stage) containerCuerpo.getScene().getWindow();
           thisStage.hide();
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLProyectosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        containerCuerpo.getStyleClass().add("container");
        containerPie.getStyleClass().add("container");
        containerCabeza.getStyleClass().add("container");
    }    
    
}