/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.PGY2121.listareproduccion;

import java.util.List;

/**
 *
 * @author escor
 */
public class Canciones {
    
    private List<Cancion> canciones;

    public Canciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public Canciones() {
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    
    
}
