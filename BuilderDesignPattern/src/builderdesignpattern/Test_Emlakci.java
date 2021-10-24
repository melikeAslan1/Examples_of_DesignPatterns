/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

/**
 *
 * @author Lenovo
 */
public class Test_Emlakci {
    
    private static void printEv(Ev ev) {
        
        System.out.println("Ev eklendi "+ ev);
        
    }
    
    public static void main(String[] args) {
        
        Ev ev1=new Ev();
        
        ev1.setIl("İstanbul");
        ev1.setIlce("Atasehir");
        ev1.setIl("Ataturk");
        
        ev1.setOdaSayisi(3);
        ev1.setBinaYili(2010);
        ev1.setHasKlima(true);
        
        Ev ev2=new Ev("izmir","karsıyaka","mustafa kemal",2008,3,4,2,1,false,false,true,true,true,true);
        
         printEv(ev1);
         printEv(ev2);
        
        
        
        
        
    }
    
}
