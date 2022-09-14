/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Trabajador extends Persona{
    
    private String cargo;
    private double sueldo;

    public Trabajador(String cargo, double sueldo, int id, String tipo_doc, int numero_doc, String nombre, String sexo, int edad, int celular) {
        super(id, tipo_doc, numero_doc, nombre, sexo, edad, celular);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }
}
