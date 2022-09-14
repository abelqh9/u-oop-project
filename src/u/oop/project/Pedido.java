/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

import java.util.Vector;

/**
 *
 * @author Abel
 */
public class Pedido {
    
    private int id;
    private String fecha;
    private Vector<Plato> platos;
    private Vector<Bebida> bebidas;

    public Pedido(int id, String fecha, Vector<Plato> platos, Vector<Bebida> bebidas) {
        this.id = id;
        this.fecha = fecha;
        this.platos = platos;
        this.bebidas = bebidas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Vector<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(Vector<Plato> platos) {
        this.platos = platos;
    }

    public Vector<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(Vector<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", fecha=" + fecha + ", platos=" + platos + ", bebidas=" + bebidas + '}';
    }
    
}
