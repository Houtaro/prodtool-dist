/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Record;

/**
 *
 * @author bonay
 */
public class GlobalHelper {
    public static ObservableList<Record> record_holder = FXCollections.observableArrayList();
}
