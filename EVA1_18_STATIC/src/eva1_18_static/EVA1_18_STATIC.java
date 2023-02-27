package eva1_18_static;
public class EVA1_18_STATIC {
    public static void main(String[] args) {
       Prueba obj = new Prueba();
       obj.mensaje();
       Prueba.mensajeEstatico();
        System.out.println("PI= " + Math.PI);
    }    
}

class Prueba{
    public void mensaje(){//SOLO AL CREAR OBJETOS
        System.out.println("Hola!!!");
    }
    public static void mensajeEstatico(){//DIRECTAMENTE DE LA CLASE
        System.out.println("Hola (estatico)!!!");
    }
}
class Otra{
    
}
