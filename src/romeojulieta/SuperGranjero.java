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
public class SuperGranjero extends Aldeano{
    private double puntosAtaque;

    public SuperGranjero(double puntosAtaque, String nombre, String apellido, int edad, double puntosVida) {
        super(nombre, apellido, edad, 1000);
        this.puntosAtaque = 1000;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public double ataque(Aldeano atacar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "SuperGranjero{" + "puntosAtaque=" + puntosAtaque + '}';
    }

    
    
}
