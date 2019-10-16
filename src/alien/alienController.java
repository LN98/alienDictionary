/**
 * Sample Skeleton for 'alien.fxml' Controller Class
 */

package alien;

import java.net.URL;
import java.util.ResourceBundle;

import alien.model.Alien;
import alien.model.AlienDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class alienController {
	
	private AlienDictionary ad;
	
    public void setModel(AlienDictionary ad) {
		this.ad = ad;
    }

    
    	
	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="word"
    private TextField word; // Value injected by FXMLLoader

    @FXML // fx:id="translate"
    private Button translate; // Value injected by FXMLLoader

    @FXML // fx:id="display"
    private TextArea display; // Value injected by FXMLLoader

    @FXML // fx:id="clean"
    private Button clean; // Value injected by FXMLLoade

    @FXML
    void doReset(ActionEvent event) {
    	display.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
		if (!ad.equals(word.getText().split(" ")[0])) {
			if(ad.controlla(word.getText())!=null) {
				if (display.getText().isEmpty()) {
					display.setText(ad.controlla(word.getText()));
				} 
				else {
					display.setText(display.getText() + "\n" + ad.controlla(word.getText()));
				}
			} 
			else {
				Alien parola = new Alien(word.getText());
				ad.addParola(parola);
			}
		} 
		else {
			if(word.getText().contains(" ")) {
				ad.addParola(new Alien(word.getText()));
			}
			else if (!display.getText().isEmpty()) {
				display.setText(display.getText() + "\n" + ad.traduzione(word.getText().split(" ")[0]));
			} else {
				display.setText(ad.traduzione(word.getText().split(" ")[0]));
			}
		}
			
		word.clear();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert word != null : "fx:id=\"word\" was not injected: check your FXML file 'alien.fxml'.";
        assert translate != null : "fx:id=\"translate\" was not injected: check your FXML file 'alien.fxml'.";
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'alien.fxml'.";
        assert clean != null : "fx:id=\"clean\" was not injected: check your FXML file 'alien.fxml'.";

    }
}
