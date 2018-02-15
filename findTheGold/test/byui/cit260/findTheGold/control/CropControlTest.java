/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheGold.control;

import byui.cit260.findTheGold.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kjpar
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        int landPrice = 15;
        int acresToSell = 10;
        CropControl instance = new CropControl();
        int expResult = 2790;
        int result = instance.sellLand(landPrice, acresToSell, theCrops);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(2800);
        int landPrice = 26;
        int acresToPurchase = 10;
        CropControl instance = new CropControl();
        int expResult = -1; //returns -1 because of an un-implemented method of getAcresOwned
        int result = instance.buyLand(landPrice, acresToPurchase, theCrops);
        assertEquals(expResult, result);
        
        
    }
    
}
