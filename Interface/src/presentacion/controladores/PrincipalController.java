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

    private PrincipalView ventana;

    public PrincipalController(PrincipalView ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ventana.getPnlMenu().getBtnDashboard())) {
            System.out.println("ENTRO DASH!!!!");
        } else if (e.getSource().equals(ventana.getPnlMenu().getBtnTandP())) {
            System.out.println("ENTRO P!!!!");
        } else if (e.getSource().equals(ventana.getPnlMenu().getBtnUi())) {
            System.out.println("ENTRO Ui!!!!");
        } else if (e.getSource().equals(ventana.getPnlMenu().getBtnTypo())) {
            System.out.println("ENTRO Typo!!!!");
        } else if (e.getSource().equals(ventana.getPnlMenu().getBtnPages())) {
            System.out.println("ENTRO Pages!!!!");
        } else if (e.getSource().equals(ventana.getPnlMenu().getBtnMail())) {
            System.out.println("ENTRO Mail!!!!");
        } else if (e.getSource().equals(ventana.getPnlMenu().getBtnComponents())) {
            System.out.println("ENTRO Components!!!!");
        }else if (e.getSource().equals(ventana.getPnlMenu().getBtnCharts())) {
            System.out.println("ENTRO Charts!!!!");
        }
    }

    public PrincipalView getVentana() {
        return ventana;
    }

}
