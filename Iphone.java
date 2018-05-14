/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celulares;

/**
 *
 * @author kianaA
 */
public class Iphone implements MovilCelular {
    private int Ram;
    private String Procesador;
    private int Camara;
    private String Color;
    private String Modelo;
    //public String name = MovilCelular.IPHONE;

    public Iphone(int Ram, String Procesador, int Camara, String Color, String Modelo) {
        this.Ram = Ram;
        this.Procesador = Procesador;
        this.Camara = Camara;
        this.Color = Color;
        this.Modelo = Modelo;
        
        System.out.println("IPHONE");
        System.out.println("La RAM es:"+ Ram);
        System.out.println("El procesador es :"+ Procesador);
        System.out.println("Su camara es de :"+ Camara);
        System.out.println("El color es :"+ Color);
        System.out.println("El modelo del celular es :"+ Modelo);
        System.out.println("******************************************");
    }
}
