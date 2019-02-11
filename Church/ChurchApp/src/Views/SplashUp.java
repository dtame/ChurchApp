/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author dtame
 */
public class SplashUp {
    public static void main(String args[]) {
        Splash spl = new Splash();
        spl.InitSplash();
        Home home = new Home();
        home.setVisible(true);
        spl.CloseSplash();
    }
}
