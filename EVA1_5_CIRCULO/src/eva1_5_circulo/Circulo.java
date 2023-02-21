package eva1_5_circulo;

public class Circulo {
    private double radio;
    
    public Circulo(){
        radio = 5;
    }
    public Circulo(double datoRadio){
        radio = datoRadio; 
    }
     public void setRadio(double valor){
        radio = valor; 
    }
     public double getRadio(){
        return radio;
    }
    public double getArea(){
        return Math.PI*(radio*radio);
    }
    public double getPerimetro(){
        return Math.PI*(radio*2);
    }
}
