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
public class Herrero extends Aldeano
{

    private double puntosAtaque;
    
    public Herrero(String nombre, String apellido, int edad, double puntosVida,double puntosAtaque) {
        super(nombre, apellido, edad, puntosVida*1.5);
        puntosAtaque = Math.random()*(200-500);
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        if(puntosAtaque>= 200 && puntosAtaque<= 500){
        this.puntosAtaque = puntosAtaque;
        }else{
            System.out.println("Sale del Rango de Ataque");
        }
    }
    
    
    @Override
    public double ataque(Aldeano atacar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Herrero{" + "puntosAtaque=" + puntosAtaque + '}';
    }
 
    
}
