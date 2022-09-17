/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Abel
 */
public class AddClientBox {
    
    static Cliente newClient;
    
    public static Cliente display(){
        
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Añade a un cliente");
        window.setMinWidth(300);
        
        HBox idBox = new HBox(10);
        TextField idInput = new TextField();
        Label idLabel = new Label("Id");
        idBox.getChildren().addAll(idLabel, idInput);
        
        HBox tipoDocBox = new HBox(10);
        TextField tipoDocInput = new TextField();
        Label tipoDocLabel = new Label("Tipo de doc");
        tipoDocBox.getChildren().addAll(tipoDocLabel, tipoDocInput);
        
        HBox numDocBox = new HBox(10);
        TextField numDocInput = new TextField();
        Label numDocLabel = new Label("Num de doc");
        numDocBox.getChildren().addAll(numDocLabel, numDocInput);
        
        HBox nameBox = new HBox(10);
        TextField nameInput = new TextField();
        Label nameLabel = new Label("Nombre");
        nameBox.getChildren().addAll(nameLabel, nameInput);
        
        HBox sexBox = new HBox(10);
        TextField sexInput = new TextField();
        Label sexLabel = new Label("Sexo");
        sexBox.getChildren().addAll(sexLabel, sexInput);
        
        HBox edadBox = new HBox(10);
        TextField edadInput = new TextField();
        Label edadLabel = new Label("Edad");
        edadBox.getChildren().addAll(edadLabel, edadInput);
        
        HBox celularBox = new HBox(10);
        TextField celularInput = new TextField();
        Label celularLabel = new Label("Celular");
        celularBox.getChildren().addAll(celularLabel, celularInput);
        
        HBox correoBox = new HBox(10);
        TextField correoInput = new TextField();
        Label correoLabel = new Label("Correo");
        correoBox.getChildren().addAll(correoLabel, correoInput);
        
        Button addClient = new Button("añadir");
        
        addClient.setOnAction(e -> {
            newClient = new Cliente(
                    correoInput.getText(), 
                    Integer.parseInt(idInput.getText()),
                    tipoDocInput.getText(), 
                    Integer.parseInt(numDocInput.getText()),
                    nameInput.getText(), 
                    sexInput.getText(), 
                    Integer.parseInt(edadInput.getText()),
                    Integer.parseInt(celularInput.getText())
            );
            window.close();
        });
                
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(
                idBox,
                tipoDocBox,
                numDocBox,
                nameBox,
                sexBox,
                edadBox,
                celularBox,
                correoBox,
                addClient
        );
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return newClient;
    }
    
}
