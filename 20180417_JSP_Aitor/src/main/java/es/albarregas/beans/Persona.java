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
public class Persona {
    private String nombre;
    private String numHijos;
    private int sueldo;
    private Direccion direccion;

    public Persona() {
        this.nombre = nombre;
        this.numHijos = numHijos;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }
    public Persona(String nombre, String numHijos, int sueldo, Direccion direccion) {
        this.nombre = nombre;
        this.numHijos = numHijos;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(String numHijos) {
        this.numHijos = numHijos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", numHijos=" + numHijos + ", sueldo=" + sueldo + ", direccion=" + direccion + '}';
    }
    
    
    
}
