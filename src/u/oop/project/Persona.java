/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Persona {
    
    private int id;
    private String tipo_doc;
    private int numero_doc;
    private String nombre;
    private String sexo;
    private int edad;
    private int celular;

    public Persona(int id, String tipo_doc, int numero_doc, String nombre, String sexo, int edad, int celular) {
        this.id = id;
        this.tipo_doc = tipo_doc;
        this.numero_doc = numero_doc;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public int getNumero_doc() {
        return numero_doc;
    }

    public void setNumero_doc(int numero_doc) {
        this.numero_doc = numero_doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", tipo_doc=" + tipo_doc + ", numero_doc=" + numero_doc + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", celular=" + celular + '}';
    }
    
}
