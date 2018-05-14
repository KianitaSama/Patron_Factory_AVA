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
public class Celulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        MovilCelular mobile = MovilFactory.crateMovilCelular(MovilCelular.SONY);
        MovilCelular mobile1 = MovilFactory.crateMovilCelular(MovilCelular.IPHONE);
        MovilCelular mobile2 = MovilFactory.crateMovilCelular(MovilCelular.LENOVO);
        MovilCelular mobile3 = MovilFactory.crateMovilCelular(MovilCelular.LG);
        MovilCelular mobile5 = MovilFactory.crateMovilCelular(MovilCelular.SAMSUMG);
        MovilCelular mobile4 = MovilFactory.crateMovilCelular(MovilCelular.MOTOROLA);
               

    }

}
