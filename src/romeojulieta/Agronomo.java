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
public class Agronomo extends Aldeano
{
    private double puntosAtaque;

    public Agronomo(String nombre, String apellido, int edad, double puntosVida) {
        super(nombre, apellido, edad, puntosVida);
        this.puntosAtaque = 100;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }
    
    @Override
    public double ataque(Aldeano atacar) {
        if(probabilidadFallar(5)== false){
            if( atacar instanceof Pacifista){
                return puntosAtaque*1.05;
            }else if(atacar instanceof Normal){
                return puntosAtaque*1.1;
            }
            return puntosAtaque;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"Agronomo{" + "puntosAtaque=" + puntosAtaque + '}';
    }


    



    
}
