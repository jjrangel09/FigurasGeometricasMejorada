package edu.unicundi;

/**
 *
 * @author JuanJ
 */
public class FiguraGeometrica implements IFiguraGeometrica{

    public FiguraGeometrica(){
    //constructor vacio    
    }
    
    @Override
    public double hallarPerimetro(double[] lados){
        double perimetro = lados[0]+lados[1]+lados[2]+lados[3];
        return perimetro;
    }
    
    @Override
    public double hallarArea(double[] lados){
        double area = lados[0]*lados[2];
        return area;
    }
    
    
    @Override
    public double[] obtenerLados(double[]coorX,double[]coorY){
        double[] lados = null;
        lados[0]= Math.sqrt(Math.pow((coorX[1]-coorX[0]), 2)+Math.pow((coorY[1]-coorY[0]), 2));
        lados[1]= Math.sqrt(Math.pow((coorX[2]-coorX[1]), 2)+Math.pow((coorY[2]-coorY[1]), 2));
        lados[2]= Math.sqrt(Math.pow((coorX[3]-coorX[2]), 2)+Math.pow((coorY[3]-coorY[2]), 2));
        lados[3]= Math.sqrt(Math.pow((coorX[3]-coorX[0]), 2)+Math.pow((coorY[3]-coorY[0]), 2));
        return lados;   
    }

}
