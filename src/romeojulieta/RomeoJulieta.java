/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romeojulieta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jcoq2
 */
public class RomeoJulieta {

    static ArrayList<Familia> familias = new ArrayList();
    static Familia FamiliaCapuleto;
    static Familia FamiliaMontesco;
    static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Agregando Familias Principales Capuleto y Montesco
        FamiliaCapuleto = new Familia("Capuleto");
        FamiliaCapuleto.getAldeanos().add(new Normal("Julieta", "Capuleto", 20, 200));
        FamiliaCapuleto.getAldeanos().add(new Normal("Juan", "Capuleto", 20, 200));
        FamiliaCapuleto.getAldeanos().add(new Normal("Julieta", "Capuleto", 20, 200));

        FamiliaMontesco = new Familia("Montesco");
        FamiliaCapuleto.getAldeanos().add(new SuperGranjero("Romeo", "Montesco", 20));
        FamiliaCapuleto.getAldeanos().add(new Herrero("Jorge", "Montesco", 20, 200));
        FamiliaCapuleto.getAldeanos().add(new Agronomo("Ramon", "Montesco", 20, 200));
        
        familias.add(FamiliaCapuleto);
        familias.add(FamiliaMontesco);
        
        do{
            opciones( menu() );
        }while(true);

    }

    public static int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1. Crear Familia\n" +
                            "2. Crear Aldeano\n" +
                            "3. Imprimir Familias\n" +
                            "4. Pelear\n" +
                            "Ingrese la opcion: ");
        return sc.nextInt();
    }
    public static void opciones(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1)
            crearFamilia();
        else if(opcion == 2)
            logout();
        else if(opcion == 3)
            crearAlumnos();
        else if(opcion == 4)
            editarAlumno();
    }
    


    
    
    
    //funcion de linaje unico
    public static boolean linajeUnico(String linaje)
    {
        for(Familia fam: familias)
        {
            if(linaje.equalsIgnoreCase(fam.getLinaje())){
                return true;
            }
        }
        return false;
    }
    
    //funcion para solo agregar aldeano a una familia con un linaje existente
    public static void agregarAldeano(Aldeano aldeano)
    {
        for(Familia fam: familias){
            if(fam.getLinaje().equalsIgnoreCase(aldeano.getApellido())){
                int pos = familias.indexOf(fam.getLinaje());
                familias.get(pos).getAldeanos().add(aldeano);
            }
        }
    }
    
    public static void crearFamilia(){
        System.out.println("Ingrese el Apellido de la Familia: ");
        String apellido = sc.next();
        if(linajeUnico(apellido) == false){
        familias.add(new Familia(apellido));
        }
        }
}
