/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_2_clasesjava;

public class Persona {
    //DATOS --> ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    //METODOS --> COMPORTAMIENTO DE LA CLASE
    //LEER Y ESCRIBIR ÑPS ATRIBUTOS DE LA CLASE
    //LEER --> GET
    //ESCRIBIR --> SET
    //MODIFICADOR DE ACCESO VALOR DE RETORNO NOMBRE DEL METODO (ARGUMENTOS)()
    public String getNombre(){//get
        return nombre;
    }
    public void setNombre(String valor){//set
        nombre = valor;
    }
    public int getEdad(){//get
        return edad;
    }
    public void setEdad(int valor){//set
        edad = valor;
    }
    public String getApellidos(){//get
        return apellidos;
    }
    public void setApellidos(String valor){//set
        apellidos = valor;
    }
    public char getGenero(){//get
        return genero;
    }
    public void setGenero(char valor){//set
        genero = valor;
    }
    public void imprimierDatos(){
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        if(genero == 'H'){
            System.out.println("Hombre");
        }else if(genero == 'M'){
            System.out.println("Mujer");
        }else{
            System.out.println("Genero no registrado");
        }
            
    }
}