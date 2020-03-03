package edu.unicundi;

/**
 *
 * @author JuanJ
 */
public class FiguraGeometrica {

    public FiguraGeometrica(){
    //constructor vacio    
    }
    
    public int hallarPerimetro(short lados){
        lados *= 4;
        return lados;
    }
    
    public float hallarArea(short lado1, short lado2){
        int area = lado1*lado2;
        return area;
    }
    
    public float hallarArea(short lado){
        int area = (int) Math.pow(lado, 2);
        return area;
    }
}
