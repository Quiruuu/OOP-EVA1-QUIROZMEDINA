package Paquete1;

import Paquete2.ClaseE;
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC; 
    
    public void prueba(){
    //CLASE DEL MISMO PAQUETE
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
    //CLASE DE PAQUETE2
        ClaseE objE = new ClaseE();
        //objE.publicE;
    
    //ES DEFAULT Y NO ES VISIBLE EN OTRO PAQUETE
        //ClaseF objF = new ClaseF();
        
    
    }
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD; 
}