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
public class Test {
    public static void main(String[] args) {
        
        
         
    Priz priz = new Priz();
    
    Utu utu=new Utu();
    
    Buzdolabi buzdolabi=new Buzdolabi();
    
    priz.elektrikVer(utu);
    priz.elektrikVer(buzdolabi);
    
    SamsungTelephone samsungTelephone = new  SamsungTelephone();
    
    TelefonEEAAdapter adapter= new  TelefonEEAAdapter(samsungTelephone);
    
    priz.elektrikVer(adapter);
    }
   
    
}
