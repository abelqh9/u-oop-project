/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Plato {
    //atributos
    int idplato;
    String tipoplato;
    String descripcion;
    double precio;
       
    public Plato(int i, String t, String d, double pre){
        this.idplato = i;
        this.tipoplato= t;
        this.descripcion=d;
        this.precio=pre;
    }

    public int getIdplato() {
        return idplato;
    }

    public void setIdplato(int idplato) {
        this.idplato = idplato;
    }

    public String getTipoplato() {
        return tipoplato;
    }

    public void setTipoplato(String tipoplato) {
        this.tipoplato = tipoplato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
