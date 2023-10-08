import java.net.URL;
import java.util.ResourceBundle;

import org.json.JSONArray;
import org.json.JSONObject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class ControllerMobile0 implements Initializable{

    @FXML
    private ListView<String> myListView;

    String[] options = {"Personatges","Jocs","Consoles"};

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        myListView.getItems().addAll(options);
        myListView.setOnMouseClicked(event->{});
    }

   
}

