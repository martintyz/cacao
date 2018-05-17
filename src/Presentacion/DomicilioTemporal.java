/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Sistemas
 */
public class DomicilioTemporal {

    private String Descripcion, Calle, CalleRef1, CalleRef2,NoInterior, NoExterior,CodigoPostal, Colonia,Ciudad, Estado,  TipoVivienda, TipoAsentamiento;

    public DomicilioTemporal(String Descripcion, String Calle, String CalleRef1, String CalleRef2, String NoInterior, String NoExterior, String CodigoPostal, String Colonia, String Ciudad, String Estado, String TipoVivienda, String TipoAsentamiento) {
        this.Descripcion = Descripcion;
        this.Calle = Calle;
        this.CalleRef1 = CalleRef1;
        this.CalleRef2 = CalleRef2;
        this.NoInterior = NoInterior;
        this.NoExterior = NoExterior;
        this.CodigoPostal = CodigoPostal;
        this.Colonia = Colonia;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
        this.TipoVivienda = TipoVivienda;
        this.TipoAsentamiento = TipoAsentamiento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
    public String getNoInterior() {
        return NoInterior;
    }

    public void setNoInterior(String NoInterior) {
        this.NoInterior = NoInterior;
    }

    public String getNoExterior() {
        return NoExterior;
    }

    public void setNoExterior(String NoExterior) {
        this.NoExterior = NoExterior;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    public String getCalleRef1() {
        return CalleRef1;
    }

    public void setCalleRef1(String CalleRef1) {
        this.CalleRef1 = CalleRef1;
    }

    public String getCalleRef2() {
        return CalleRef2;
    }

    public void setCalleRef2(String CalleRef2) {
        this.CalleRef2 = CalleRef2;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTipoVivienda() {
        return TipoVivienda;
    }

    public void setTipoVivienda(String TipoVivienda) {
        this.TipoVivienda = TipoVivienda;
    }

    public String getTipoAsentamiento() {
        return TipoAsentamiento;
    }

    public void setTipoAsentamiento(String TipoAsentamiento) {
        this.TipoAsentamiento = TipoAsentamiento;
    }
    
    
    
}
