package eva1_6_automovil;
public class Auto {
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;
    private double adeudo;
    
    public Auto(){
        marca = "";
        modelo = "";
        placas = "";
        año = 0;
        dueño = "";
    }
    public Auto(String marcArg, String modelArg, String placArg, int añoArg, String dueñArg){
        marca = marcArg;
        placas = placArg;
        año = añoArg;
        modelo = modelArg;
        dueño = dueñArg;
        
        if (año <= 2000) {
            adeudo = 1500;
        }else if((2001 <= año) && (año <= 2005)){
            adeudo = 2000;
        }else if((2006 <= año) && (año <= 2010)){
            adeudo = 2500;
        }else if((2011 <= año) && (año <= 2015)){
            adeudo = 3000;
        }else{
            adeudo = 4000;
        }
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String Marca){
        marca = Marca; 
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){//!!!!!!!!!!!!!
        modelo = modelo;
    }
    public String getPlacas(){
        return placas;
    }
    public void setPlacas(String placas){
        modelo = placas;
    }
    public int getAño(){
        return año;
    }
    public void setAño(int año){
        año = año;
    }
    public String getDueño(){
        return dueño;
    }
    public void setDueño(String dueño){
        dueño = dueño;
    }
    public double getAdeudo(){
        return adeudo;
    }   
}
