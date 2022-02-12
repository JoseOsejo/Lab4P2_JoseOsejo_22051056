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

    public static ArrayList<Familia> familias = new ArrayList();
    public static Familia familiaCapuleto;
    public static Familia familiaMontesco;
    public static Familia familiaOsejo;
    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Agregando Familias Principales Capuleto y Montesco y otra default
        familiaCapuleto = new Familia("Capuleto");
        familiaCapuleto.getAldeanos().add(new Normal("Julieta", "Capuleto", 20, 200));
        familiaCapuleto.getAldeanos().add(new Normal("Juan", "Capuleto", 20, 200));
        familiaCapuleto.getAldeanos().add(new Normal("Julieta", "Capuleto", 20, 200));

        familiaMontesco = new Familia("Montesco");
        familiaMontesco.getAldeanos().add(new SuperGranjero("Romeo", "Montesco", 20));
        familiaMontesco.getAldeanos().add(new Herrero("Jorge", "Montesco", 20, 200));
        familiaMontesco.getAldeanos().add(new Agronomo("Ramon", "Montesco", 20, 200));

        familiaOsejo = new Familia("Osejo");
        familiaOsejo.getAldeanos().add(new Normal("Jose", "Osejo", 20, 320));
        familiaOsejo.getAldeanos().add(new Pacifista("Claudio", "Osejo", 32, 439));
        familiaOsejo.getAldeanos().add(new Herrero("Carlos", "Osejo", 32, 500));

        familias.add(familiaCapuleto);
        familias.add(familiaMontesco);
        familias.add(familiaOsejo);
        do {
            opciones(menu());
        } while (true);

    }

    public static int menu() {
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1. Crear Familia\n"
                + "2. Crear Aldeano\n"
                + "3. Imprimir Familias\n"
                + "4. Pelear\n"
                + "Ingrese la opcion: ");
        return sc.nextInt();
    }

    public static void opciones(int opcion) {
        if (opcion == 0) {
            System.exit(0);
        } else if (opcion == 1) {
            crearFamilia();
        } else if (opcion == 2) {
            crearAldeano();
        } else if (opcion == 3) {
            imprimirFamilias();
        } else if (opcion == 4) {
            pelear();
        }
    }

    //funcion de linaje unico
    public static boolean linajeUnico(String linaje) {
        for (Familia fam : familias) {
            if (linaje.equalsIgnoreCase(fam.getLinaje())) {
                return true;
            }
        }
        return false;
    }

    //funcion para solo agregar aldeano a una familia con un linaje existente
    public static Familia retornarFamilia(String linaje) {
        for (Familia fam : familias) {
            if (fam.getLinaje().equalsIgnoreCase(linaje)) {
                return fam;
            }
        }
        System.out.println("No se encontro la Familia!");
        return null;
    }

    public static void crearFamilia() {
        System.out.println("Ingrese el Apellido de la Familia: ");
        String apellido = sc.next();
        if (linajeUnico(apellido) == false) {
            familias.add(new Familia(apellido));
        } else {
            System.out.println("La familia no se pudo crear");
        }
    }

    public static void crearAldeano() {
        System.out.println("**Tipos de Aldeanos**\n1. Normal\n2. Pacifista\n3. Herrero\n4. Agronomo\n5. Explosivo");
        System.out.println("Ingrese una opcion");
        int opcionAldeano = sc.nextInt();
        if (opcionAldeano == 1) {
            System.out.println("Ingrese el nombre del Aldeano");
            String nombreAldeano = sc.next();
            System.out.println("Ingrese el Apellido del Aldeano");
            String apellido = sc.next();
            System.out.println("Ingrese la edad del Aldeano");
            int edad = sc.nextInt();
            System.out.println("Ingrese los puntos de Vida");
            double puntosVida = sc.nextDouble();
            if(linajeUnico(apellido) == false){
                Familia fam = retornarFamilia(apellido);
                fam.getAldeanos().add(new Normal(nombreAldeano,apellido,edad,puntosVida));
            }else{
                System.out.println("No se pudo Crear el Aldeano");
            }
        }else if(opcionAldeano == 2){
            System.out.println("Ingrese el nombre del Aldeano");
            String nombreAldeano = sc.next();
            System.out.println("Ingrese el Apellido del Aldeano");
            String apellido = sc.next();
            System.out.println("Ingrese la edad del Aldeano");
            int edad = sc.nextInt();
            System.out.println("Ingrese los puntos de Vida");
            double puntosVida = sc.nextDouble();
            if(linajeUnico(apellido) == false){
                Familia fam = retornarFamilia(apellido);
                fam.getAldeanos().add(new Pacifista(nombreAldeano,apellido,edad,puntosVida));
            }else{
                System.out.println("No se pudo Crear el Aldeano");
            }
        }else if(opcionAldeano == 3)
        {
            System.out.println("Ingrese el nombre del Aldeano");
            String nombreAldeano = sc.next();
            System.out.println("Ingrese el Apellido del Aldeano");
            String apellido = sc.next();
            System.out.println("Ingrese la edad del Aldeano");
            int edad = sc.nextInt();
            System.out.println("Ingrese los puntos de Vida");
            double puntosVida = sc.nextDouble();
            if(linajeUnico(apellido) == false){
                Familia fam = retornarFamilia(apellido);
                fam.getAldeanos().add(new Herrero(nombreAldeano,apellido,edad,puntosVida));
            }else{
                System.out.println("No se pudo Crear el Aldeano");
            }
        }else if(opcionAldeano == 4){
            System.out.println("Ingrese el nombre del Aldeano");
            String nombreAldeano = sc.next();
            System.out.println("Ingrese el Apellido del Aldeano");
            String apellido = sc.next();
            System.out.println("Ingrese la edad del Aldeano");
            int edad = sc.nextInt();
            System.out.println("Ingrese los puntos de Vida");
            double puntosVida = sc.nextDouble();
            if(linajeUnico(apellido) == false){
                Familia fam = retornarFamilia(apellido);
                fam.getAldeanos().add(new Agronomo(nombreAldeano,apellido,edad,puntosVida));
            }else{
                System.out.println("No se pudo Crear el Aldeano");
            }
        }else if(opcionAldeano == 5){
            System.out.println("Ingrese el nombre del Aldeano");
            String nombreAldeano = sc.next();
            System.out.println("Ingrese el Apellido del Aldeano");
            String apellido = sc.next();
            System.out.println("Ingrese la edad del Aldeano");
            int edad = sc.nextInt();
            System.out.println("Ingrese los puntos de Vida");
            double puntosVida = sc.nextDouble();
            if(linajeUnico(apellido) == false){
                Familia fam = retornarFamilia(apellido);
                fam.getAldeanos().add(new Explosivo(nombreAldeano,apellido,edad,puntosVida));
            }else{
                System.out.println("No se pudo Crear el Aldeano");
            }
        }
    }

    public static void imprimirFamilias() {
        for (Familia fam : familias) {
            System.out.println(fam);
        }
    }

    public static void pelear() {

    }
}
