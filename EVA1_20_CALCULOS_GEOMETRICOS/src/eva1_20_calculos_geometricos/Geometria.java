package eva1_20_calculos_geometricos;

public class Geometria {
    //constantes
    public static final double PI = 3.1416;
    
    //perimetro de un circulo
    public static double perimetroCicrulo(double radio){
        return PI * (radio * 2);
    }
    //area de un circulo
    public static double areaCirculo(double radio){
        return PI * (radio * radio);
    }
    //volumen de une esfera
    public static double volumenEsfera(double radio){
    return (4.0 / 3.0) * (PI * (radio * radio * radio));
    }
}
