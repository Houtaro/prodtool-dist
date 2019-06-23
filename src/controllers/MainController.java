/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Record;
import utils.AlertHelper;
import utils.DateHelper;
import utils.GlobalHelper;

/**
 *
 * @author bonay
 */
public class MainController implements Initializable  {
    
    Date date;
    
    @FXML
    private TextField username;
    
    @FXML
    private TextField activity;
    
    @FXML
    private TextField account_name;
    
    @FXML
    private TextField start_time;
    
    @FXML
    private TextField end_time;
    
    @FXML
    private TextField aht;
    
    @FXML
    private TextField remarks;
    
    @FXML
    private TextField volume;
    
    @FXML
    private TextField process_name;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources)  {
        
        start_time.setDisable(true);
        end_time.setDisable(true);
        aht.setDisable(true);
        username.setDisable(true);
        
        // start time upon focus out of account name 
        account_name.focusedProperty().addListener((ov, oldV, newV) -> {
            if(!newV) { // lost focus
                date = new Date();
                start_time.setText(DateHelper.dateFormat.format(date));
            }
        });
        
        process_name.focusedProperty().addListener((ov, oldV, newV) -> {
            if(!newV) { // lost focus
                date = new Date();
                end_time.setText(DateHelper.dateFormat.format(date));
                try {
                    String diffMinutes = Long.toString(DateHelper.getDateDiff(DateHelper.dateFormat.parse(start_time.getText()), DateHelper.dateFormat.parse(end_time.getText()), TimeUnit.MINUTES));
                    String diffHours = Long.toString(DateHelper.getDateDiff(DateHelper.dateFormat.parse(start_time.getText()), DateHelper.dateFormat.parse(end_time.getText()), TimeUnit.HOURS));
                    
                    diffMinutes = diffMinutes.length() == 1 ? ("0" + diffMinutes) : (diffMinutes);
                    diffHours = diffHours.length() == 1 ? ("0" + diffHours) : (diffHours);
                    
                    aht.setText(diffHours + ":" + diffMinutes);
                } catch (ParseException ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    @FXML
    private void save(ActionEvent event) {
        Record r = new Record();
        r.setUsername(username.getText());
        r.setActivity(activity.getText());
        r.setAccount_name(account_name.getText());
        r.setStart_time(start_time.getText());
        r.setEnd_time(end_time.getText());
        r.setAht(aht.getText());
        r.setRemarks(remarks.getText());
        r.setVolume(volume.getText());
        r.setProcess_name(process_name.getText());
        
        GlobalHelper.record_holder.add(r);
        AlertHelper.show(Alert.AlertType.INFORMATION, "Success", "", "Saved successfully.");
    }
    
    @FXML
    private void view_report(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/report.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
}
