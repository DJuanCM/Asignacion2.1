package Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kenic
 */
public class Tv {
    
    String marca;
    int pulgadas;
    boolean encender;
    int volumen;

    public Tv() {
        this.marca = "";
        this.pulgadas = 0;
        this.encender = false;
        this.volumen = 0;
                
    }

    public Tv(String marca, int pulgadas, boolean encender, int volumen) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.encender = encender;
        this.volumen = volumen;
    }
    
    public void encenderTv(){System.out.println("Encendiendo tv....");}
    public void apagarTv(){System.out.println("Apagando tv...."); }
    public int subirVolumen(){return this.volumen += 5;}
    public int bajarVolumen(){return this.volumen -= 5;}
    
    
    
}
