/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Andre Sarmiento
 */
public class ResourceManagement {

    private Color colorAzul, colorAzulClaro, colorAzulOscuro, colorAzulOscuro1, colorBlanco, colorGrisBlanco, colorGrisClaro, colorGrisOscuro, colorMorado;
    private Font fuenteTitulo, fuenteSubtitulo, fuenteTexto, fuenteTitulo2, fuenteTitulo3;
    private Border bordeGris, bordeInferiorMorado, bordeInferiorAzul, bordeDifuminado, bordeRedondeado, bordeCircular;
    private Cursor mano;
    private DefaultTableCellRenderer tablaPersonalizada;

    private Border brdBlueRight;

    public ResourceManagement(PersonalizedComponents cPersonalizados) {
        fuenteTitulo = new Font("Century Gothic", Font.BOLD, 35);
        fuenteTitulo2 = new Font("Century Gothic", Font.BOLD, 18);
        fuenteTitulo3 = new Font("Century Gothic", Font.PLAIN, 25);
        fuenteSubtitulo = new Font("Century Gothic", Font.PLAIN, 14);
        fuenteTexto = new Font("Century Gothic", Font.PLAIN, 12);
        colorGrisClaro = new Color(200, 200, 200);
        colorGrisBlanco = new Color(245, 245, 245);
        colorGrisOscuro = new Color(80, 80, 80);
        colorAzul = new Color(62, 86, 189);
        colorAzulClaro = new Color(43, 203, 213);
        colorAzulOscuro = new Color(22, 46, 149);
        colorAzulOscuro1 = new Color(16, 28, 98);
        colorMorado = new Color(146, 38, 159);
        colorBlanco = Color.white;
        mano = new Cursor(Cursor.HAND_CURSOR);
        bordeGris = BorderFactory.createLineBorder(colorGrisClaro, 2, true);
        bordeInferiorMorado = BorderFactory.createMatteBorder(0, 0, 3, 0, colorMorado);
        bordeInferiorAzul = BorderFactory.createMatteBorder(0, 0, 3, 0, colorAzul);
        bordeDifuminado = cPersonalizados.devolverBordeDifuminado();
        bordeRedondeado = cPersonalizados.DibujarBordeRedondeado(40, 0);
        bordeCircular = cPersonalizados.DibujarBordeCircular();
        tablaPersonalizada = cPersonalizados.devolverTablaPersonalizada(colorGrisBlanco, colorBlanco, colorAzul, colorGrisOscuro, fuenteTexto);

        brdBlueRight = BorderFactory.createMatteBorder(0, 0, 0, 1, colorAzulOscuro1);
    }

    public Color getColorAzul() {
        return colorAzul;
    }

    public Color getColorAzulOscuro() {
        return colorAzulOscuro;
    }

    public Color getColorBlanco() {
        return colorBlanco;
    }

    public Color getColorGrisClaro() {
        return colorGrisClaro;
    }

    public Color getColorGrisOscuro() {
        return colorGrisOscuro;
    }

    public Color getColorMorado() {
        return colorMorado;
    }

    public Color getColorGrisBlanco() {
        return colorGrisBlanco;
    }

    public Font getFuenteTitulo() {
        return fuenteTitulo;
    }

    public Font getFuenteTitulo2() {
        return fuenteTitulo2;
    }

    public Font getFuenteSubtitulo() {
        return fuenteSubtitulo;
    }

    public Font getFuenteTexto() {
        return fuenteTexto;
    }

    public Border getBordeGris() {
        return bordeGris;
    }

    public Border getBordeInferior(String color) {
        if (color.equals("Azul")) {
            return bordeInferiorAzul;
        }
        if (color.equals("Morado")) {
            return bordeInferiorMorado;
        }
        return null;
    }

    public Border getBordeDifuminado() {
        return bordeDifuminado;
    }

    public Border getBordeRedondeado() {
        return bordeRedondeado;
    }

    public Border getBordeCircular() {
        return bordeCircular;
    }

    public Cursor getMano() {
        return mano;
    }

    public DefaultTableCellRenderer getTablaPersonalizada() {
        return tablaPersonalizada;
    }

    public Color getColorAzulOscuro1() {
        return colorAzulOscuro1;
    }

    public Border getBrdBlueRight() {
        return brdBlueRight;
    }

    public Color getColorAzulClaro() {
        return colorAzulClaro;
    }

    public Font getFuenteTitulo3() {
        return fuenteTitulo3;
    }

}