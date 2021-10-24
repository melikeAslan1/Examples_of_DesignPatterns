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
public class TelefonEEAAdapter implements ElektrikliEvAletleri{
    
    private Telephone telephone;

    public TelefonEEAAdapter(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public int prizeTakVeCalistir() {
       
        return telephone.sarjEt();
    }
    
    
    
}
