import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ControllerInfoConsola {

  @FXML
  private ImageView img;

  @FXML
  private Label title = new Label();

  @FXML
  private Label data = new Label();
    
  @FXML
  private Label procesador = new Label();

  @FXML
  private Pane color = new Pane();

  @FXML
  private Label venudes = new Label();


  public void setImage(String resourceName) {

    // Obté una referència al recurs dins del .jar
    ClassLoader classLoader = getClass().getClassLoader();
    Image image = new Image(classLoader.getResourceAsStream(resourceName));

    // Estableix la imatge a l'ImageView
    img.setImage(image);
  }
  public void setTitle(String text) {

    // Estableix el contingut del Label
    this.title.setText(text);
  }

  public void setData(String data) {

    // Estableix el contingut del Label
    this.data.setText(data);
  }
  
  public void setProcesador(String procesador) {

    // Estableix el contingut del Label
    this.procesador.setText(procesador);
  }
  
  public void setVenudes(Integer venudes) {

    // Estableix el contingut del Label
    this.venudes.setText(venudes.toString());
  }

  public void setColor(String color) {

    // Estableix el contingut del Label
    this.color.setStyle("-fx-background-color: "+color+";");
  }

}

