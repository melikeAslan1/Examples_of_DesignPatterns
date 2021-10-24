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
public class Utu implements ElektrikliEvAletleri {
    
    private int volt;

    public Utu() {
        this.volt = 220;
    }
    
    

    @Override
    public int prizeTakVeCalistir() {
        
        System.out.println("ütü calısıyor.");
        return volt;
    }
    
    
    
}
