
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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EstebanRestrepo
 */
public class FXMLProyectosController implements Initializable {

    
    @FXML private VBox proyectosContainer;
    @FXML private VBox containerCuerpo;
    @FXML private VBox containerCabeza;
    @FXML private VBox containerPie;
    private int contadorProyectos=0;
    private String nombreProyecto;

    
    public void btn_crearProyecto(ActionEvent e){
        try {
            //ABRIR NUEVA VENTANA PARA DATOS DEL PROYECTO
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistasFX/FXMLCrearProyecto.fxml"));
            Stage stageCrearProyecto = new Stage();
            stageCrearProyecto.setScene(new Scene( (AnchorPane) loader.load()));
            
            Stage thisStage = (Stage) containerCuerpo.getScene().getWindow();
            FXMLCrearProyectoController crearProyectoController  = loader.<FXMLCrearProyectoController>getController();
            crearProyectoController.setProyectosController(thisStage, this);
            
            stageCrearProyecto.show();
           
        } catch (IOException ex) {
            Logger.getLogger(FXMLProyectosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setNombreProyecto(String nombre){
        nombreProyecto = nombre;
    }   
    
    public void insertarProyecto(){
            //CREAR EL BOTÓN E INSERTARLO EN LA VENTANA
            contadorProyectos++;
            Double alturaContainer = proyectosContainer.getPrefHeight();
            proyectosContainer.setPrefHeight(alturaContainer+120);
                 
            Button btnProyecto = new Button();
            btnProyecto.setPrefHeight(90.0);
            btnProyecto.setPrefWidth(790.0);
            btnProyecto.setText(nombreProyecto);
            btnProyecto.setFont(Font.font("System", FontWeight.NORMAL, 50));
            btnProyecto.setOnAction((ActionEvent e1) -> {
                abrirProyecto(nombreProyecto);
            });
            proyectosContainer.getChildren().add(btnProyecto);
    }
    
    public void abrirProyecto(String nombreProyecto) {       
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistasFX/FXMLModulos.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene( (AnchorPane) loader.load()));
            
            FXMLModulosController controller = loader.<FXMLModulosController>getController();
            controller.setNombreProyecto(nombreProyecto);
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

    }    
    
}
