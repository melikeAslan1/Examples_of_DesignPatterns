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
public class Test_Emlakci_V2 {
    
    public static void main(String[] args) {
        
        Ev ev1=EvBuilder.startNormalEvBuild("İstanbul","umraniye","Tatlısu",2009,3)
                  
                  .setHasCocukParki(true)
                  .setHasOtopark(true) 
                  .Build();
        
        Ev ev2=EvBuilder.startHavuzluEvBuild("izmir", "karşıyaka","mustafa kemal", 2010, 4)
                .setHasCocukParki(true)
                  .setHasOtopark(true) 
                  .Build();
        
        printEv(ev1);
        printEv(ev2);
        
        
        
    }
    
     private static void printEv(Ev ev) {
        
        System.out.println("Ev eklendi "+ ev);
        
    }
    
}
