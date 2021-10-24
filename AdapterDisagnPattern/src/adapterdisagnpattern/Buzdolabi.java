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
public class Buzdolabi implements ElektrikliEvAletleri {
private int volt;

    public Buzdolabi() {
        this.volt = 220;
    }
    
    

    @Override
    public int prizeTakVeCalistir() {
        
        System.out.println("Buzdolabı calısıyor.");
        return volt;
    }
    
}
