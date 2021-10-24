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
public class test {

    public static void main(String[] args) {

        BigDecimal minSicaklik = BigDecimal.valueOf(23);
        BigDecimal maxSicaklik = BigDecimal.valueOf(28);

        Termometre termometre = new Termometre(minSicaklik, maxSicaklik);

        Ebeveyn anne = new Ebeveyn("Anne");
        Ebeveyn baba = new Ebeveyn("Baba");

        termometre.ekle(anne);
        termometre.ekle(baba);

        for (int i = termometre.getAnlikSicaklik().intValue(); i <= 30; i++) {

            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }

        for (int i = termometre.getAnlikSicaklik().intValue(); i >= 22; i--) {

            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));

        }
        
        
//        Observable

    }
}
