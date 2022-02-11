/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romeojulieta;

import java.util.ArrayList;

/**
 *
 * @author jcoq2
 */
public class Familia 
{
    private String linaje;//unico
    private ArrayList<Aldeano>aldeanos;

    public Familia(String linaje) {
        this.linaje = linaje;
        this.aldeanos = new ArrayList();
    }

    public String getLinaje() {
        return linaje;
    }

    public void setLinaje(String linaje) {
        this.linaje = linaje;
    }

    public ArrayList<Aldeano> getAldeanos() {
        return aldeanos;
    }

    public void setAldeanos(ArrayList<Aldeano> aldeanos) {
        this.aldeanos = aldeanos;
    }    
    
    @Override
    public String toString() {
        return "Familia{" + "linaje=" + linaje + ", aldeanos=" + aldeanos + '}';
    }
    
    
}
