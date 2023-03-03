package Paquete1;

import Paquete2.ClaseE;
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA; 
    
    public void prueba(){
        //TODAS ESTAS CLASES ESTAN EN PAQUETE1
        //MISMO PAQUETE, 
        ClaseB objb = new ClaseB(); 
        //objb.publicB;
        //objb.defaultB;
        
        ClaseC objc = new ClaseC();
        //objc.publicC;
        //objc.defaultC;
        
        ClaseD objd = new ClaseD();
        //objd.publicD;
        //objd.defaultD;
        
        //CLASES DEL PAQUETE2
        //TODO LO QUE SEA DEFAULT, ES AHORA INVISIBLE
        ClaseE obje = new ClaseE();
        //obje.publicE;
        
        //ClaseF --- ES DEFAULT, POR LO TANTP
        //NO ES VISIBLE EN OTROS PAQUETES 
        //ClaseF objf = new ClaseF(); 
    }
}

class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB; 
}