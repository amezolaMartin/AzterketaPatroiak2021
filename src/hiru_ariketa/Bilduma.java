/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiru_ariketa;

import java.util.ArrayList;

/**
 *
 * @author martin
 */
public class Bilduma implements  MultimediaOsagaia {
        private ArrayList<MultimediaOsagaia> lista;
    public Bilduma()
    {
        this.lista = new ArrayList<MultimediaOsagaia>();
    }
    
    public void addOsagaia(MultimediaOsagaia pO){
        this.lista.add(pO);
    }
    
    public void pintxatu()
    {
        for (MultimediaOsagaia m: lista)
        {
            m.pintxatu();
        }
    }
}
