package eva1_16_sobrecarga_2;

public class EVA1_16_SOBRECARGA_2 {
    public static void main(String[] args) {
        System.out.println("Suma: "+suma(12, 2));
        System.out.println("Suma: "+suma(12.0, 2.0));
        System.out.println("Suma: "+suma("fortnite ", "batlle royale"));
        suma();
    }
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
      public static double suma(double val1, double val2){
        return val1 + val2;
    }
      public static String suma(String val1, String val2){
        return val1 + val2;
    }
      public static void suma(){
        System.out.println("Suma: sin argumentos");
    }
}
