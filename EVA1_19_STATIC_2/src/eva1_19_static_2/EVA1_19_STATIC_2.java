package eva1_19_static_2;
public class EVA1_19_STATIC_2 {
    int x = 100;
    
    public static void main(String[] args) {
        //System.out.println(x);
        //mensajeNoEstatico();
        EVA1_19_STATIC_2 obj = new EVA1_19_STATIC_2();
        System.out.println(obj.x);
        obj.mensajeNoEstatico();
            //AHORA LOS METODOS ESTATICOS
        mensajeEstatico();
    }
        public void mensajeNoEstatico(){//NO EXISTE
            System.out.println("MENSAJE NO ESTATICO");
        }
        public static void mensajeEstatico(){//EXISTE AL INICIAR EL PROGRAMA
            System.out.println("MENSAJE ESTATICO");
        }
        
}
