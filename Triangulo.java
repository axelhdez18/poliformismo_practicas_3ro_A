public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo (String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String nombre, double lado1,double lado2, double base) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
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
    public double getArea(){
        double area = (this.base * this.altura) / 2;
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = lado1 + lado2 + base;
        return perimetro;
    }
    

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo [base=" + base + ", altura=" + altura + ", lado1=" + lado1 + ", lado2=" + lado2 + "]";
    }

    
}