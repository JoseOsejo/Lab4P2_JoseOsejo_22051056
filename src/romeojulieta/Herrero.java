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
    
    public Herrero(String nombre, String apellido, int edad, double puntosVida) {
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
        if(probabilidadFallar(10)== false){
            if(atacar instanceof Agronomo){
                return puntosAtaque*1.1;
            }else if(atacar instanceof Pacifista){
                return puntosAtaque*1.05;
            }
            return puntosAtaque;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"Herrero{" + "puntosAtaque=" + puntosAtaque + '}';
    }
 
    
}
