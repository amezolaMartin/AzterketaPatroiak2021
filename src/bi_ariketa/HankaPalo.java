/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bi_ariketa;

/**
 *
 * @author martin
 */
public class HankaPalo implements Izozkia{

    public HankaPalo() {
        this.edukiaIzoztu();
        this.izozkiaPrestatu();
        this.edukiaSartu();
    }

    @Override
    public void edukiaIzoztu() {
        System.out.println("Edukia izoztu da. ");
    }

    @Override
    public void izozkiaPrestatu() {
        System.out.println("Izozkia prestatu da. ");
    }

    @Override
    public void edukiaSartu() {
        System.out.println(" Edukia izozkian sartu da.");
    }
    
    
 
    
}
