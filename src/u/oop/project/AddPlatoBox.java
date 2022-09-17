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
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Abel
 */
public class AddPlatoBox {
        
    static Plato platoSeleccionado;
    
    public static Plato display(){
        
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Selecciona un Mozo");
        window.setMinWidth(300);
        
        CheckBox box1 = new CheckBox("1/4 pollo + 750ml Inkacola");
        CheckBox box2 = new CheckBox("1/2 pollo + 1.5lt Inkacola");
        CheckBox box3 = new CheckBox("1/2 + 1/4 pollo + 2lt Inkacola");
        CheckBox box4 = new CheckBox("1 pollo + 3lt Inkacola");
        
        Button setPlato = new Button("Pedir");
        
        setPlato.setOnAction(e -> {
            if(box1.isSelected()){
                platoSeleccionado = new Plato(
                        1,
                        "Para 1",
                        "1/4 pollo + 750ml Inkacola",
                        15
                );
                window.close();
            }else if(box2.isSelected()){
                platoSeleccionado = new Plato(
                        1,
                        "Para 2",
                        "1/2 pollo + 1.5lt Inkacola",
                        15
                );
                window.close();
            }else if(box3.isSelected()){
                platoSeleccionado = new Plato(
                        1,
                        "Para 3",
                        "1/2 + 1/4 pollo + 2lt Inkacola",
                        15
                );
                window.close();
            }else if(box4.isSelected()){
                platoSeleccionado = new Plato(
                        1,
                        "Para 4",
                        "1 pollo + 3lt Inkacola",
                        15
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
                box4,
                setPlato
        );
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return platoSeleccionado;
    }
}
