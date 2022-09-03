/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Cliente {
    
    private String tipodocumento;
    private int numerodocumento;
    private String nombre;
    private String apellido;
    private String direccion;
    
    public Cliente (){}
    
    public Cliente(String tipodocumento, int numerodocumento, String nombre, String apellido, String direccion) {
        this.tipodocumento = tipodocumento;
        this.numerodocumento = numerodocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    
    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public int getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(int numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "tipodocumento = " + tipodocumento + ", numerodocumento = " + numerodocumento + ", nombre = " + nombre + ", apellido = " + apellido + ", direccion = " + direccion + '}';
    }
}
