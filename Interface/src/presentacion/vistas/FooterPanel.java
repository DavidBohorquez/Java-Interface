/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Andre Sarmiento
 */
public class FooterPanel extends JPanel {

    private JLabel lblFooter;

    public FooterPanel(GraphicComponents components, ResourceManagement resources) {
        initComponents(components, resources);

        setLayout(null);
    }

    private void initComponents(GraphicComponents components, ResourceManagement resources) {
        lblFooter = components.devolverLabel("2019 Augment. All rights Reserved | Design by", 0, 0, 988, 30,
                null, resources.getColorBlanco(), null, resources.getFuenteTexto());
        lblFooter.setHorizontalAlignment(SwingConstants.CENTER);

        add(lblFooter);
    }
}
