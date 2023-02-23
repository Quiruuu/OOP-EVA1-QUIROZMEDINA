package eva1_11_califas;

public class EVA1_11_CALIFAS {

    public static void main(String[] args) {
        String resu1;
        resu1 = calif(100);
        System.out.println(resu1);
    }
        public static String calif(double num){
            String resu = ""; 
            if(num >= 0 && num <= 100){
            if(num < 70) resu = "D";
            else if (num < 80) resu = "C";
            else if (num < 90) resu = "B";
            else resu = "A";
    }
            else resu = "Calificacion no valida";
            return resu;
   }         
}
