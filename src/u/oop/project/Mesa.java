/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Mesa {
    private double idmesa;
    private int numeromesa;
    private String ubicacion;

    public Mesa() {
    }

    public Mesa(double idmesa, int numeromesa, String ubicacion) {
        this.idmesa = idmesa;
        this.numeromesa = numeromesa;
        this.ubicacion = ubicacion;
    }

    public double getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(double idmesa) {
        this.idmesa = idmesa;
    }

    public int getNumeromesa() {
        return numeromesa;
    }

    public void setNumeromesa(int numeromesa) {
        this.numeromesa = numeromesa;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    
    public String DetallesdeMesa() {
        return "mesa{" + "id de mesa=" + idmesa 
                + ", numero de mesa=" + numeromesa 
                + ", ubicacion=" + ubicacion + '}';
    }
}
