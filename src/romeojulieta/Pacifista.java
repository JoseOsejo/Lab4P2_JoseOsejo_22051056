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
public class Pacifista extends Aldeano
{
private String discursoPaz;

    public Pacifista(String nombre, String apellido, int edad, double puntosVida) {
        super(nombre, apellido, edad, puntosVida);
    }

    @Override
    public double ataque(Aldeano atacar) {
        System.out.println(this.discursoPaz);
        return 0; //To change body of generated methods, choose Tools | Templates.
    }

    public String getDiscursoPaz() {
        return discursoPaz;
    }

    public void setDiscursoPaz(String discursoPaz) {
        this.discursoPaz = discursoPaz;
    }

    @Override
    public String toString() {
        return super.toString()+ "Pacifista{" + "discursoPaz=" + discursoPaz + '}';
    }


}
