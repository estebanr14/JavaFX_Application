
package controladoresFX;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *Estea clase captura los datos para la creación del proyecto
 * @author EstebanRestrepo
 */
public class FXMLCrearProyectoController implements Initializable {

    @FXML private TextField nombreProyecto;
    private FXMLProyectosController proyectosController;
    private Stage stageProyectos;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    public void setProyectosController(Stage stage, FXMLProyectosController controller){
        proyectosController = controller;
        stageProyectos = stage;
    }
 
    public void btn_Guardar(){
        proyectosController.setNombreProyecto(nombreProyecto.getText());
        proyectosController.insertarProyecto();
        Stage thisStage = (Stage)nombreProyecto.getScene().getWindow();
        thisStage.close();
        
    }
    
    public void btn_Cancelar(){
         Stage thisStage = (Stage)nombreProyecto.getScene().getWindow();
        thisStage.close();
    }
    
}
