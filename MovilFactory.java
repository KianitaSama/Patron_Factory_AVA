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
public class MovilFactory {

    public static MovilCelular crateMovilCelular(String type) {
        if (type.equals(MovilCelular.SONY)) {
            return new Sony(6, "A9", 18, "Azul", "XperiaXA");
        } else if (type.equals(MovilCelular.IPHONE)) {
            return new Iphone(5, "IOS 11", 21, "Negro", "IphoneX");
        } else if (type.equals(MovilCelular.LENOVO)) {
            return new Lenovo(4, "Android Jelly", 11, "Blanco", "phablet2");
        } else if (type.equals(MovilCelular.LG)) {
            return new Lg(3, "Android Malvabisoco", 13, "Dorado", "Lg Q8");
        } else if (type.equals(MovilCelular.MOTOROLA)) {
            return new Motorola(2 , "Android 3", 21 , "Negro", "Moto G");
        } else if (type.equals(MovilCelular.SAMSUMG)) {
            return new Samsumg(1, "Android Ju", 23, "Platinado", "S9");
        } else {
            return null;
        }
    }
}
