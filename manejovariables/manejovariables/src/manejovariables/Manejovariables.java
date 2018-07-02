/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejovariables;

/**
 *
 * @author Usuario
 */
public class Manejovariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables boolean, declaracion
        boolean bool1;
        //inicializacion
        bool1=true;
        //declaracion e inicializacion
        boolean bool2 =false;
        System.out.println("Valor bool1:" +bool1);
        System.out.println("Valor bool2:" +bool2);
        System.out.println("");
        
        //variables byte
        byte b1 = 10;
        //literal en hexadecimal
        byte b2 = 0xa;
        System.out.println("Valor byte1:" + b1);
        System.out.println("Valor byte2:" + b2);
        System.out.println("");
        
        //variables short
        short s1= 2;
        System.out.println("Valor char1:" + s1);
        System.out.println("");
        
        //Variable char, declaracion e incializacion en una sola linea
        //la primera declaracion es en UNICODE
        //http://www.icursos.net/referencias/tablaunicode.html
        
        char ch1= 65, ch2= 'A';
     System.out.println("Valor char1:" +ch1);
     System.out.println("Valor char2:" +ch2);
     System.out.println("");
     
     //variables enteras
     int decimal = 100;
     int octal = 0144;//valor octal inicia con 0
     int hexa = 0x64;//valor hexadecimal inicia con 0x
     System.out.println("Valor int decimal:" +decimal);
     System.out.println("Valor int octal:" +octal);
     System.out.println("Valor int hexadecimal:" +hexa);
     System.out.println("");
     
     //variables long
     long long1 =10, long2= 20L;
     System.out.println("Valor long1: " +long1);
     System.out.println("Valor long2: " +long2);
     System.out.println("");
     
     //Variable float
     float f1 = 15, f2= 22.3F;
     System.out.println("Valor float1: " + f1);
     System.out.println("Valor float2: " + f2);
     System.out.println("");
     
     //Variables double
     double d1 = 11.0, d2=30.15D;
     System.out.println("Valor double1: " + d1);
     System.out.println("Valor double2: " + d2);
     System.out.println("");
   }
    
}
