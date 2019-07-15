/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Andre Sarmiento
 */
public class TPPanel extends JPanel {

    private ImageIcon auxDimension, background;

    private ResourceManagement resources;

    public TPPanel(GraphicComponents components, ResourceManagement resources) {
        this.resources = resources;

        initComponents(components, resources);
    }

    private void initComponents(GraphicComponents components, ResourceManagement resources) {
        background = new ImageIcon(getClass().getResource("/resource/images/TB.jpg"));

        auxDimension = new ImageIcon(background.getImage().getScaledInstance(960, 505, Image.SCALE_AREA_AVERAGING));

        setLayout(null);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(auxDimension.getImage(), 0, 0, this);
        g.setFont(resources.getFuenteTitulo4());
        //g.drawString("Cristian", 650, 450);
    }

}
