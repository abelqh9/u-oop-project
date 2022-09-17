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
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Abel
 */
public class SeePedido {
    
    static boolean limpiarMesa;
    
    public static boolean display(Mesa mesa){
        
        Stage window = new Stage();
        
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Ver Comprobante");
        window.setMinWidth(300);
        
        Label MesaLabel = new Label("Mesa: " + String.valueOf(mesa.getNumero()));
        Label ClientesLabel = new Label("Cliente:");
        Label PlatosLabel = new Label("Platos:");
        Label MozoLabel = new Label("Mozo: " + mesa.getTrabajador().getNombre());
        
        Double cuentaTotalApagar = 0.0;
        
        Button okbtn = new Button("Ok");
        Button limpiarbtn = new Button("Limpiar Mesa");
        
        okbtn.setOnAction(e -> {
            limpiarMesa = false;
            window.close();
        });
        
        limpiarbtn.setOnAction(e -> {
            limpiarMesa = true;
            window.close();
        });
                
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(
                MesaLabel,
                ClientesLabel
        );
        for(int i = 0; i < mesa.getClientes().size(); i++){
            Cliente ClienteI = mesa.getClientes().get(i);
            Label ClienteLabel = new Label("NOMBRE: " + ClienteI.getNombre() + "  DNI: " + String.valueOf(ClienteI.getId()));
            layout.getChildren().addAll(
                ClienteLabel
            );
        }
        layout.getChildren().addAll(
                PlatosLabel
        );
        for(int i = 0; i < mesa.getPlatos().size(); i++){
            Plato PlatoI = mesa.getPlatos().get(i);
            cuentaTotalApagar += PlatoI.getPrecio();
            Label PlatoLabel = new Label("PLATO: " + PlatoI.getNombre() + "  COSTO: " + String.valueOf(PlatoI.getPrecio()));
            layout.getChildren().addAll(
                PlatoLabel
            );
        }
        layout.getChildren().addAll(
                MozoLabel,
                okbtn,
                limpiarbtn
        );
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
        return limpiarMesa;
    }
    
}
