/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

/**
 *
 * @author Lenovo
 */
public class Ebeveyn implements Observer {

    private String adi;

    public Ebeveyn(String adi) {
        this.adi = adi;
    }
    
    @Override
    public void update(Observable observable) {
        
        Termometre termometre= (Termometre) observable;
        
        System.out.println(adi+ "dedi ki oo sicaklik "+ termometre.getAnlikSicaklik()+"derece olmuş.");
        
    }
    
}
