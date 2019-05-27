/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.modelo;

import java.security.Principal;
import presentacion.vistas.PrincipalView;

/**
 *
 * @author David Bohorquez
 */
public class Modelo {
    
    private PrincipalView ventanaPrincipal;
    
    public Modelo() {
        
    }
    
    public void iniciar() {
        getVentanaPrincipal();
        ventanaPrincipal.setVisible(true);
    }

    public PrincipalView getVentanaPrincipal() {
        if(ventanaPrincipal == null) {
            ventanaPrincipal = new PrincipalView(this);
        }
        return ventanaPrincipal;
    }
    
    
}
