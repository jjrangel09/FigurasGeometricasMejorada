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
public class Triangulo extends FiguraGeometrica{

    private final double[] coorX;
    private final double[] coorY;
    private final Color color;

    public Triangulo(double[] coorX, double[] coorY, Color color){
        this.coorX = coorX;
        this.coorY = coorY;
        this.color = color;
    }
    

    @Override
     public double hallarPerimetro(double[] lados){
        double perimetro = lados[0]+lados[1]+lados[2];
        return perimetro;
    }
    
    @Override
    public double hallarArea(double[] lados){
        double s = (lados[0]+lados[1]+lados[2])/2;
        double area = Math.sqrt(s*(s-lados[0])*(s-lados[1])*(s-lados[2]));
        return area;
    }
    public double[] obtenerLados(){
        double[] lados = new double[3];
        lados[0]= Math.sqrt(Math.pow((coorX[1]-coorX[0]), 2)+Math.pow((coorY[1]-coorY[0]), 2));
        lados[1]= Math.sqrt(Math.pow((coorX[2]-coorX[1]), 2)+Math.pow((coorY[2]-coorY[1]), 2));
        lados[2]= Math.sqrt(Math.pow((coorX[2]-coorX[0]), 2)+Math.pow((coorY[2]-coorY[0]), 2));
        return lados;   
    }
}
