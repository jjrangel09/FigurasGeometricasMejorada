package edu.unicundi;

/**
 *
 * @author JuanJ
 */
public class Rectangulo extends FiguraGeometrica {

    private final short lado1, lado2;
    private float perimetro, area;

    public Rectangulo(short lado1, short lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        //this.perimetro = super.hallarPerimetro();
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
