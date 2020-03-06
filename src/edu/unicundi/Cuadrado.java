/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi;

import java.awt.Color;

/**
 *
 * @author JuanJ
 */
public class Cuadrado extends FiguraGeometrica{
    
    private short lado; 
    private float perimetro, area;
    private final double[] coorX, coorY;
    private final Color color;
    
    public Cuadrado(double[] coorX, double[] coorY, Color color){
        this.coorX = coorX;
        this.coorY = coorY;
        this.color = color;
    }

    public float getPerimetro() {
        return this.perimetro;
    }

    public float getArea() {
        return area;
    }

}
