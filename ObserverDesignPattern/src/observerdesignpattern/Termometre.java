/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.math.BigDecimal;

/**
 *
 * @author Lenovo
 */
public class Termometre extends Observable {
    
    private BigDecimal anlikSicaklik;
    private BigDecimal minSicaklik;
    private BigDecimal maxSicaklik;

    public Termometre(BigDecimal minSicaklik, BigDecimal maxSicaklik) {
        this.minSicaklik = minSicaklik;
        this.maxSicaklik = maxSicaklik;
        this.anlikSicaklik =BigDecimal.valueOf(24);
    }

    public BigDecimal getAnlikSicaklik() {
        return anlikSicaklik;
    }

    public void setAnlikSicaklik(BigDecimal anlikSicaklik) {
        this.anlikSicaklik = anlikSicaklik;
        System.out.println(anlikSicaklik);
        
        sicakligiKontrolEt();
    }
    
    private void sicakligiKontrolEt() {
        
        boolean isCokSicak= anlikSicaklik.compareTo(maxSicaklik) >=0;
        
        boolean isCokSoguk= anlikSicaklik.compareTo(minSicaklik) <=0;
        
        if(isCokSoguk || isCokSicak) {
            
            haberVer();
        }
    }
}
