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
public class EvBuilder {
    
    private String il;
    private String ilce;
    private String mahalle;
    
    private int binaYili;
    private int balkonSayisi;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    
    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;
    private boolean hasKlima;
    private boolean hasHavuz;
    
    public static EvBuilder startNormalEvBuild(String il,String ilce,String mahalle,int binaYili,int odaSayisi) {
        
        EvBuilder evBuilder=new EvBuilder();
        
        evBuilder.il=il;
        evBuilder.ilce=ilce;
        evBuilder.mahalle=mahalle;
        evBuilder.binaYili=binaYili;
        evBuilder.odaSayisi=odaSayisi;
        
        return evBuilder;
        
    }
    
    public static EvBuilder startHavuzluEvBuild(String il,String ilce,String mahalle,int binaYili,int odaSayisi) {
        
        EvBuilder evBuilder=new EvBuilder();
        
        evBuilder.il=il;
        evBuilder.ilce=ilce;
        evBuilder.mahalle=mahalle;
        evBuilder.binaYili=binaYili;
        evBuilder.odaSayisi=odaSayisi;
        evBuilder.hasHavuz=true;
        
        return evBuilder;
        
    }
    
    public Ev Build() {
        
        Ev ev = new Ev();
        
    ev.setIl(il);
    ev.setIlce(ilce);
    ev.setMahalle(mahalle);
    
    ev.setBinaYili(binaYili);
    ev.setBalkonSayisi(balkonSayisi);
    ev.setOdaSayisi(odaSayisi);
    ev.setBanyoSayisi(banyoSayisi);
    ev.setTuvaletSayisi(tuvaletSayisi);
    
    ev.setIsDublex(isDublex);
    ev.setIsEsyali(isEsyali);
    ev.setHasOtopark(hasOtopark);
    ev.setHasCocukParki(hasCocukParki);
    ev.setHasKlima(hasKlima);
    ev.setHasHavuz(hasHavuz);
    
    return ev;
        
    }

    

   

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

   

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setIsDublex(boolean isDublex) {
        this.isDublex = isDublex;
        return this;
    }

    public EvBuilder setIsEsyali(boolean isEsyali) {
        this.isEsyali = isEsyali;
        return this;
    }

    public EvBuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public EvBuilder setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;
    }
    
    
    
}
