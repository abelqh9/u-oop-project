/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Insumo {
    private String descripcion;
    private String tipo;
    private double cantidad;
    //sobrecarga de constructores

    public Insumo() {
    }

    public Insumo(String n, String t, double c) {
        this.descripcion = n;
        this.tipo = t;
        this.cantidad = c;
    }

    String MostrarDatos() {
        return "Descripcion :   " + descripcion
                + "\nTipo        :   " + tipo
                + "\nCantidad    :   " + cantidad;
    }
}
