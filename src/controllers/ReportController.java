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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import models.Record;
import utils.GlobalHelper;

/**
 *
 * @author bonay
 */
public class ReportController implements Initializable {
    
    // note: fx-id of table columns in fxml file must match the variable name of the columns declared here
    @FXML
    private TableView<Record> record_table;
    
    @FXML
    private TableColumn<Record, String> username_column;
    
    @FXML
    private TableColumn<Record, String> activity_column;
    
    @FXML
    private TableColumn<Record, String> account_name_column;
    
    @FXML
    private TableColumn<Record, String> start_time_column;
    
    @FXML
    private TableColumn<Record, String> end_time_column;
    
    @FXML
    private TableColumn<Record, String> aht_column;
    
    @FXML
    private TableColumn<Record, String> remarks_column;
    
    @FXML
    private TableColumn<Record, String> volume_column;
    
    @FXML
    private TableColumn<Record, String> process_name_column;
    
    @Override
    public void initialize(URL location, ResourceBundle resources)  {
        username_column.setCellValueFactory(new PropertyValueFactory<>("username"));
        activity_column.setCellValueFactory(new PropertyValueFactory<>("activity"));
        account_name_column.setCellValueFactory(new PropertyValueFactory<>("account_name"));
        start_time_column.setCellValueFactory(new PropertyValueFactory<>("start_time"));
        end_time_column.setCellValueFactory(new PropertyValueFactory<>("end_time"));
        aht_column.setCellValueFactory(new PropertyValueFactory<>("aht"));
        remarks_column.setCellValueFactory(new PropertyValueFactory<>("remarks"));
        volume_column.setCellValueFactory(new PropertyValueFactory<>("volume"));
        process_name_column.setCellValueFactory(new PropertyValueFactory<>("process_name"));

        record_table.getItems().setAll(GlobalHelper.record_holder);
    }
    
    @FXML
    private void backToMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/main.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
}
