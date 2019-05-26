
package presentacion.vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author Estudiantes
 */
public class VistaPrincipal extends JFrame implements ActionListener {
    
    private PanelInicio panelInicio;
    private PanelEventos panelEnventos;
    private PanelNotificacion panelNotificacion;
    private PanelLista panelLista;
    private PanelConfiguracion panelConfiguracion;
    private ComponentesGraficos componentes;
    
    private JPanel panelMenuSuperior, panelMenuIzquierda, panelPrincipal;
    private JButton botonCerrar, botonInicio, botonEventos, botonNotificaciones, botonLista, botonConfiguracion;
    private JButton botonMensaje, botonAlarma, botonAgregar;
    private Color colorNegro, colorGrisOscuro, colorGrisClaro, colorBlanco, colorVerde, colorNaranja;
    private JLabel lImagenPerfil;
    private JLabel lNombreAplicacion;
    private JTextField tBuscar;
    private Font fuente1, fuente2;
    private ImageIcon iCasa, iCerrar, iCalendario, iNotificaciones, iLista, iConfiguracion, iMensaje, iAñadir, iCampana;
    private ImageIcon iPerfil, iProvicional;
    private Cursor mano;
   
    
    public VistaPrincipal(){
        
        componentes= new ComponentesGraficos();
        
        colorNegro= new Color(23,23,23);
        colorGrisOscuro= new Color(200,200,200);
        colorGrisClaro= new Color(242,242,242);
        colorBlanco= new Color(255,255,255);
        colorVerde= new Color(101,156,0);
        colorNaranja= new Color(255, 135, 13);
        fuente1= new Font("LuzSans-Book",Font.PLAIN,20);
        fuente2= new Font("Berlin Sans FB Demi",Font.BOLD,50);
        mano= new Cursor(HAND_CURSOR);
        iCasa= new ImageIcon("medios/ihome.png");
        iCerrar= new ImageIcon("medios/cerrar.png");
        iCalendario= new ImageIcon("medios/calendario.png");
        iNotificaciones= new ImageIcon("medios/editar.png");
        iLista= new ImageIcon("medios/lista.png");
        iConfiguracion= new ImageIcon("medios/ajustes.png");
        iMensaje= new ImageIcon("medios/mensaje.png");
        iAñadir= new ImageIcon("medios/añadir.png");
        iCampana= new ImageIcon("medios/notificacion.png");
        iPerfil= new ImageIcon("medios/paul.jpg");
        
        
        panelMenuIzquierda= new JPanel();
        panelMenuIzquierda.setBounds(0,0, 220, 700);
        panelMenuIzquierda.setLayout(null);
        panelMenuIzquierda.setBackground(colorNegro);
        add(panelMenuIzquierda);
        
        panelMenuSuperior= new JPanel();
        panelMenuSuperior.setBounds(220,0, 880, 100);
        panelMenuSuperior.setLayout(null);
        panelMenuSuperior.setBackground(colorGrisOscuro);
        add(panelMenuSuperior);
        
        panelPrincipal= new JPanel();
        panelPrincipal.setBounds(220,100, 880, 550);
        panelPrincipal.setLayout(null);
        panelPrincipal.setBackground(colorGrisClaro);
        add(panelPrincipal);
        
        panelInicio= new PanelInicio(colorVerde, colorNaranja, colorBlanco);
        panelEnventos= new PanelEventos();
        panelNotificacion= new PanelNotificacion();
        panelLista= new PanelLista();
        panelConfiguracion= new PanelConfiguracion();
        
        iProvicional= new ImageIcon(iCerrar.getImage().getScaledInstance(32, 32, Image.SCALE_AREA_AVERAGING));
        
        botonCerrar= new JButton();
        botonCerrar.setBounds(830, 35, 32, 32);
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setBorder(null);
        botonCerrar.setFocusable(false);
        botonCerrar.setIcon(iProvicional);
        botonCerrar.setCursor(mano);
        botonCerrar.addActionListener(this);
        panelMenuSuperior.add(botonCerrar);
        
        iProvicional= new ImageIcon(iCasa.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));
        
        botonInicio= componentes.devolverBoton("   Inicio", 30, 200, 150, 40, mano, iProvicional, fuente1, null, colorBlanco, 1, 1);
        botonInicio.addActionListener(this);
        panelMenuIzquierda.add(botonInicio);
        
