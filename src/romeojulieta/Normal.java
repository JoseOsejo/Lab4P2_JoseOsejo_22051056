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
public class Normal extends Aldeano
{

    private double puntosAtaque;
    
    //Julieta es una normal
    public Normal(String nombre, String apellido, int edad, double puntosVida) {
        super(nombre, apellido, edad, puntosVida);
        this.puntosAtaque = 50;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    
    @Override
    public double ataque(Aldeano atacar) {
        if(atacar instanceof Pacifista){
            return puntosAtaque*1.05;
        }
        return puntosAtaque;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"Normal{" + "puntosAtaque=" + puntosAtaque + '}';
    }


   
    
    
    
}
