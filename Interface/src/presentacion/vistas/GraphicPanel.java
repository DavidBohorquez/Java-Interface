/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Andre Sarmiento
 */
public class GraphicPanel extends JPanel {

    private JLabel title;

    private Canvas lienzo;

    public GraphicPanel(GraphicComponents components, ResourceManagement resources) {
        initComponents(components, resources);
    }

    private void initComponents(GraphicComponents components, ResourceManagement resources) {
        title = components.devolverLabel("Candlestcik Chart", 0, 0, 960, 65, null, resources.getColorGrisOscuro(), resources.getColorBlanco(), resources.getFuenteTitulo());
        title.setVerticalAlignment(SwingConstants.BOTTOM);
        title.setBorder(new EmptyBorder(0, 20, 0, 0));

        lienzo = getLienzo();

        add(title);
        add(lienzo);

        setLayout(null);
    }

    public Canvas getLienzo() {
        if (lienzo == null) {
            lienzo = new Canvas();
            lienzo.setBounds(0, 65, 960, 505);
            lienzo.setBackground(Color.white);
        }
        return lienzo;
    }

}
