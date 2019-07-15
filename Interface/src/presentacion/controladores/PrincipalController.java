/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.controladores;

import java.awt.Cursor;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
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

            ventana.getPnlTP().setVisible(false);
            ventana.getPnlGraphic().setVisible(true);
        } else if (e.getSource().equals(ventana.getPnlMenu().getBtnTandP())) {
            System.out.println("ENTRO P!!!!");

            ventana.getPnlGraphic().setVisible(false);
            ventana.getPnlTP().setVisible(true);
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
        } else if (e.getSource().equals(ventana.getPnlBarMenu().getBtnChgSize())) {

        } else if (e.getSource().equals(ventana.getPnlBarMenu().getBtnMinimize())) {
            ventana.setExtendedState(Frame.ICONIFIED);
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
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            if ((button.equals(ventana.getPnlBarMenu().getBtnClose()))
                    || (button.equals(ventana.getPnlBarMenu().getBtnChgSize()))
                    || (button.equals(ventana.getPnlBarMenu().getBtnMinimize()))) {
                button.setBackground(ventana.getModelo().getResources().getColorAzulOscuro1());
            } else {
                //if (e.getSource().equals(ventana.getPnlMenu().getBtnDashboard())) {
                button.setBackground(ventana.getModelo().getResources().getColorAzulClaro());
                //}
            }
        }

        if (e.getSource() instanceof JLabel) {
            JLabel lbl = (JLabel) e.getSource();

            if (e.getSource().equals(ventana.getPnlHeader().getLblMenu())) {
                ventana.getPnlHeader().changeIcon(1);
            }
            ventana.setCursor(ventana.getModelo().getResources().getMano());
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            if ((button.equals(ventana.getPnlBarMenu().getBtnClose()))
                    || (button.equals(ventana.getPnlBarMenu().getBtnChgSize()))
                    || (button.equals(ventana.getPnlBarMenu().getBtnMinimize()))) {
                button.setBackground(null);
            } else {
                button.setBackground(ventana.getModelo().getResources().getColorAzulOscuro1());
            }
        }

        if (e.getSource() instanceof JLabel) {
            JLabel lbl = (JLabel) e.getSource();

            if (e.getSource().equals(ventana.getPnlHeader().getLblMenu())) {
                ventana.getPnlHeader().changeIcon(0);
            }
            ventana.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }

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
