
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EstebanRestrepo
 */
public class FXMLCrearActividadController implements Initializable {
    
    @FXML private VBox container_ItemsCapitulo1;
    @FXML private VBox container_ItemsCapitulo2;
    @FXML private VBox container_ItemsCapitulo3;
    @FXML private Button btnCapítuloUno;
    @FXML private Button btnCapítuloDos;
    @FXML private Button btnCapítuloTres;
    @FXML private TextField nombreActividad;
    private FXMLModuloUnoController controller_moduloUno;
    
        @Override
     public void initialize(URL url, ResourceBundle rb) {
        
        btnCapítuloUno.setOnAction((ActionEvent e1) -> {
                 container_ItemsCapitulo2.setVisible(false);
                 container_ItemsCapitulo3.setVisible(false);
                 container_ItemsCapitulo1.setVisible(true);            
            });
        btnCapítuloDos.setOnAction((ActionEvent e1) -> {
                  container_ItemsCapitulo1.setVisible(false);
                  container_ItemsCapitulo3.setVisible(false);
                  container_ItemsCapitulo2.setVisible(true);          
            });
        btnCapítuloTres.setOnAction((ActionEvent e1) -> {
                container_ItemsCapitulo2.setVisible(false);
                container_ItemsCapitulo1.setVisible(false);
                container_ItemsCapitulo3.setVisible(true);         
            });         
    }    
     
     public void setModuloUnoController( FXMLModuloUnoController controller){
          controller_moduloUno = controller;
      }
      
      public void btn_guardar(){
          controller_moduloUno.insertarActividad(nombreActividad.getText());
          Stage thisStage = (Stage)container_ItemsCapitulo1.getScene().getWindow();
          thisStage.close();
        
      }
      
     public void btn_Cancelar(){
          Stage thisStage = (Stage)container_ItemsCapitulo1.getScene().getWindow();
          thisStage.close();
      }

     public void btn_MostrarInfoItem(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistasFX/FXMLInfo_Item.fxml"));
            Stage stage_info = new Stage();
            stage_info.setScene(new Scene( (AnchorPane) loader.load()));
            stage_info.show();
          
        } catch (IOException ex) {
            Logger.getLogger(FXMLCrearActividadController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
