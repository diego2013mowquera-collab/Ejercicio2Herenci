import Geometria.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;

    }

    public Triangulo(){


    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura /2;

    }
    @Override
    public double calcularPerimetro(){
        return base+(2*altura);
    }
}

