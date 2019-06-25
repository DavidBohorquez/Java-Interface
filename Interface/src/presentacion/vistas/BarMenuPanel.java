/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Andre Sarmiento
 */
public class BarMenuPanel extends JPanel {

    private ImageIcon auxDimension, imgClose;

    private JButton btnClose;

    public BarMenuPanel(GraphicComponents components, ResourceManagement resources) {
        initComponents(components, resources);
    }

    private void initComponents(GraphicComponents components, ResourceManagement resources) {
        imgClose = new ImageIcon(getClass().getResource("/resource/images/cerrar.png"));

        auxDimension = new ImageIcon(imgClose.getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));

        btnClose = components.devolverBoton(null, 1218, 0, 20, 20, resources.getMano(), auxDimension,
                null, null, null, null, 0, 0);

        add(btnClose);

        setLayout(null);
    }

    public JButton getBtnClose() {
        return btnClose;
    }

}
