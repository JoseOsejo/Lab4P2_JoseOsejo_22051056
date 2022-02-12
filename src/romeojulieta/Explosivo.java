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
public class Explosivo extends Aldeano
{
    
    private double puntosAtaque;

    public Explosivo(String nombre, String apellido, int edad, double puntosVida) {
        super(nombre, apellido, edad, puntosVida);
        this.puntosAtaque = 250;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public String toString() {
        return super.toString()+"Explosivo{" + "puntosAtaque=" + puntosAtaque + '}';
    }
    
    
    //ataca a todos hasta sus familiares
    @Override
    public double ataque(Aldeano atacar) {
        if(probabilidadFallar(15)== false){
            if(atacar instanceof Herrero){
                return puntosAtaque*1.05;
            }else if(atacar instanceof Agronomo){
                return puntosAtaque*1.1;
            }
            return puntosAtaque;
        }
        return 0;
    }
    
    
    
}
