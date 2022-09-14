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
public class Mesa {
    
    private double id;
    private int numero;
    private Vector<Cliente> clientes;
    private Pedido pedido;
    private Trabajador trabajador;

    public Mesa() {
    }

    public Mesa(double id, int numero, Vector<Cliente> clientes, Pedido pedido, Trabajador trabajador) {
        this.id = id;
        this.numero = numero;
        this.clientes = clientes;
        this.pedido = pedido;
        this.trabajador = trabajador;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Vector<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Vector<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public String toString() {
        return "Mesa{" + "id=" + id + ", numero=" + numero + ", clientes=" + clientes + ", pedido=" + pedido + ", trabajador=" + trabajador + '}';
    }
  
}