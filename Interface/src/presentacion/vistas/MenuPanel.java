package presentacion.vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author David Bohorquez
 */
public class MenuPanel extends JPanel {

    private ImageIcon auxDimension, imgDashboard, imgTandP, imgUi, imgTypo, imgMail, imgComponents, imgCharts;

    private JButton btnDashboard, btnTandP, btnUi, btnTypo, btnMail, btnComponents, btnCharts;

    public MenuPanel() {
        initComponents();
    }

    public void initComponents() {
        imgDashboard = new ImageIcon(getClass().getResource("/resource/images/ihome.png"));

        auxDimension = new ImageIcon(imgDashboard.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnDashboard = new JButton("    Dashboard");
        btnDashboard.setBounds(30, 25, 150, 24);
        btnDashboard.setBorder(null);
        btnDashboard.setContentAreaFilled(false);
        btnDashboard.setFocusable(false);
        btnDashboard.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnDashboard.setIcon(auxDimension);
        btnDashboard.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
        btnDashboard.setBackground(null);
        btnDashboard.setForeground(Color.white);
        btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);

        add(btnDashboard);

        imgTandP = new ImageIcon(getClass().getResource("/resource/images/editar.png"));

        auxDimension = new ImageIcon(imgTandP.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnTandP = new JButton("    Tabs & Panels");
        btnTandP.setBounds(30, 79, 250, 24);
        btnTandP.setBorder(null);
        btnTandP.setContentAreaFilled(false);
        btnTandP.setFocusable(false);
        btnTandP.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnTandP.setIcon(auxDimension);
        btnTandP.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
        btnTandP.setBackground(null);
        btnTandP.setForeground(Color.white);
        btnTandP.setHorizontalAlignment(SwingConstants.LEFT);

        add(btnTandP);

        imgUi = new ImageIcon(getClass().getResource("/resource/images/documento.png"));

        auxDimension = new ImageIcon(imgUi.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnUi = new JButton("   Ui Elements");
        btnUi.setBounds(30, 133, 250, 24);
        btnUi.setBorder(null);
        btnUi.setContentAreaFilled(false);
        btnUi.setFocusable(false);
        btnUi.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnUi.setIcon(auxDimension);
        btnUi.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
        btnUi.setBackground(null);
        btnUi.setForeground(Color.white);
        btnUi.setHorizontalAlignment(SwingConstants.LEFT);

        add(btnUi);

        imgTypo = new ImageIcon(getClass().getResource("/resource/images/typography.png"));

        auxDimension = new ImageIcon(imgTypo.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnTypo = new JButton("   Typography");
        btnTypo.setBounds(30, 187, 250, 24);
        btnTypo.setBorder(null);
        btnTypo.setContentAreaFilled(false);
        btnTypo.setFocusable(false);
        btnTypo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnTypo.setIcon(auxDimension);
        btnTypo.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
        btnTypo.setBackground(null);
        btnTypo.setForeground(Color.white);
        btnTypo.setHorizontalAlignment(SwingConstants.LEFT);

        add(btnTypo);

        imgMail = new ImageIcon(getClass().getResource("/resource/images/mail.png"));

        auxDimension = new ImageIcon(imgMail.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnMail = new JButton("   Mail Box");
        btnMail.setBounds(30, 241, 250, 24);
        btnMail.setBorder(null);
        btnMail.setContentAreaFilled(false);
        btnMail.setFocusable(false);
        btnMail.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMail.setIcon(auxDimension);
        btnMail.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
        btnMail.setBackground(null);
        btnMail.setForeground(Color.white);
        btnMail.setHorizontalAlignment(SwingConstants.LEFT);

        add(btnMail);

        imgComponents = new ImageIcon(getClass().getResource("/resource/images/components.png"));

        auxDimension = new ImageIcon(imgComponents.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnComponents = new JButton("   Components");
        btnComponents.setBounds(30, 295, 250, 24);
        btnComponents.setBorder(null);
        btnComponents.setContentAreaFilled(false);
        btnComponents.setFocusable(false);
        btnComponents.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnComponents.setIcon(auxDimension);
        btnComponents.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
        btnComponents.setBackground(null);
        btnComponents.setForeground(Color.white);
        btnComponents.setHorizontalAlignment(SwingConstants.LEFT);

        add(btnComponents);

        imgCharts = new ImageIcon(getClass().getResource("/resource/images/charts.png"));

        auxDimension = new ImageIcon(imgCharts.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

        btnCharts = new JButton("   Charts");
        btnCharts.setBounds(30, 349, 250, 24);
        btnCharts.setBorder(null);
        btnCharts.setContentAreaFilled(false);
        btnCharts.setFocusable(false);
        btnCharts.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCharts.setIcon(auxDimension);
        btnCharts.setFont(new Font("LuzSans-Book", Font.PLAIN, 19));
        btnCharts.setBackground(null);
        btnCharts.setForeground(Color.white);
        btnCharts.setHorizontalAlignment(SwingConstants.LEFT);

        add(btnCharts);

        setLayout(null);
    }

}
