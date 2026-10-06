/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author kenic
 */
public class Prueba {
    public static void main(){
    Tv tv1 = new Tv();
    Tv tv2 = new Tv();
    Tv tv3 = new Tv();
    
    tv1.marca = "Samsung";
    tv1.pulgadas = 55;
    tv1.volumen = 22;
    tv1.encender= true;
        System.out.println("---------------------------------");
        System.out.println("Marca: " + tv1.marca);
        System.out.println("Pulgada: " + tv1.pulgadas);
        System.out.println("Encendido: " + tv1.encender);
        System.out.println("Volumen: " + tv1.volumen);
    
    }
}
