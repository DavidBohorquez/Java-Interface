/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import javax.swing.JFrame;
import presentacion.controladores.PrincipalController;
import presentacion.modelo.Modelo;

/**
 *
 * @author David Bohorquez
 */
public class PrincipalView extends JFrame {
    private Modelo modelo;
    private PrincipalController controlador;
    
    public PrincipalView(Modelo modelo) {
        this.modelo = modelo;
        
        initComponents();
        asignarListeners();
    }
    
    public void initComponents() {
        setSize(400, 400);
    }
    
    public void asignarListeners() {
        
    }

    public Modelo getModelo() {
        return modelo;
    }

    public PrincipalController getControlador() {
        if(controlador == null) {
            controlador = new PrincipalController(this);
        }
        return controlador;
    }
    
    
    
}
