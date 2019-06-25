/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import presentacion.vistas.PrincipalView;

/**
 *
 * @author David Bohorquez
 */
public class PrincipalController implements ActionListener, MouseListener, MouseMotionListener {

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
        } else if (e.getSource().equals(ventana.getPnlMenu().getBtnCharts())) {
            System.out.println("ENTRO Charts!!!!");
        }

        if (e.getSource().equals(ventana.getPnlBarMenu().getBtnClose())) {
            System.out.println("EXIT!!!!!!!!!!!");
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        ventana.setXMouse(e.getX());
        ventana.setYMouse(e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource().equals(ventana.getPnlBarMenu())) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();

            System.out.println(x + ", " + y);

            ventana.setLocation(x - ventana.getXMouse(), y - ventana.getYMouse());
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public PrincipalView getVentana() {
        return ventana;
    }

}
