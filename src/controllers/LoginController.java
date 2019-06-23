/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController implements Initializable {
    
    
    @FXML
    private Pane main_panel;
    
    @FXML
    private TextField start_time;
    
    @FXML
    private void login(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/main.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
