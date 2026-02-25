package com.example.demo.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class FormController {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtEdad;
    @FXML
    private Label Resultado;
    public void onValidate(ActionEvent event ){
        String nombre = txtNombre.getText() == null ? "" : txtNombre.getText();
        String correo = txtCorreo.getText() == null ? "" : txtCorreo.getText();
        String edad = txtEdad.getText() == null ? "" : txtEdad.getText();

        List<String> errores = new ArrayList<>(); // Listado De Strings

        if (nombre.trim().isEmpty() || nombre.isBlank() || nombre.length() < 3){
            errores.add("El nombre es incorrecto");
        }

        if (correo.trim().isEmpty() || correo.isBlank() || !correo.contains("@") || !correo.contains(".")){
            errores.add("El Correo es incorrecto");
        }

        if (edad.trim().isEmpty()){
            errores.add("La edad");
        }

        try {
            int edadValidation = Integer.parseInt(edad);
            if (edadValidation < 0 || edadValidation > 120){
                errores.add("La edad no esta bien bro");
            }
        }catch (Exception e){
            errores.add("La edad no es numerica");
        }

        if (errores.isEmpty()){
            Resultado.setText("Los datos son correctos");
            Resultado.setStyle("-fx-tex-fill: green");
        }else{
            String datos = "";
            for(String dato : errores){
                datos+=dato;
            }
            Resultado.setText(datos);
            Resultado.setStyle("-fx-text-fill: red");
        }
    }


}
