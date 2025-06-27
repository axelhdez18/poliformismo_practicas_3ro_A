public class Circulo extends FiguraGeometrica{
    private double radio;
    private final double PI = 3.1416; // define constante

    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Se genera un getter para consultar el valor de la constante PI
    public double getPI() {
        return PI;
    }

    //Este metodo sobre-escribe al heredado de Figurageometrica y conserva la miksma firma, pero su compartiemto es diferente
    @Override
    public double getArea(){
        double area = this.PI * this.radio* this.radio;
        return area;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    
}