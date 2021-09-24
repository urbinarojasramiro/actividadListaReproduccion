/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.PGY2121.listareproduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author escor
 */
public class ListaReproduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Vamos a agregar las canciones que te gustan");
        System.out.println("Vamos a crear la lista de reproduccion fiesta");
        List<Cancion> canciones = new ArrayList<Cancion>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese titulo de la cancion");
            String titulo = s.nextLine();
            System.out.println("Ingrese nombre de artista");
            String artista = s.nextLine();
            System.out.println("Ingrese el tiempo de duración de la cancion");
            int tiempoDuracion = s.nextInt();
            
            System.out.println("Es esta una cancion favorita?\n1.-Si\n2.-No");
            int favorita = s.nextInt();
            boolean esFavorita = favorita == 1;
            System.out.println("Es esta una cancion descargable?\n1.-Si\n2.-No");
            int descargable = s.nextInt();
            s.nextLine();
            boolean descargada = descargable == 1;
            
            Cancion cancion = new Cancion(titulo, artista, tiempoDuracion, esFavorita, descargada);
            canciones.add(cancion);            
        }
        
        System.out.println("Ahora vamos a crear la lista de reproduccion estudio");
        List<Cancion> cancionesEstudio = new ArrayList<Cancion>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese titulo de la cancion");
            String titulo = s.nextLine();
            System.out.println("Ingrese nombre de artista");
            String artista = s.nextLine();
            System.out.println("Ingrese el tiempo de duración de la cancion");
            int tiempoDuracion = s.nextInt();
            
            System.out.println("Es esta una cancion favorita?\n1.-Si\n2.-No");
            int favorita = s.nextInt();
            boolean esFavorita = favorita == 1;
            System.out.println("Es esta una cancion descargable?\n1.-Si\n2.-No");
            int descargable = s.nextInt();
            s.nextLine();
            boolean descargada = descargable == 1;
            
            Cancion cancion = new Cancion(titulo, artista, tiempoDuracion, esFavorita, descargada);
            cancionesEstudio.add(cancion);            
        }
        int opcion = 0;
        int listaReproduccionSeleccionada = 0;
        int cancionSeleccionada = 0;
        while(opcion != 5){
            System.out.println("Seleccione una opcion:\n1.-Mostrar listas de reproduccion\n2.-reproducir cancion\n3.-ver cancion en reproducción\n5.-Salir");
            opcion = s.nextInt();
            if(opcion == 1){
                System.out.println("Lista de reproduccion Fiesta");
                for (Cancion c1 : canciones) {
                    System.out.println(c1.getTitulo());
                }
                System.out.println("Lista de reproduccion Estudio");
                for (Cancion c2 : cancionesEstudio) {
                    System.out.println(c2.getTitulo());
                }
            }
            if(opcion == 2){
                System.out.println("Seleccione lista:\n1.-Fiesta\n2.-Estudio");
                listaReproduccionSeleccionada = s.nextInt();
                if(listaReproduccionSeleccionada == 1){
                    System.out.println("Seleccione cancion");
                    for (int i = 0; i < canciones.size(); i++) {
                        System.out.println((i + 1) + ".-" + canciones.get(i).getTitulo());
                    }
                    cancionSeleccionada = s.nextInt();
                }
                if(listaReproduccionSeleccionada == 2){
                    System.out.println("Seleccione cancion");
                    for (int i = 0; i < cancionesEstudio.size(); i++) {
                        System.out.println((i + 1) + ".-" + cancionesEstudio.get(i).getTitulo());
                    }
                    cancionSeleccionada = s.nextInt();
                }
            }
            if(opcion == 3){
                if(listaReproduccionSeleccionada == 1){
                        System.out.println("reproduciendo: " + canciones.get(cancionSeleccionada-1).getTitulo());
                }
                if(listaReproduccionSeleccionada == 2){
                    System.out.println("reproduciendo: " + cancionesEstudio.get(cancionSeleccionada-1).getTitulo());
                }
            }
            
            
        }
    }
    
}
