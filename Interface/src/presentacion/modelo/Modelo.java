/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.modelo;

import presentacion.vistas.GraphicComponents;
import presentacion.vistas.PersonalizedComponents;
import presentacion.vistas.PrincipalView;
import presentacion.vistas.ResourceManagement;

/**
 *
 * @author David Bohorquez
 */
public class Modelo {

    private GraphicComponents components;
    private PersonalizedComponents pzdComponents;
    private ResourceManagement resources;
    private PrincipalView ventanaPrincipal;

    public Modelo() {

    }

    public void iniciar() {
        getVentanaPrincipal();
        ventanaPrincipal.setVisible(true);
    }

    public PrincipalView getVentanaPrincipal() {
        if (ventanaPrincipal == null) {
            ventanaPrincipal = new PrincipalView(this);
        }
        return ventanaPrincipal;
    }

    public GraphicComponents getComponents() {
        if (components == null) {
            components = new GraphicComponents();
        }
        return components;
    }

    public PersonalizedComponents getPzdComponents() {
        if (pzdComponents == null) {
            pzdComponents = new PersonalizedComponents();
        }
        return pzdComponents;
    }

    public ResourceManagement getResources() {
        if (resources == null) {
            resources = new ResourceManagement(getPzdComponents());
        }
        return resources;
    }

}