        iProvicional= new ImageIcon(iCalendario.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));
        
        botonEventos= new JButton();
        botonEventos.setBounds(30, 250, 150, 40);
        botonEventos.setText("   Eventos");
        botonEventos.setContentAreaFilled(false);
        botonEventos.setBorder(null);
        botonEventos.setFocusable(false);
        botonEventos.setFont(fuente1);
        botonEventos.setForeground(colorBlanco);
        botonEventos.setCursor(mano);
        botonEventos.setIcon(iProvicional);
        botonEventos.setHorizontalAlignment(SwingConstants.LEFT);
        botonEventos.addActionListener(this);
        panelMenuIzquierda.add(botonEventos);
        
        iProvicional= new ImageIcon(iNotificaciones.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));
        
        botonNotificaciones= new JButton();
        botonNotificaciones.setBounds(30, 300, 180, 40);
        botonNotificaciones.setText("   Notificaciones");
        botonNotificaciones.setContentAreaFilled(false);
        botonNotificaciones.setBorder(null);
        botonNotificaciones.setFocusable(false);
        botonNotificaciones.setFont(fuente1);
        botonNotificaciones.setForeground(colorBlanco);
        botonNotificaciones.setCursor(mano);
        botonNotificaciones.setIcon(iProvicional);
        botonNotificaciones.setHorizontalAlignment(SwingConstants.LEFT);
        botonNotificaciones.addActionListener(this);
        panelMenuIzquierda.add(botonNotificaciones);
        
        iProvicional= new ImageIcon(iLista.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));
        
        botonLista= new JButton();
        botonLista.setBounds(30, 350, 150, 40);
        botonLista.setText("   Contactos");
        botonLista.setContentAreaFilled(false);
        botonLista.setBorder(null);
        botonLista.setFocusable(false);
        botonLista.setFont(fuente1);
        botonLista.setForeground(colorBlanco);
        botonLista.setCursor(mano);
        botonLista.setIcon(iProvicional);
        botonLista.setHorizontalAlignment(SwingConstants.LEFT);
        botonLista.addActionListener(this);
        panelMenuIzquierda.add(botonLista);
        
        iProvicional= new ImageIcon(iConfiguracion.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));
        
        botonConfiguracion= new JButton();
        botonConfiguracion.setBounds(30, 400, 180, 40);
        botonConfiguracion.setText("   Configuracion");
        botonConfiguracion.setContentAreaFilled(false);
        botonConfiguracion.setBorder(null);
        botonConfiguracion.setFocusable(false);
        botonConfiguracion.setFont(fuente1);
        botonConfiguracion.setForeground(colorBlanco);
        botonConfiguracion.setCursor(mano);
        botonConfiguracion.setIcon(iProvicional);
        botonConfiguracion.setHorizontalAlignment(SwingConstants.LEFT);
        botonConfiguracion.addActionListener(this);
        panelMenuIzquierda.add(botonConfiguracion);
        
        iProvicional= new ImageIcon(iMensaje.getImage().getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING));
        
        botonMensaje= new JButton();
        botonMensaje.setBounds(400, 40, 28, 28);
        botonMensaje.setContentAreaFilled(false);
        botonMensaje.setBorder(null);
        botonMensaje.setFocusable(false);
        botonMensaje.setFont(fuente1);
        botonMensaje.setForeground(colorBlanco);
        botonMensaje.setCursor(mano);
        botonMensaje.setIcon(iProvicional);
        botonMensaje.setHorizontalAlignment(SwingConstants.LEFT);
        botonMensaje.addActionListener(this);
        panelMenuSuperior.add(botonMensaje);
        
        iProvicional= new ImageIcon(iAñadir.getImage().getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING));
        
        botonAgregar= new JButton();
        botonAgregar.setBounds(450, 40, 28, 28);
        botonAgregar.setContentAreaFilled(false);
        botonAgregar.setBorder(null);
        botonAgregar.setFocusable(false);
        botonAgregar.setFont(fuente1);
        botonAgregar.setForeground(colorBlanco);
        botonAgregar.setCursor(mano);
        botonAgregar.setIcon(iProvicional);
        botonAgregar.setHorizontalAlignment(SwingConstants.LEFT);
        botonAgregar.addActionListener(this);
        panelMenuSuperior.add(botonAgregar);
        
        iProvicional= new ImageIcon(iCampana.getImage().getScaledInstance(28, 28, Image.SCALE_AREA_AVERAGING));
        
        botonAlarma= new JButton();
        botonAlarma.setBounds(500, 40, 28, 28);
        botonAlarma.setContentAreaFilled(false);
        botonAlarma.setBorder(null);
        botonAlarma.setFocusable(false);
        botonAlarma.setFont(fuente1);
        botonAlarma.setForeground(colorBlanco);
        botonAlarma.setCursor(mano);
        botonAlarma.setIcon(iProvicional);
        botonAlarma.setHorizontalAlignment(SwingConstants.LEFT);
        botonAlarma.addActionListener(this);
        panelMenuSuperior.add(botonAlarma);
        
        iProvicional= new ImageIcon(iPerfil.getImage().getScaledInstance(80, 80, Image.SCALE_AREA_AVERAGING));
        
        lImagenPerfil= new JLabel();
        lImagenPerfil.setBounds(600, 10, 80, 80);
        lImagenPerfil.setIcon(iProvicional);
        panelMenuSuperior.add(lImagenPerfil);
        
        lNombreAplicacion= new JLabel("Tronos");
        lNombreAplicacion.setBounds(30, 10, 200, 80);
        lNombreAplicacion.setFont(fuente2);
        lNombreAplicacion.setForeground(colorNaranja);
        panelMenuSuperior.add(lNombreAplicacion);
        
        tBuscar= new JTextField();
        tBuscar.setBounds(210, 45, 160, 25);
        tBuscar.setText("buscar... ");
        tBuscar.setForeground(colorGrisOscuro);
        tBuscar.setBackground(colorBlanco);
        panelMenuSuperior.add(tBuscar);
        
        setSize(1100, 650);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== botonCerrar){
            System.exit(0);
        }
        if(e.getSource()== botonInicio){
            panelPrincipal.removeAll();
            panelPrincipal.add(panelInicio);
            repaint();
        }
        if(e.getSource()== botonEventos){
            panelPrincipal.removeAll();
            panelPrincipal.add(panelEnventos);
            repaint();
        }
        if(e.getSource()== botonNotificaciones){
            panelPrincipal.removeAll();
            panelPrincipal.add(panelNotificacion);
            repaint();
        }
        if(e.getSource()== botonLista){
            panelPrincipal.removeAll();
            panelPrincipal.add(panelLista);
            repaint();
        }
        if(e.getSource()== botonConfiguracion){
            panelPrincipal.removeAll();
            panelPrincipal.add(panelConfiguracion);
            repaint();
        }
    }
}
