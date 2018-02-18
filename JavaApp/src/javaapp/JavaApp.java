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
    
    public void getStatus(CarEngine aCarEngine, CarCondition aCarCondition){               
        System.out.println(
                    "Status Bensin : "+aCarEngine.getBensin()+
                    " Oli : "+ aCarEngine.getOli()+ 
                    " Kilo : "+ aCarCondition.getKiloMobil()+
                    " Perlu Perbaikan :"+aCarCondition.isIsNeedPerbaikan()+
                    " Overkilo: "+aCarCondition.getOverKilo()                
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
            command = sc.nextLine();
            aCarEngine.setBensin(bensin);
            aCarEngine.setOli(oli);

//Main Looping
            while(!(command = sc.nextLine()).equals("stop")){ 
                if (command.equals("jalan")){
                    j.jalan(aCarEngine,aCarCondition,aCarTires);   
                    j.getStatus(aCarEngine, aCarCondition);
                    if(aCarCondition.isRusak()){
                        System.out.println("Mobil Rusak :(((");
                        break;
                    }
                }
                else if (command.equals("perbaiki")){
                    aCarCondition.doPerbaikan();                                        
                }
                else if (command.equals("isibensin")){
                    bensin = sc.nextInt();
                    aCarEngine.isiBensin(bensin);
                }
                else if (command.equals("isioli")){
                    oli = sc.nextInt();
                    aCarEngine.isiOli(oli);                    
                }
                else
                    System.out.println("Wrong Input, please resubmit input");
                
                System.out.println("Command is : "+command);
            }
            
    }
    
}
