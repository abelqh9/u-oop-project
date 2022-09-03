/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Pedido {
    
    private String fecha;
    private int idcliente;
    private int idtrabajador;
    private String mesa;
    private String descripciondelpedido;
    private double cantidad;

    public Pedido() {
    }
    
    public Pedido(String fecha , int idcliente, int idtrabajador, String mesa, String descripciondelpedido, double cantidad) {
        this.idcliente = idcliente;
        this.fecha = fecha;
        this.idtrabajador = idtrabajador;
        this.mesa = mesa;
        this.descripciondelpedido = descripciondelpedido;
        this.cantidad = cantidad;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getDescripciondelpedido() {
        return descripciondelpedido;
    }

    public void setDescripciondelpedido(String descripciondelpedido) {
        this.descripciondelpedido = descripciondelpedido;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idcliente = " + idcliente + ", idtrabajador = " + idtrabajador + ", mesa = " + mesa + ", descripciondelpedido = " + descripciondelpedido + ", cantidad = " + cantidad + '}';
    }
}
