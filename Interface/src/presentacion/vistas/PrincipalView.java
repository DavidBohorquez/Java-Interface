/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

    private JPanel panel1, users, visitors, task, alerts, menu, buttons, pie, grafica, info, augment;

    private JLabel dashboard;

    public PrincipalView(Modelo modelo) {
        this.modelo = modelo;

        initComponents();
        asignarListeners();
    }

    public void initComponents() {
        panel1 = new JPanel();
        users = new JPanel();
        visitors = new JPanel();
        task = new JPanel();
        alerts = new JPanel();
        menu = new /*JPanel()*/ MenuPanel();
        buttons = new JPanel();
        pie = new JPanel();
        grafica = new JPanel();
        info = new JPanel();
        augment = new JPanel();

        // panel1.setBounds(0, 0, 800, 400);
        augment.setBounds(0, 0, 300, 50);
        info.setBounds(0, 50, 300, 150);
        buttons.setBounds(0, 200, 300, 50);
        menu.setBounds(0, 250, 300, 600);

        users.setBounds(300, 0, 225, 100);
        visitors.setBounds(525, 0, 225, 100);
        task.setBounds(750, 0, 225, 100);
        alerts.setBounds(975, 0, 225, 100);
        grafica.setBounds(300, 100, 900, 530);
        pie.setBounds(300, 630, 900, 70);

        augment.setBackground(new Color(16, 28, 98));
        info.setBackground(new Color(200, 224, 225));
        buttons.setBackground(new Color(184, 196, 201));
        menu.setBackground(new Color(16, 28, 98));

        users.setBackground(new Color(43, 203, 213));
        visitors.setBackground(new Color(16, 28, 98));
        task.setBackground(new Color(43, 203, 213));
        alerts.setBackground(new Color(16, 28, 98));
        grafica.setBackground(new Color(200, 224, 225));
        pie.setBackground(new Color(43, 203, 213));

        add(augment);
        add(info);
        add(buttons);
        add(menu);

        add(users);
        add(visitors);
        add(task);
        add(alerts);
        add(grafica);
        add(pie);

        setLayout(null);
        //setUndecorated(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void asignarListeners() {

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

}
