/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Andre Sarmiento
 */
public class HeaderPanel extends JPanel {

    private ImageIcon auxDimension, auxDimension1, imgMenu, imgMenu1;

    private JLabel lblTitle, lblMenu;

    public HeaderPanel(GraphicComponents components, ResourceManagement resources) {
        initComponents(components, resources);
    }

    private void initComponents(GraphicComponents comoponents, ResourceManagement resources) {
        imgMenu = new ImageIcon(getClass().getResource("/resource/images/menu.png"));
        imgMenu1 = new ImageIcon(getClass().getResource("/resource/images/menu1.png"));

        lblTitle = comoponents.devolverLabel("Augment", 10, 10, 120, 50, null, resources.getColorBlanco(),
                null, resources.getFuenteTitulo3());
        lblTitle.setVerticalAlignment(JLabel.TOP);

        auxDimension = new ImageIcon(imgMenu.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));
        auxDimension1 = new ImageIcon(imgMenu1.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        lblMenu = comoponents.devolverLabel(null, 204, 8, 34, 34, auxDimension, null, resources.getColorAzulClaro(),
                null);
        lblMenu.setHorizontalAlignment(JLabel.CENTER);

        add(lblTitle);
        add(lblMenu);

        setLayout(null);
    }

    public void changeIcon(int num) {
        if (num == 0) {
            lblMenu.setIcon(auxDimension);
        } else {
            lblMenu.setIcon(auxDimension1);
        }
    }

    public JLabel getLblMenu() {
        return lblMenu;
    }

}
