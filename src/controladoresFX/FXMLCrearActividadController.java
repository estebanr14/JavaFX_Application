
package controladoresFX;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author EstebanRestrepo
 */
public class FXMLCrearActividadController implements Initializable {
    
    @FXML private VBox container_ItemsCapitulo1;
    @FXML private VBox container_ItemsCapitulo2;
    @FXML private VBox container_ItemsCapitulo3;
       
  

    public void btn_Capitulo1(){
        container_ItemsCapitulo2.setVisible(false);
         container_ItemsCapitulo3.setVisible(false);
        container_ItemsCapitulo1.setVisible(true);
    }

   public void btn_Capitulo2(){
       container_ItemsCapitulo1.setVisible(false);
         container_ItemsCapitulo3.setVisible(false);
        container_ItemsCapitulo2.setVisible(true);
    }
        
     public void btn_Capitulo3(){
         container_ItemsCapitulo2.setVisible(false);
         container_ItemsCapitulo1.setVisible(false);
        container_ItemsCapitulo3.setVisible(true);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
