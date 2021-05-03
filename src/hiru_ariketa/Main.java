/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiru_ariketa;

/**
 *
 * @author martin
 */
public class Main {
    
    public static void main(String[] args) {
        Bilduma root = new Bilduma();
        Bilduma ezk = new Bilduma();
        Bilduma esk = new Bilduma();
        
        AbestiSoltea a1 = new AbestiSoltea();
        AbestiSoltea a2 = new AbestiSoltea();
        AbestiSoltea a3 = new AbestiSoltea();
        
        
        root.addOsagaia(ezk);
        root.addOsagaia(esk);
        
        ezk.addOsagaia(a1);
        esk.addOsagaia(a2);
        esk.addOsagaia(a3);
        
        
        root.pintxatu();
    }
    
}
