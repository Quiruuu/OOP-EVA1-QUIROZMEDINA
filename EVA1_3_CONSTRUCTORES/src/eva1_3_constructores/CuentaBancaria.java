/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_3_constructores;
public class CuentaBancaria {
    private String noCuenta;
    private double saldo;
    private String nomCliente;
    
    //CONSTRUCTORES:
    //CODIFICADOR DE ACCESO NOMBRE DE LA CLASE (ARGUMENTOS)
    public CuentaBancaria(){//constructor default
        noCuenta = "~";
        saldo = 0;
        nomCliente = "~";
    }
    public  CuentaBancaria(String nCuenta, double cant, String nCliente){
        noCuenta = nCuenta;
        saldo = cant;
        nomCliente = nCliente;
    }
    
    //metodos get y set 
    
    public String getNoCuenta(){
        return noCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNomCliente(){
        return nomCliente;
    }
    public void setNoCuenta(String valor){
        noCuenta = valor;
    }
    public void setSaldo(double valor){
        saldo = valor;
    }
    public void setNombreCliente(String valor){
        nomCliente = valor;
    }
}
