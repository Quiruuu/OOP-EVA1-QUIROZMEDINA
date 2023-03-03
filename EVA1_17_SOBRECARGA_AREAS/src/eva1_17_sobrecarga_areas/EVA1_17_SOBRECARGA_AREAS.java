package eva1_17_sobrecarga_areas;
public class EVA1_17_SOBRECARGA_AREAS {
    public static void main(String[] args) {
        
        System.out.println("Area circulo: "+calcular_area(5.0));
        System.out.println("Area triangulo: "+calcular_area(5.0, 6.0));
        System.out.println("Area trapecio: "+calcular_area(5.0, 6.0, 7.0));
    }
    
        public static double calcular_area(double radio){
        return (radio*radio) * Math.PI;
    }
        public static double calcular_area(double base, double altura){
        return (base * altura) / 2.0;
    }
        public static double calcular_area(double baseM,double basem, double altura){
        return (altura * (baseM + basem)) / 2.0;
    }
}
