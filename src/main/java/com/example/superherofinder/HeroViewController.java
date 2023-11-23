package com.example.superherofinder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HeroViewController implements Initializable {

    @FXML
    private Label header;

    @FXML
    private VBox resultsView;

    @FXML
    private Label heroFoundLabel;

    @FXML
    private ImageView heroImage;

    @FXML
    private ListView<Hero> listView;

    @FXML
    private TextField searchTextField;
    @FXML
    void searchHero(ActionEvent event) throws IOException, InterruptedException {
        String heroName = searchTextField.getText().trim();
        try {
            List<Hero> hero = APIUtility.callAPI(heroName);
            listView.getItems().clear();
            listView.getItems().addAll(hero);
            listView.setVisible(true);
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }

//        heroFoundLabel.setText("Showing: " + apiResponse.getResults().size());
    }

    @FXML
    void viewHero(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.setVisible(false);
        heroFoundLabel.setVisible(false);
        resultsView.setVisible(false);

    }
}
