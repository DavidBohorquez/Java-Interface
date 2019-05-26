
package presentacion.vistas;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Estudiantes
 */
public class PanelInicio extends JPanel{
    
    private JPanel panelArribaIzquierda;
    private JPanel panelArribaCentro;
    private JPanel panelArribaDerecha;
    private JPanel panelAbajoIzquierda;
    private JPanel panelAbajoDerecha;
    
    public PanelInicio(Color colorVerde, Color colorNaranja, Color colorBlanco){
        panelArribaIzquierda= new JPanel();
        panelArribaIzquierda.setBounds(30,50, 250, 200);
        panelArribaIzquierda.setLayout(null);
        panelArribaIzquierda.setBackground(colorVerde);
        add(panelArribaIzquierda);
        
        panelArribaCentro= new JPanel();
        panelArribaCentro.setBounds(310,50, 250, 200);
        panelArribaCentro.setLayout(null);
        panelArribaCentro.setBackground(colorNaranja);
        add(panelArribaCentro);
        
        panelArribaDerecha= new JPanel();
        panelArribaDerecha.setBounds(590,50, 250, 200);
        panelArribaDerecha.setLayout(null);
        panelArribaDerecha.setBackground(colorVerde);
        add(panelArribaDerecha);
        
        panelAbajoIzquierda= new JPanel();
        panelAbajoIzquierda.setBounds(50,300, 350, 200);
        panelAbajoIzquierda.setLayout(null);
        panelAbajoIzquierda.setBackground(colorBlanco);
        add(panelAbajoIzquierda);
        
        panelAbajoDerecha= new JPanel();
        panelAbajoDerecha.setBounds(480,300, 350, 200);
        panelAbajoDerecha.setLayout(null);
        panelAbajoDerecha.setBackground(colorBlanco);
        add(panelAbajoDerecha);
        
        setSize(880, 550);
        setLayout(null);
        setVisible(true);
    }
}
