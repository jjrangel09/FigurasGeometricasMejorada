/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi;

import java.util.ArrayList;

/**
 *
 * @author Juan José Rangel
 */
public interface IFiguraGeometrica {
    
    public double hallarPerimetro(double[] lados);
    
    public double hallarArea(double[] lados);
    
    public double[] obtenerLados(double[] coorX, double[] coorY);
    
}
