/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romeojulieta;

/**
 *
 * @author jcoq2
 */
public abstract class Aldeano 
{
    protected String nombre;
    protected String apellido;//no se puede repetir y se agrega a la lista de aldeanos da la familia segun el apellido
    protected int edad;
    protected double puntosVida;

    public Aldeano(String nombre, String apellido, int edad, double puntosVida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.puntosVida = puntosVida;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(double puntosVida) {
        this.puntosVida = puntosVida;
    }
    public abstract double ataque(Aldeano atacar);

    @Override
    public String toString() {
        return "Aldeano{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", puntosVida=" + puntosVida + '}';
    }
    
    
    
}
