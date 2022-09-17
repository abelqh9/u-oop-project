/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Cliente extends Persona{
    
    private String correo;

    public Cliente(String correo, int id, String tipo_doc, int numero_doc, String nombre, String sexo, int edad, int celular) {
        super(id, tipo_doc, numero_doc, nombre, sexo, edad, celular);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "correo=" + correo + ", id=" + this.getId() + ", tipo_doc=" + this.getTipo_doc() + ", numero_doc=" + this.getNumero_doc() + ", nombre=" + this.getNombre() + ", sexo=" + this.getSexo() + ", edad=" + this.getEdad() + ", celular=" + this.getCelular() + '}';
    }
}
