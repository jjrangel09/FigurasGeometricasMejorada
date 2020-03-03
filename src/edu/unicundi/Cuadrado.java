/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi;

/**
 *
 * @author JuanJ
 */
public class Cuadrado extends FiguraGeometrica{
    
    private final short lado; 
    private float perimetro, area;
    
    public Cuadrado(short lado){
        this.lado = lado;
        this.area = super.hallarArea(lado);
        this.perimetro = super.hallarPerimetro(lado);
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }   
}
