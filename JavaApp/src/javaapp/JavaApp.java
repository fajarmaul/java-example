/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;
import java.util.Scanner;
/**
 *
 * @author student
 */

public class JavaApp {
    /**
     * @param args the command line arguments
     */
    
//    CarEngine aCarEngine;
//    CarCondition aCarCondition;
//    CarTires aCarTires;
//   
    
    public void getStatus(CarEngine aCarEngine){
        System.out.println(
                "Bensin Sebanyak "+aCarEngine.getBensin()
                +"\nOli Sebanyak "+(int)aCarEngine.getOli()
                +"\nMobil dalam keadaan "
                +aCarEngine.cekEngine()
                +" Jalan"
        );                           
    }
    
    public void jalan(CarEngine aCarEngine, CarCondition aCarCondition, CarTires aCarTires){
        int overkilo;
        aCarEngine.konsumsiBensin();
        aCarEngine.konsumsiOli();
        aCarCondition.kiloNaik();        
        
        overkilo = aCarCondition.getOverKilo();
        if(aCarCondition.getKiloMobil()%5 == 0){
            aCarCondition.setIsNeedPerbaikan(true);
        }
        
        if(aCarCondition.isIsNeedPerbaikan()==true){            
            aCarCondition.setOverKilo(++overkilo);            
        }
        
        if(aCarCondition.getOverKilo()>10){
            aCarCondition.setRusak(true);
        }
    }
    
    public void isiBensin(CarEngine mesin, int bensin){        
        int bensinDiMesin = mesin.getBensin();
        
        System.out.println("Bensin Sekarang ada "+bensinDiMesin);
        mesin.setBensin(bensinDiMesin+bensin);
        System.out.println("Setelah diisi, bensin ada "+mesin.getBensin());
    }
    
    public void isiOli(CarEngine mesin, int oli){        
        int oliDiMesin = (int) mesin.getOli();
        mesin.setOli(oliDiMesin+oli);        
    }
    
    
    public static void main(String[] args) {
        int bensin;
        int oli;       
        String command;
        JavaApp j ;
        
            Scanner sc=new Scanner(System.in);
            CarEngine aCarEngine = new CarEngine(); 
            CarCondition aCarCondition = new CarCondition();
            CarTires aCarTires = new CarTires();
            j = new JavaApp();
        
            bensin = sc.nextInt();
            oli = sc.nextInt();
            aCarEngine.setBensin(bensin);
            aCarEngine.setOli(oli);
            
            command = sc.nextLine();
            while(!command.equals("stop")){                
                j.jalan(aCarEngine,aCarCondition,aCarTires);                                
                System.out.println(
                    "Status Mobil = "+aCarEngine.getBensin()+
                    " Bensin: "+ aCarEngine.getOli()+ 
                    " Kilo : "+ aCarCondition.getKiloMobil()+
                    " Overkilo: "+aCarCondition.getOverKilo()
                );        
               
                if(!aCarCondition.isRusak()){
                    command = sc.nextLine();
                }else{
                    System.out.println("Mobil Rusak :(((");
                    break;
                }                    
                System.out.println(command);
            }
            
    }
    
}
