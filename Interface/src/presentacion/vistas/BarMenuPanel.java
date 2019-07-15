/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Andre Sarmiento
 */
public class BarMenuPanel extends JPanel {

    private ImageIcon auxDimension, imgClose, imgChgSize, imgMinimize;

    private JButton btnClose, btnChgSize, btnMinimize;

    public BarMenuPanel(GraphicComponents components, ResourceManagement resources) {
        initComponents(components, resources);
    }

    private void initComponents(GraphicComponents components, ResourceManagement resources) {
        imgClose = new ImageIcon(getClass().getResource("/resource/images/close.png"));
        imgChgSize = new ImageIcon(getClass().getResource("/resource/images/chgSize.png"));
        imgMinimize = new ImageIcon(getClass().getResource("/resource/images/minus.png"));

        auxDimension = new ImageIcon(imgClose.getImage().getScaledInstance(12, 12, Image.SCALE_AREA_AVERAGING));

        btnClose = components.devolverBoton(null, 1208, 0, 30, 20, null, auxDimension,
                null, null, null, null, 0, 0);

        auxDimension = new ImageIcon(imgChgSize.getImage().getScaledInstance(12, 12, Image.SCALE_AREA_AVERAGING));

        btnChgSize = components.devolverBoton(null, 1188, 0, 20, 20, null, auxDimension,
                null, null, null, null, 0, 0);

        auxDimension = new ImageIcon(imgMinimize.getImage().getScaledInstance(12, 12, Image.SCALE_AREA_AVERAGING));

        btnMinimize = components.devolverBoton(null, 1168, 0, 20, 20, null, auxDimension,
                null, null, null, null, 0, 0);

        add(btnClose);
        add(btnChgSize);
        add(btnMinimize);

        setLayout(null);
    }

    public JButton getBtnClose() {
        return btnClose;
    }

    public JButton getBtnChgSize() {
        return btnChgSize;
    }

    public JButton getBtnMinimize() {
        return btnMinimize;
    }

}
