/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bat_ariketa;

/**
 *
 * @author martin
 */
public class SmartWatch {
    private static SmartWatch nSmartW = null;
    // private EgoeraModua pEgoera;

    
    
    private SmartWatch()
    {
    	//this.pEgoera = new Normala();    
    }

    public static synchronized SmartWatch getInstance()
    {
    	if (nSmartW == null)
    	{
    		nSmartW = new SmartWatch();
    	}
    	return nSmartW;
    }
    


}
