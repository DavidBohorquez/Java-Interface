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
public class UpperPanel extends JPanel {

    private JPanel pnlUsers, pnlVisitors, pnlTasks, pnlAlerts;

    private JLabel lblDay, lblUsrName, lblUsrNumber, lblVName, lblVNumber, lblTaskName, lblTasksNumber,
            alerts, lblAlertName, lblAlertsNumber;

    public UpperPanel(GraphicComponents components, ResourceManagement resources) {

        initComponents(components, resources);
    }

    private void initComponents(GraphicComponents components, ResourceManagement resources) {

        pnlUsers = components.devolverPanel(0, 0, 225, 80, resources.getColorAzulOscuro1(), null);

        lblDay = components.devolverLabel("Today", 0, 0, 155, 40, null, resources.getColorBlanco(), null, resources.getFuenteSubtitulo1());
        lblDay.setHorizontalAlignment(SwingConstants.CENTER);
        lblDay.setVerticalAlignment(SwingConstants.BOTTOM);

        lblUsrName = components.devolverLabel("Users", 0, 40, 155, 40, null, resources.getColorBlanco(), null, resources.getFuenteTitulo1());
        lblUsrName.setHorizontalAlignment(SwingConstants.CENTER);

        lblUsrNumber = components.devolverLabel(null, 155, 0, 68, 80, null, resources.getColorGrisOscuro(), resources.getColorGrisBlanco(), resources.getFuenteTitulo1());
        lblUsrNumber.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsrNumber.setText("90");

        pnlUsers.add(lblDay);
        pnlUsers.add(lblUsrName);
        pnlUsers.add(lblUsrNumber);

        pnlVisitors = components.devolverPanel(245, 0, 225, 80, resources.getColorAzulClaro(), null);

        lblDay = components.devolverLabel("Today", 0, 0, 155, 40, null, resources.getColorBlanco(), null, resources.getFuenteSubtitulo1());
        lblDay.setHorizontalAlignment(SwingConstants.CENTER);
        lblDay.setVerticalAlignment(SwingConstants.BOTTOM);

        lblVName = components.devolverLabel("Visitors", 0, 40, 155, 40, null, resources.getColorBlanco(), null, resources.getFuenteTitulo1());
        lblVName.setHorizontalAlignment(SwingConstants.CENTER);

        lblVNumber = components.devolverLabel(null, 155, 0, 68, 80, null, resources.getColorGrisOscuro(), resources.getColorGrisBlanco(), resources.getFuenteTitulo1());
        lblVNumber.setHorizontalAlignment(SwingConstants.CENTER);
        lblVNumber.setText("85");

        pnlVisitors.add(lblDay);
        pnlVisitors.add(lblVName);
        pnlVisitors.add(lblVNumber);

        pnlTasks = components.devolverPanel(490, 0, 225, 80, resources.getColorAzulOscuro1(), null);

        lblDay = components.devolverLabel("Today", 0, 0, 155, 40, null, resources.getColorBlanco(), null, resources.getFuenteSubtitulo1());
        lblDay.setHorizontalAlignment(SwingConstants.CENTER);
        lblDay.setVerticalAlignment(SwingConstants.BOTTOM);
        lblTaskName = components.devolverLabel("Tasks", 0, 40, 155, 40, null, resources.getColorBlanco(), null, resources.getFuenteTitulo1());
        lblTaskName.setHorizontalAlignment(SwingConstants.CENTER);
        lblTasksNumber = components.devolverLabel(null, 155, 0, 68, 80, null, resources.getColorGrisOscuro(), resources.getColorGrisBlanco(), resources.getFuenteTitulo1());
        lblTasksNumber.setHorizontalAlignment(SwingConstants.CENTER);
        lblTasksNumber.setText("51");

        pnlTasks.add(lblDay);
        pnlTasks.add(lblTaskName);
        pnlTasks.add(lblTasksNumber);

        pnlAlerts = components.devolverPanel(735, 0, 225, 80, resources.getColorAzulClaro(), null);

        lblDay = components.devolverLabel("Today", 0, 0, 155, 40, null, resources.getColorBlanco(), null, resources.getFuenteSubtitulo1());
        lblDay.setHorizontalAlignment(SwingConstants.CENTER);
        lblDay.setVerticalAlignment(SwingConstants.BOTTOM);
        lblAlertName = components.devolverLabel("Alerts", 0, 40, 155, 40, null, resources.getColorBlanco(), null, resources.getFuenteTitulo1());
        lblAlertName.setHorizontalAlignment(SwingConstants.CENTER);
        lblAlertsNumber = components.devolverLabel(null, 155, 0, 68, 80, null, resources.getColorGrisOscuro(), resources.getColorGrisBlanco(), resources.getFuenteTitulo1());
        lblAlertsNumber.setHorizontalAlignment(SwingConstants.CENTER);
        lblAlertsNumber.setText("30");

        pnlAlerts.add(lblDay);
        pnlAlerts.add(lblAlertName);
        pnlAlerts.add(lblAlertsNumber);

        add(pnlUsers);
        add(pnlVisitors);
        add(pnlTasks);
        add(pnlAlerts);

        setLayout(null);
    }

}
