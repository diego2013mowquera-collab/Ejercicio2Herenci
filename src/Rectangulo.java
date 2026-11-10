import Geometria.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {
    private double baseRectangulo;
    private double alturaRectangulo;

    public Rectangulo(String color,double baseRectangulo,double alturaRectangulo){
        super(color);
        this.baseRectangulo=baseRectangulo;
        this.alturaRectangulo=alturaRectangulo;

    }
}
