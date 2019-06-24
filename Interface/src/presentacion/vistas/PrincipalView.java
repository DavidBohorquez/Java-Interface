/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import presentacion.controladores.PrincipalController;
import presentacion.modelo.Modelo;

/**
 *
 * @author David Bohorquez
 */
public class PrincipalView extends JFrame {

    private Modelo modelo;
    private PrincipalController controlador;

    private MenuPanel pnlMenu;
    private BarMenuPanel pnlBarMenu;
    private UpperPanel pnlUpper;
    private GraphicPanel pnlGraphic;
    private FooterPanel pnlFooter;
    private InfoPanel pnlInfo;
    private HeaderPanel pnlHeader;

    public PrincipalView(Modelo modelo) {
        this.modelo = modelo;

        initComponents();
        asignarListeners();
    }

    public void initComponents() {
        pnlBarMenu = new BarMenuPanel(modelo.getComponents(), modelo.getResources());
        pnlMenu = new MenuPanel(modelo.getComponents(), modelo.getResources());
        pnlUpper = new UpperPanel(modelo.getComponents(), modelo.getResources());
        pnlGraphic = new GraphicPanel(modelo.getComponents(), modelo.getResources());
        pnlFooter = new FooterPanel(modelo.getComponents(), modelo.getResources());
        pnlInfo = new InfoPanel(modelo.getComponents(), modelo.getResources());
        pnlHeader = new HeaderPanel(modelo.getComponents(), modelo.getResources());

        //pie = new JPanel();
        //grafica = new JPanel();
        //info = new JPanel();
        //augment = new JPanel();
        pnlBarMenu.setBounds(0, 0, 1238, 20);
        pnlHeader.setBounds(0, 20, 250, 50);
        pnlInfo.setBounds(0, 70, 250, 262);
        pnlMenu.setBounds(0, 332, 250, 368);
        pnlUpper.setBounds(258, 30, 960, 80);
        pnlGraphic.setBounds(258, 135, 960, 505);
        pnlFooter.setBounds(250, 670, 988, 30);

        pnlHeader.setBackground(modelo.getResources().getColorAzulOscuro1());
        pnlInfo.setBackground(/*new Color(200, 224, 225)*/modelo.getResources().getColorBlanco());
        pnlMenu.setBackground(modelo.getResources().getColorAzulOscuro1());
        pnlUpper.setBackground(modelo.getResources().getColorBlanco());
        pnlGraphic.setBackground(modelo.getResources().getColorAzul());
        //grafica.setBackground(new Color(200, 224, 225));
        pnlFooter.setBackground(modelo.getResources().getColorAzulClaro());
        //pie.setBackground(new Color(43, 203, 213));

        add(pnlBarMenu);
        add(pnlHeader);
        add(pnlInfo);
        add(pnlMenu);
        add(pnlUpper);
        add(pnlGraphic);
        add(pnlFooter);

        /*users.setBackground(new Color(43, 203, 213));
         visitors.setBackground(new Color(16, 28, 98));
         task.setBackground(new Color(43, 203, 213));
         alerts.setBackground(new Color(16, 28, 98));*/
        setLayout(null);
        setUndecorated(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(modelo.getResources().getColorGrisClaro());
        setSize(1238, 700);
        setLocationRelativeTo(null);
    }

    public void asignarListeners() {
        pnlBarMenu.addMouseListener(null);

        pnlMenu.getBtnDashboard().addActionListener(getControlador());
        pnlMenu.getBtnTandP().addActionListener(getControlador());
        pnlMenu.getBtnUi().addActionListener(getControlador());
        pnlMenu.getBtnTypo().addActionListener(getControlador());
        pnlMenu.getBtnPages().addActionListener(getControlador());
        pnlMenu.getBtnMail().addActionListener(getControlador());
        pnlMenu.getBtnComponents().addActionListener(getControlador());
        pnlMenu.getBtnCharts().addActionListener(getControlador());
    }

    public Modelo getModelo() {
        return modelo;
    }

    public PrincipalController getControlador() {
        if (controlador == null) {
            controlador = new PrincipalController(this);
        }
        return controlador;
    }

    public MenuPanel getPnlMenu() {
        return pnlMenu;
    }

    public BarMenuPanel getPnlBarMenu() {
        return pnlBarMenu;
    }

}
