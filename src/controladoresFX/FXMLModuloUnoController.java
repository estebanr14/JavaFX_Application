
package controladoresFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EstebanRestrepo
 */
public class FXMLModuloUnoController implements Initializable {

    @FXML private Label labelTitulo;
    private Stage stageModulos;
    
public void setStageModulos(Stage stage){
    stageModulos = stage;
   
}

 public void volverAModulos(){
    stageModulos.show();
    Stage thisStage = (Stage) labelTitulo.getScene().getWindow();
    thisStage.close();
    
}
 
 public void BTN_agregarActividad(){
             try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistasFX/FXMLCrearActividad.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene( (AnchorPane) loader.load()));
                       
            stage.show();
              
        } catch (IOException ex) {
            Logger.getLogger(FXMLProyectosController.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
