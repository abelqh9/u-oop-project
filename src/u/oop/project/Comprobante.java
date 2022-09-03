/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Comprobante {
   
   private int idcomprobante;
   private String tipocomprobante;
   private int fecha;
   private String datoscliente;
   private String datospedido;
   private double preciototal;

    public Comprobante(int idcomprobante, String tipocomprobante, int fecha, String datoscliente, String datospedido, double preciototal) {
        this.idcomprobante = idcomprobante;
        this.tipocomprobante = tipocomprobante;
        this.fecha = fecha;
        this.datoscliente = datoscliente;
        this.datospedido = datospedido;
        this.preciototal = preciototal;
    }

    public int getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(int idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public String getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(String tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDatoscliente() {
        return datoscliente;
    }

    public void setDatoscliente(String datoscliente) {
        this.datoscliente = datoscliente;
    }

    public String getDatospedido() {
        return datospedido;
    }

    public void setDatospedido(String datospedido) {
        this.datospedido = datospedido;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }
}
