/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Trabajador {
    
    private String nombre;
    private String apellido;
    private double sueldo;
    //sobrecarga de constructores

    public Trabajador() {
        System.out.println("probando");
    }

    public Trabajador(String n, String a, double s) {
        this.nombre = n;
        this.apellido = a;
        this.sueldo = s;

    }

    String MostrarDatos() {
        return "Nombres    :   " + nombre
                + "\nApellidos  :   " + apellido
                + "\nSueldo     :   " + sueldo;
    }
}
