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
public class Triangulo extends FiguraGeometrica{
    
     @Override
     public int hallarPerimetro(short lado){
        lado *= 4;
        return lado;
    }
    
    public float hallarArea(short lado1, short lado2, short lado3){
        int s = lado1+lado2+lado3;
        int area = 0;
        return area;
    }    
}
