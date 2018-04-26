
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EstebanRestrepo
 */
public class FXMLPresentacionController implements Initializable {

    @FXML private AnchorPane ventana;
    
    public void prueba(){
                  try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistasFX/FXMLProyectos.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene( (AnchorPane) loader.load()));
                       
            stage.show();
            
            Stage thisStage = (Stage) ventana.getScene().getWindow();
            thisStage.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLModulosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            }    
    
}
