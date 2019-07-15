/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
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

    private MyCanvas lienzo;

    private ImageIcon auxDimenson, imgCandlesctick;

    public GraphicPanel(GraphicComponents components, ResourceManagement resources) {
        initComponents(components, resources);
    }

    private void initComponents(GraphicComponents components, ResourceManagement resources) {
        imgCandlesctick = new ImageIcon(getClass().getResource("/resource/images/candlestick1.PNG"));

        title = components.devolverLabel("Candlestcik Chart", 2, 2, 956, 65, null, resources.getColorGrisOscuro(), resources.getColorBlanco(), resources.getFuenteTitulo1());
        title.setVerticalAlignment(SwingConstants.BOTTOM);
        title.setBorder(new EmptyBorder(0, 20, 0, 0));

        auxDimenson = new ImageIcon(imgCandlesctick.getImage().getScaledInstance(956, 436, Image.SCALE_AREA_AVERAGING));

        lienzo = getLienzo();

        add(title);
        add(lienzo);

        setLayout(null);
    }

    public MyCanvas getLienzo() {
        if (lienzo == null) {
            lienzo = new MyCanvas();
            lienzo.setBounds(2, 67, 956, 436);
            lienzo.setBackground(Color.white);
        }
        return lienzo;
    }

    public class MyCanvas extends Canvas {

        @Override
        public void paint(Graphics g) {
            g.drawImage(auxDimenson.getImage(), 0, 0, this);
        }
    }

}
