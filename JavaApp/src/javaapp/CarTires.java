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
public class CarTires {
    private boolean kondisiBan;
    private String merkBan;

    public CarTires() {
        this.kondisiBan = true;
        this.merkBan = "Astra";
    }

    
    public boolean isKondisiBan() {
        return kondisiBan;
    }

    public String getMerkBan() {
        return merkBan;
    }

    public void setKondisiBan(boolean kondisiBan) {
        this.kondisiBan = kondisiBan;
    }

    public void setMerkBan(String merkBan) {
        this.merkBan = merkBan;
    }
    
    
}
