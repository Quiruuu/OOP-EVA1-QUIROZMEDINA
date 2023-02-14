/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_constructores;
public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        // TODO code application logic here :o
        CuentaBancaria cuenta1 = new CuentaBancaria("100", 1000000,"Carlos Slim");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta1.getNomCliente());
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta1.getNoCuenta());
        
        CuentaBancaria cuenta2 = new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta2.getNomCliente());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta2.getNoCuenta());
        
        CuentaBancaria cuenta3 = new CuentaBancaria("300", 100000000,"jOHN JONES");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println(cuenta3.getNomCliente());
        System.out.println(cuenta3.getSaldo());
        System.out.println(cuenta3.getNoCuenta());
        
    }
    
}
