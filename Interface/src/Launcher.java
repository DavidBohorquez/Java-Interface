
import presentacion.modelo.Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Bohorquez
 */
public class Launcher {
    private Modelo modelo;
    
    public Launcher() {
        modelo = new Modelo();
        modelo.iniciar();
    }
    
    public static void main(String[] args) {
        new Launcher();
    }
    
}
