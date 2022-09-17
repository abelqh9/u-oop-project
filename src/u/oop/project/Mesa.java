/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

import java.util.Vector;
import javafx.collections.ObservableList;

/**
 *
 * @author Abel
 */
public class Mesa {
    
    private double id;
    private int numero;
    private ObservableList<Cliente> clientes;
    private ObservableList<Plato> platos;
    private Trabajador trabajador;

    public Mesa() {
        
    }

    public Mesa(double id, int numero, ObservableList<Cliente> clientes, ObservableList<Plato> platos, Trabajador trabajador) {
        this.id = id;
        this.numero = numero;
        this.clientes = clientes;
        this.platos = platos;
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

    public ObservableList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ObservableList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ObservableList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ObservableList<Plato> platos) {
        this.platos = platos;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public String toString() {
        return "Mesa{" + "id=" + id + ", numero=" + numero + ", clientes=" + clientes + ", platos=" + platos + ", trabajador=" + trabajador + '}';
    }
  
}