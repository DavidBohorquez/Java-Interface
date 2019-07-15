package presentacion.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author David Bohorquez
 */
public class MenuPanel extends JPanel {

    private ImageIcon auxDimension, imgDashboard, imgTandP, imgUi, imgTypo, imgPages, imgMail, imgComponents, imgCharts;

    private JButton btnDashboard, btnTandP, btnUi, btnTypo, btnPages, btnMail, btnComponents, btnCharts;

    private Border bordeInferior;

    public MenuPanel(GraphicComponents components, ResourceManagement resources) {
        initComponents(components, resources);
    }

    public void initComponents(GraphicComponents components, ResourceManagement resources) {

        imgDashboard = new ImageIcon(getClass().getResource("/resource/images/ihome.png"));
        imgTandP = new ImageIcon(getClass().getResource("/resource/images/editar.png"));
        imgUi = new ImageIcon(getClass().getResource("/resource/images/documento.png"));
        imgTypo = new ImageIcon(getClass().getResource("/resource/images/typography.png"));
        imgPages = new ImageIcon(getClass().getResource("/resource/images/pages.png"));
        imgMail = new ImageIcon(getClass().getResource("/resource/images/mail.png"));
        imgComponents = new ImageIcon(getClass().getResource("/resource/images/components.png"));
        imgCharts = new ImageIcon(getClass().getResource("/resource/images/charts.png"));

        bordeInferior = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0, 12, 82));

        auxDimension = new ImageIcon(imgDashboard.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnDashboard = components.devolverBoton("    Dashboard", 0, 0, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null,
                resources.getColorBlanco(), bordeInferior, 1, 0);

        /*btnDashboard = new JButton("    Dashboard");
         btnDashboard.setBounds(0, 0, 300, 46);
         btnDashboard.setContentAreaFilled(false);
         btnDashboard.setFocusable(false);
         btnDashboard.setCursor(new Cursor(Cursor.HAND_CURSOR));
         btnDashboard.setIcon(auxDimension);
         btnDashboard.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
         btnDashboard.setBackground(null);
         btnDashboard.setBorder(bordeInferior);
         btnDashboard.setForeground(Color.white);
         btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);*/
        add(btnDashboard);

        auxDimension = new ImageIcon(imgTandP.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnTandP = components.devolverBoton("    Tabs & Panels", 0, 46, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), resources.getColorAzulOscuro1(),
                resources.getColorBlanco(), bordeInferior, 1, 0);

        add(btnTandP);

        auxDimension = new ImageIcon(imgUi.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnUi = components.devolverBoton("   Ui Elements", 0, 92, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), resources.getColorAzulOscuro1(), resources.getColorBlanco(),
                bordeInferior, 1, 0);

        add(btnUi);

        auxDimension = new ImageIcon(imgTypo.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnTypo = components.devolverBoton("   Typography", 0, 138, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        add(btnTypo);

        auxDimension = new ImageIcon(imgPages.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnPages = components.devolverBoton("   Pages", 0, 184, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        add(btnPages);

        auxDimension = new ImageIcon(imgMail.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnMail = components.devolverBoton("   Mail Box", 0, 230, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        add(btnMail);

        auxDimension = new ImageIcon(imgComponents.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnComponents = components.devolverBoton("   Components", 0, 276, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        add(btnComponents);

        auxDimension = new ImageIcon(imgCharts.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnCharts = components.devolverBoton("   Charts", 0, 322, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        add(btnCharts);

        setLayout(null);
    }

    public JButton getBtnDashboard() {
        return btnDashboard;
    }

    public JButton getBtnTandP() {
        return btnTandP;
    }

    public JButton getBtnUi() {
        return btnUi;
    }

    public JButton getBtnTypo() {
        return btnTypo;
    }

    public JButton getBtnPages() {
        return btnPages;
    }

    public JButton getBtnMail() {
        return btnMail;
    }

    public JButton getBtnComponents() {
        return btnComponents;
    }

    public JButton getBtnCharts() {
        return btnCharts;
    }

}
