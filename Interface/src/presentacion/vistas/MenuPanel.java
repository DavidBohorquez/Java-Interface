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

        /*btnTandP = new JButton("    Tabs & Panels");
         /*btnTandP.setBounds(30, 79, 250, 24);
         btnTandP.setBorder(null);
         btnTandP.setContentAreaFilled(false);
         btnTandP.setFocusable(false);
         btnTandP.setCursor(new Cursor(Cursor.HAND_CURSOR));
         btnTandP.setIcon(auxDimension);
         btnTandP.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
         btnTandP.setBackground(null);
         btnTandP.setForeground(Color.white);
         btnTandP.setHorizontalAlignment(SwingConstants.LEFT);*/
        add(btnTandP);

        auxDimension = new ImageIcon(imgUi.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnUi = components.devolverBoton("   Ui Elements", 0, 92, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), resources.getColorAzulOscuro1(), resources.getColorBlanco(),
                bordeInferior, 1, 0);

        /*btnUi = new JButton("   Ui Elements");
         btnUi.setBounds(30, 133, 250, 24);
         btnUi.setBorder(null);
         btnUi.setContentAreaFilled(false);
         btnUi.setFocusable(false);
         btnUi.setCursor(new Cursor(Cursor.HAND_CURSOR));
         btnUi.setIcon(auxDimension);
         btnUi.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
         btnUi.setBackground(null);
         btnUi.setForeground(Color.white);
         btnUi.setHorizontalAlignment(SwingConstants.LEFT);*/
        add(btnUi);

        auxDimension = new ImageIcon(imgTypo.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnTypo = components.devolverBoton("   Typography", 0, 138, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        /*btnTypo = new JButton("   Typography");
         btnTypo.setBounds(30, 187, 250, 24);
         btnTypo.setBorder(null);
         btnTypo.setContentAreaFilled(false);
         btnTypo.setFocusable(false);
         btnTypo.setCursor(new Cursor(Cursor.HAND_CURSOR));
         btnTypo.setIcon(auxDimension);
         btnTypo.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
         btnTypo.setBackground(null);
         btnTypo.setForeground(Color.white);
         btnTypo.setHorizontalAlignment(SwingConstants.LEFT);*/
        add(btnTypo);

        auxDimension = new ImageIcon(imgPages.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnPages = components.devolverBoton("   Pages", 0, 184, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        /*btnPages = new JButton("   Pages");
         btnPages.setBounds(30, 241, 250, 24);
         btnPages.setBorder(null);
         btnPages.setContentAreaFilled(false);
         btnPages.setFocusable(false);
         btnPages.setCursor(new Cursor(Cursor.HAND_CURSOR));
         btnPages.setIcon(auxDimension);
         btnPages.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
         btnPages.setBackground(null);
         btnPages.setForeground(Color.white);
         btnPages.setHorizontalAlignment(SwingConstants.LEFT);*/
        add(btnPages);

        auxDimension = new ImageIcon(imgMail.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnMail = components.devolverBoton("   Mail Box", 0, 230, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        /*btnMail = new JButton("   Mail Box");
         btnMail.setBounds(30, 295, 250, 24);
         btnMail.setBorder(null);
         btnMail.setContentAreaFilled(false);
         btnMail.setFocusable(false);
         btnMail.setCursor(new Cursor(Cursor.HAND_CURSOR));
         btnMail.setIcon(auxDimension);
         btnMail.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
         btnMail.setBackground(null);
         btnMail.setForeground(Color.white);
         btnMail.setHorizontalAlignment(SwingConstants.LEFT);*/
        add(btnMail);

        auxDimension = new ImageIcon(imgComponents.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnComponents = components.devolverBoton("   Components", 0, 276, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        /*btnComponents = new JButton("   Components");
         btnComponents.setBounds(30, 349, 250, 24);
         btnComponents.setBorder(null);
         btnComponents.setContentAreaFilled(false);
         btnComponents.setFocusable(false);
         btnComponents.setCursor(new Cursor(Cursor.HAND_CURSOR));
         btnComponents.setIcon(auxDimension);
         btnComponents.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
         btnComponents.setBackground(null);
         btnComponents.setForeground(Color.white);
         btnComponents.setHorizontalAlignment(SwingConstants.LEFT);*/
        add(btnComponents);

        auxDimension = new ImageIcon(imgCharts.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnCharts = components.devolverBoton("   Charts", 0, 322, 300, 46, resources.getMano(),
                auxDimension, new Font("LuzSans-Book", Font.PLAIN, 19), null, resources.getColorBlanco(),
                bordeInferior, 1, 0);

        /*btnCharts = new JButton("   Charts");
         btnCharts.setBounds(30, 393, 250, 24);
         btnCharts.setBorder(null);
         btnCharts.setContentAreaFilled(false);
         btnCharts.setFocusable(false);
         btnCharts.setCursor(new Cursor(Cursor.HAND_CURSOR));
         btnCharts.setIcon(auxDimension);
         btnCharts.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
         btnCharts.setBackground(null);
         btnCharts.setForeground(Color.white);
         btnCharts.setHorizontalAlignment(SwingConstants.LEFT);*/
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
