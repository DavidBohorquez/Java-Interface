package presentacion.vistas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 * @author Cristian
 */
public class ComponentesGraficos {
    private JButton boton;
    private JRadioButton radioBoton;
    private JPanel panel;
    private JScrollPane panelBarra;
    private JLabel label;
    private JTextField text;
    private JPasswordField textP;
    private JComboBox combo;
    
    public ComponentesGraficos(){
        
    }
        
    public JButton devolverBoton(String cadena, int x, int y, int ancho, int largo, Cursor mano, ImageIcon imagen, Font fuente, Color colorFondo, Color colorFuente, int direccion, int tipo){
        boton= new JButton(cadena);
        boton.setBounds(x, y, ancho, largo);
        if(tipo==1){
            boton.setBorder(null);
            boton.setContentAreaFilled(false);
        }
        boton.setFocusable(false);
        if(mano!=null)
        boton.setCursor(mano);
        if(imagen!=null)
        boton.setIcon(imagen);
        if(fuente!=null)
        boton.setFont(fuente);
        if(colorFondo!=null)
            boton.setBackground(colorFondo);
        if(colorFuente!=null)
        boton.setForeground(colorFuente);
        switch(direccion){
            case 1:
                boton.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case 2:
                boton.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
                
            default:
                break;
        }
        return boton;
    }
    
    public JRadioButton devolverRadioBoton(String cadena, int x, int y, int ancho, int largo, Cursor mano, Font fuente,Color colorFuente){
        radioBoton= new JRadioButton(cadena);
        radioBoton.setBounds(x, y, ancho, largo);
        radioBoton.setFocusable(false);
        if(mano!=null)
        radioBoton.setCursor(mano);
        if(fuente!=null)
        radioBoton.setFont(fuente);
        if(colorFuente!=null)
        radioBoton.setForeground(colorFuente);
        return radioBoton;
    }
    
    public JPanel devolverPanel(int x, int y, int ancho, int alto, Color color, Border borde){
        panel = new JPanel(); 
        panel.setBounds(x, y, ancho, alto); 
        if(color!=null)
            panel.setBackground(color);
        if(borde!=null)
            panel.setBorder(borde);
        panel.setLayout(null);
        return panel;
    }
    
    public JScrollPane devolverPanelBarra(Component componente, int x, int y, int ancho, int alto, Color color, Border borde){
        panelBarra=new JScrollPane(componente);
        panelBarra.setBounds(x, y, ancho, alto); 
        if(color!=null)
            panelBarra.getViewport().setBackground(color);
        if(borde!=null)
            panelBarra.setBorder(borde);
        return panelBarra;
    }
    
    public JLabel devolverLabel(String cadena, int x, int y, int ancho, int alto, ImageIcon imagen, Color colorFuente, Color colorFondo,Font fuente){        
        label= new JLabel(cadena);
        label.setBounds(x, y, ancho, alto);
        if(imagen!=null)
            label.setIcon(imagen);
        if(colorFuente!=null)
            label.setForeground(colorFuente);
        if(colorFondo!=null){
            label.setOpaque(true);
            label.setBackground(colorFondo);
        }
        if(fuente!=null)
            label.setFont(fuente);
        return label;
    }
    
    public JTextField devolverTextField(String cadena, int x, int y, int ancho, int alto,Color colorFondo, Color colorFuente, Color colorCaret, Font fuente, Border borde, int direccion){        
        text = new JTextField();
        text.setBounds(x,y, ancho, alto);
        text.setText(cadena);
        text.setForeground(colorFuente);
        text.setBackground(colorFondo);
        text.setCaretColor(colorCaret);
        text.setBorder(borde);
        switch(direccion){
            case 1:
                text.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case 2:
                text.setHorizontalAlignment(SwingConstants.RIGHT);
                break;        
            default:
                break;
        }
        return text;
    }
    
    public JPasswordField devolverPasswordField(String cadena, int x, int y, int ancho, int alto,Color colorFondo, Color colorFuente, Color colorCaret, Font fuente, Border borde, int direccion){        
        textP = new JPasswordField();
        textP.setBounds(x,y, ancho, alto);
        textP.setText(cadena);
        textP.setForeground(colorFuente);
        textP.setBackground(colorFondo);
        textP.setCaretColor(colorCaret);
        textP.setBorder(borde);
        switch(direccion){
            case 1:
                text.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            case 2:
                text.setHorizontalAlignment(SwingConstants.RIGHT);
                break;        
            default:
                break;
        }
        return textP;
    }
    
    public JComboBox devolverComboBox(String cadena, int numItems, int x, int y, int ancho, int alto,Color colorFondo, Color colorFuente){
        combo=new JComboBox();
        String [] arregloCadena = cadena.split("_");
        for(int i=0; i<numItems; i++){
            combo.addItem(arregloCadena[i]);
        }
        combo.setBackground(colorFondo);
        combo.setForeground(colorFuente);
        for (int i=0; i<combo.getComponentCount(); i++) {
            if (combo.getComponent(i) instanceof AbstractButton) {
                ((AbstractButton)combo.getComponent(i)).setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(colorFondo)));
                ((AbstractButton)combo.getComponent(i)).setBackground(colorFondo);
            } 
            if (combo.getComponent(i) instanceof JTextField){
                    System.out.println("chao");
                    ((JTextField)combo.getComponent(i)).setSelectionColor(colorFuente);
                    ((JTextField)combo.getComponent(i)).setBorder(BorderFactory.createLineBorder(colorFuente));
                    ((JTextField)combo.getComponent(i)).setBackground(colorFuente);
                    ((JTextField)combo.getComponent(i)).setDisabledTextColor(colorFuente); 
            }
            
        }
        combo.setBounds(x, y, ancho, alto);
        return combo;
    }
}
