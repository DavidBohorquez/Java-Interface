/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    private ImageIcon auxDimension, iDashboard, iTandP, iUi, iTypo;

    private JButton btnDashboard, btnTandP, btnUi, btnTypo;

    public MenuPanel() {
        initComponents();
    }

    public void initComponents() {
        iDashboard = new ImageIcon(getClass().getResource("/resource/images/ihome.png"));

        auxDimension = new ImageIcon(iDashboard.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

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
        
        iTandP = new ImageIcon(getClass().getResource("/resource/images/editar.png"));

        auxDimension = new ImageIcon(iTandP.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

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
        
        iUi = new ImageIcon(getClass().getResource("/resource/images/documento.png"));

        auxDimension = new ImageIcon(iUi.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

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
        
        iTypo = new ImageIcon(getClass().getResource("/resource/images/typography.png"));

        auxDimension = new ImageIcon(iTypo.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));

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
        
        
        
        
        

      setLayout(null);  
    }

}
