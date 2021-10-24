/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdisagnpattern;

/**
 *
 * @author Lenovo
 */
public class SamsungTelephone implements Telephone{
    
    private int calismaVoltaji;
    
    public SamsungTelephone() {
        
        calismaVoltaji=5;
    }

    @Override
    public int sarjEt() {
        
        System.out.println("Samsung telefon calisiyor.");
        return calismaVoltaji;
    }
    
}
