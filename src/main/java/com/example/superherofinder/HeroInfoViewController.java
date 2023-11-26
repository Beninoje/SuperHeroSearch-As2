package com.example.superherofinder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class HeroInfoViewController implements LoadHero{

    @FXML
    private Label combatLabel;

    @FXML
    private Label durabilityLabel;

    @FXML
    private Button goBack;

    @FXML
    private Label header;

    @FXML
    private Label intelligenceLabel;

    @FXML
    private Label powerLabel;

    @FXML
    private Label speedLabel;

    @FXML
    private Label strengthLabel;

    @FXML
    private ImageView imageView;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "hero-view.fxml");
    }
    public void loadHeroInfo(String heroID) {
        try {
            HeroDetails heroDetails = APIUtility.getHeroDetails(heroID);

            String imageUrl = heroDetails.getImage().getUrl();

            imageView.setImage(new Image(imageUrl));
            intelligenceLabel.setText("Intelligence: " + heroDetails.getPowerStats().getIntelligence());
            strengthLabel.setText("Strength: " + heroDetails.getPowerStats().getStrength());
            speedLabel.setText("Speed: " + heroDetails.getPowerStats().getSpeed());
            durabilityLabel.setText("Durability: " + heroDetails.getPowerStats().getDurability());
            powerLabel.setText("Power:" + heroDetails.getPowerStats().getPower());
            combatLabel.setText("Combat: " + heroDetails.getPowerStats().getCombat());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            imageView.setImage(new Image(
                    Main.class.getResourceAsStream("imgs/heroIcon.png")));
        }
    }


}
