/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;


/**
 *
 * @author student
 */
public class CarCondition {
   private int kiloMobil;
   private boolean isNeedPerbaikan;
   private int overKilo;
   private boolean rusak;

    public CarCondition() {
        this.kiloMobil = 0;
        this.isNeedPerbaikan = false;
        this.overKilo = 0;
        this.rusak = false;
    }

  //Setter-Getter
    public int getKiloMobil() {
        return kiloMobil;
    }
    
    public void setKiloMobil(int kiloMobil) {
        this.kiloMobil = kiloMobil;
    }

    public boolean isIsNeedPerbaikan() {
        return isNeedPerbaikan;
    }
    
    public void setIsNeedPerbaikan(boolean isNeedPerbaikan) {
        this.isNeedPerbaikan = isNeedPerbaikan;
    }       

    public int getOverKilo() {
       return overKilo;
    }

    public void setOverKilo(int overKilo) {
        this.overKilo = overKilo;
    }

    public boolean isRusak() {
        return rusak;
    }

    public void setRusak(boolean rusak) {
        this.rusak = rusak;
    }
    
//Method
   
    public void repaired(){
        this.isNeedPerbaikan = false;
    }
    
    public void kiloNaik(){
        this.kiloMobil += 1;
    }
    
    public boolean cekKondisiMobil(){
        if(overKilo>10){
            this.rusak = true;            
        }
        return this.isRusak();
    }
  
    
}
