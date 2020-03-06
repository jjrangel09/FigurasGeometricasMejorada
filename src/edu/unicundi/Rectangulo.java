package edu.unicundi;

import java.awt.Color;

/**
 *
 * @author JuanJ
 */
public class Rectangulo extends FiguraGeometrica {

    private short lado1, lado2;
    private float perimetro, area;
    private final double[] coorX;
    private final double[] coorY;
    private final Color color;

    public Rectangulo(double[] coorX, double[] coorY, Color color){
        this.coorX = coorX;
        this.coorY = coorY;
        this.color = color;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public float getArea() {
        return area;
    }
}
