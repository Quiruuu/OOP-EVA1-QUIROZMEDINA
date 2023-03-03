package Paquete2;

import Paquete1.ClaseA;
public class ClaseE {
    public int publicE;
    int defaultE;
    private int privateE; 
       
}

class ClaseF{
    public int publicF;
    int defaultF;
    private int privateF;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.publicA;
        
    //CLASE ES DEFAULT EN OTRO PAQUETE
    //ES INVISIBLE
        //ClaseD objD = new ClaseD();
    }
}