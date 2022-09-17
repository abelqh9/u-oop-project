/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
public class AddMozoBox {
    
    static Trabajador mozoSeleccionado;
    
    public static Trabajador display(){
        
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Selecciona un Mozo");
        window.setMinWidth(300);
        
        CheckBox box1 = new CheckBox("Juan Alberto");
        CheckBox box2 = new CheckBox("Alan Garcia");
        CheckBox box3 = new CheckBox("Rafael Lopez");
        
        Button setMozo = new Button("Asignar");
        
        setMozo.setOnAction(e -> {
            if(box1.isSelected()){
                mozoSeleccionado = new Trabajador(
                        "Mozo",
                        1200,
                        1,
                        "DNI",
                        74356031,
                        "Juan Alberto",
                        "M",
                        22,
                        987418328
                );
                window.close();
            }else if(box2.isSelected()){
                mozoSeleccionado = new Trabajador(
                        "Mozo",
                        1200,
                        2,
                        "DNI",
                        73354031,
                        "Alan Garcia",
                        "M",
                        26,
                        934418328
                );
                window.close();
            }else if(box3.isSelected()){
                mozoSeleccionado = new Trabajador(
                        "Mozo",
                        1200,
                        1,
                        "DNI",
                        74950031,
                        "Rafael Lopez",
                        "M",
                        32,
                        987411328
                );
                window.close();
            }
        });
                
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(
                box1,
                box2,
                box3,
                setMozo
        );
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return mozoSeleccionado;
    }
}
