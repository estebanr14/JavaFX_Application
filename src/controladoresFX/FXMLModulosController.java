
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    @FXML private ImageView imagenModuloUno;
    @FXML private ImageView imagenModuloDos;
    @FXML private ImageView imagenModuloTres;
    @FXML private ImageView imagenModuloCuatro;
    private Stage stageProyectos;

    public void setNombreProyecto(String textNombre) {
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
    
    public void abrirModuloUno(){
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistasFX/FXMLModuloUno.fxml"));
            Stage stageModulo1 = new Stage();
            stageModulo1.setScene(new Scene( (AnchorPane) loader.load()));
            
            FXMLModuloUnoController controller = loader.<FXMLModuloUnoController>getController();
            controller.setStageModulos((Stage) textNombre.getScene().getWindow());
            
            stageModulo1.show();
            
            Stage thisStage = (Stage) textNombre.getScene().getWindow();
            thisStage.hide();
            
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLModulosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    


    
}
