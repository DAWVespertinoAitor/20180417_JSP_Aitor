/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

/**
 *
 * @author Daw2
 */
public class Direccion {
    private String domicilio;
    private String localidad;

    public Direccion() {
        this.domicilio = domicilio;
        this.localidad = localidad;
    }
    
    public Direccion(String domicilio, String localidad) {
        this.domicilio = domicilio;
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Direccion{" + "domicilio=" + domicilio + ", localidad=" + localidad + '}';
    }
    
    
    
}
