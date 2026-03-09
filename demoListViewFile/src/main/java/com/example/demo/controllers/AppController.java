package com.example.demo.controllers;

import com.example.demo.services.PersonaService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.lang.classfile.Label;
import java.util.List;

public class AppController {
    @FXML
    private Label lblMsg;
    @FXML
    private ListView<String> listView;

    private ObservableList<String> data = FXCollections.observableArrayList();
    PersonaService service = new PersonaService();

    @FXML
    public void initialize(){
        listView.setItems(data);
        loadFromFile();
    }

    private void loadFromFile(){
        try{
           List<String> items = service.loadForListView();
           data.setAll(items);
            lblMsg.setStyle("Datos cargados correctamente");
            lblMsg.setStyle("-fx-text-fill:green");
        } catch (IOException e) {
            lblMsg.setText("Error: "+e.getMessage());
            lblMsg.setStyle("-fx-text-fill:red");
        }
    }
}
