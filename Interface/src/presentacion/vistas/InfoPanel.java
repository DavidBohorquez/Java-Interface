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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Andre Sarmiento
 */
public class InfoPanel extends JPanel {

    private ImageIcon auxDimension, imgPhoto, imgProfile, imgSettings, imgPower;

    private JLabel lblPhoto, lblName, lblOccupation;

    private JButton btnProfile, btnSettings, btnPower;

    public InfoPanel(GraphicComponents components, ResourceManagement resources) {
        initComponents(components, resources);
    }

    private void initComponents(GraphicComponents components, ResourceManagement resources) {
        imgPhoto = new ImageIcon(getClass().getResource(""));
        imgProfile = new ImageIcon(getClass().getResource("/resource/images/profile.png"));
        imgSettings = new ImageIcon(getClass().getResource("/resource/images/settings.png"));
        imgPower = new ImageIcon(getClass().getResource("/resource/images/power.png"));

        lblPhoto = components.devolverLabel(null, 85, 30, 80, 80, imgPhoto, null, new Color(200, 224, 225), null);
        lblName = components.devolverLabel("Jasmin Leo", 25, 120, 200, 20, null, resources.getColorAzulClaro(), null, resources.getFuenteTitulo2());
        lblName.setHorizontalAlignment(SwingConstants.CENTER);
        lblOccupation = components.devolverLabel("<html><p style: text-align:center;>System Administrator in Company</p></html>",
                55, 150, 150, 30, null, resources.getColorGrisOscuro(), null, resources.getFuenteTexto());

        auxDimension = new ImageIcon(imgProfile.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnProfile = components.devolverBoton(null, 59, 200, 24, 24, resources.getMano(),
                auxDimension, null, null, null, null, 1, 0);

        auxDimension = new ImageIcon(imgSettings.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnSettings = components.devolverBoton(null, 113, 200, 25, 24, resources.getMano(),
                auxDimension, null, null, null, null, 1, 0);

        auxDimension = new ImageIcon(imgPower.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnPower = components.devolverBoton(null, 167, 200, 25, 24, resources.getMano(),
                auxDimension, null, null, null, null, 1, 0);

        add(lblPhoto);
        add(lblName);
        add(lblOccupation);
        add(btnProfile);
        add(btnSettings);
        add(btnPower);

        setLayout(null);
    }

}
