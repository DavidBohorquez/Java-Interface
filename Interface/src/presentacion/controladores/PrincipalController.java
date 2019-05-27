/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import presentacion.vistas.PrincipalView;

/**
 *
 * @author David Bohorquez
 */
public class PrincipalController implements ActionListener {
    private PrincipalController ventana;
    
    public PrincipalController(PrincipalView ventana) {
        this.ventana = this.ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    public PrincipalController getVentana() {
        return ventana;
    }
    
    
    
}
