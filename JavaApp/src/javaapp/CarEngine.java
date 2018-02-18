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
public class CarEngine {
    private Boolean layak;
    private int bensin;
    private int oli;

    public CarEngine() {
        this.layak = true;
        this.bensin = 0;
        this.oli = 0;
    }
       
    public Boolean getLayak() {
        return layak;
    }

    public int getBensin() {
        return bensin;
    }

    public float getOli() {
        return oli;
    }

    public void setLayak(Boolean layak) {
        this.layak = layak;
    }

    public void setBensin(int bensin) {
        this.bensin = bensin;
    }

    public void setOli(int oli) {
        this.oli = oli;
    }
    
    public void konsumsiBensin(){
        this.bensin -= 1;
    }
    
    public void konsumsiOli(){
        this.oli -= 1;
    }
    
    public String cekEngine(){
        if (this.bensin>0 && this.oli>0){
            this.layak=true;
            String aString = "Layak";
            return aString;
        }
        else{
            this.layak=false;
            String astring = "Tidak Layak";
            return astring;
        }
    }
    
    public void isiBensin(int bensin){                        
        System.out.println("Bensin Sekarang ada "+this.bensin);
        this.setBensin(this.bensin+bensin);
        System.out.println("Setelah diisi, bensin ada "+this.bensin);
    }
    
    public void isiOli(int oli){        
        System.out.println("Oli Sekarang ada "+this.oli);
        this.setOli(this.oli+oli);
        System.out.println("Stelah diisi, Oli Sekarang ada "+this.oli);
    }
    
}
