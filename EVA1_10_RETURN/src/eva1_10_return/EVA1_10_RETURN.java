package eva1_10_return;

public class EVA1_10_RETURN {

    public static void main(String[] args) {
       square(10);
       int resu;
       resu = square(3);//llamada a función, almacenando el resultado
       System.out.println(resu);
       System.out.println(square(5));
    }
    
    public static int square(int num){
        return num * num;
    }
}
