package umg.renato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * Created by IT DASA on 28/06/2017.
 */
public class MainApp {

    public static void main(String[] args) throws IOException {
        // write your code here
        //IOException e = new IOException();
        BufferedReader Guardar = new BufferedReader((new InputStreamReader(System.in)));
        Especialista miEspecialista = new Especialista();
        int CantidadDeportes, Contador=0;

        System.out.println("Ingrese los diferentes tipos de deporte");
        System.out.println("");
        System.out.println("Por favor ingrese el nombre del especialista: ");

        miEspecialista.setNombre(Guardar.readLine());

        System.out.println("");
        //System.out.println("Bienvenido " + miEspecialista.getNombre() + ", usted es nuestro especialista en deportes.");
        System.out.println("");
        System.out.println("¿Cuántos deportes desea ingresar al sistema? ");
        CantidadDeportes= Integer.parseInt(Guardar.readLine());
        //System.out.println("Ingreso: " +CantidadDeportes);

        Deporte[] listadoDeporte = new Deporte[CantidadDeportes];

        for (int i=0; i<CantidadDeportes; i++){
            listadoDeporte[i] = new Deporte();
            System.out.println("Por favor ingrese el nombre del deporte: ");
            listadoDeporte[i].setNombre(Guardar.readLine());

            String Respuesta;

            //System.out.println("¿"+listadoDeporte[0].getNombre()+" es un deporte que utiliza balón (S/N)? ");
            System.out.println("¿"+ listadoDeporte[i].getNombre() +" es un deporte que utiliza balón (S/N)? ");
            Respuesta = Guardar.readLine();

            if ( Respuesta.equals("s") || Respuesta.equals("S") )
                listadoDeporte[i].setConBalon(Boolean.TRUE);
        }

        for (int i=CantidadDeportes-1; i>=0; i--) {
            if (listadoDeporte[i].getConBalon() == Boolean.TRUE) {
                //System.out.println(listadoDeporte[i].getNombre() + " " + listadoDeporte[i].getConBalon());
                System.out.println("");
                System.out.println("La lista de deportes que ingreso es la siguiente:");
                System.out.println(listadoDeporte[i].getNombre() + " " );
            }
        }
    }


}
