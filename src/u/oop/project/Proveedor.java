/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u.oop.project;

/**
 *
 * @author Abel
 */
public class Proveedor {
    private double idproveedor;
    private String tipodocumento;
    private String razonsocial;
    private String direccion;
    private String producto;

    public Proveedor() {
    }

    public Proveedor(double idproveedor, String tipodocumento, String razonsocial, String direccion, String producto) {
        this.idproveedor = idproveedor;
        this.tipodocumento = tipodocumento;
        this.razonsocial = razonsocial;
        this.direccion = direccion;
        this.producto = producto;
    }

    public double getIdproveedores() {
        return idproveedor;
    }

    public void setIdproveedores(double idproveedores) {
        this.idproveedor = idproveedores;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "proveedores{" + "idproveedor=" + idproveedor + ", tipodocumento=" + tipodocumento + ", razonsocial=" + razonsocial + ", direccion=" + direccion + ", producto=" + producto + '}';
    }
}
