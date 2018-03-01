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
    public void testBuyLand1() {
        System.out.println("buyLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(300);
        theCrops.setAcresOwned(1000);
        int landPrice = 17;
        int acresToPurchase = 10;
        int population = 150;
        theCrops.setPopulation(population);
        CropControl instance = new CropControl();
        int expResult = 1010; 
        int result = instance.buyLand(landPrice, acresToPurchase, theCrops);
        assertEquals(expResult, result);  
    }
    @Test
    public void testBuyLand2() {
        System.out.println("buyLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(300);
        theCrops.setAcresOwned(1000);
        int landPrice = 20;
        int acresToPurchase = -1;
        int population = 150;
        theCrops.setPopulation(population);
        CropControl instance = new CropControl();
        int expResult = -1; //returns -1 because of an negative acresToPurchase
        int result = instance.buyLand(landPrice, acresToPurchase, theCrops);
        assertEquals(expResult, result);  
    }
    @Test
    public void testBuyLand3() {
        System.out.println("buyLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(50);
        theCrops.setAcresOwned(1000);
        int landPrice = 20;
        int acresToPurchase = 10;
        int population = 150;
        theCrops.setPopulation(population);
        CropControl instance = new CropControl();
        int expResult = -1; //returns -1 because not enough wheat to make purchase
        int result = instance.buyLand(landPrice, acresToPurchase, theCrops);
        assertEquals(expResult, result);  
    }
@Test
    public void testBuyLand4() {
        System.out.println("buyLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(300);
        theCrops.setAcresOwned(1000);
        int landPrice = 23;
        int acresToPurchase = 10;
        int population = 100;
        theCrops.setPopulation(population);
        CropControl instance = new CropControl();
        int expResult = -1; //returns -1 not enough people to tend the land
        int result = instance.buyLand(landPrice, acresToPurchase, theCrops);
        assertEquals(expResult, result);  
    }
    @Test
    public void testBuyLand5() {
        System.out.println("buyLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setAcresOwned(1000);
        int landPrice = 27;
        int acresToPurchase = 10;
        int population = 300;
        theCrops.setPopulation(population);
        CropControl instance = new CropControl();
        int expResult = 1010; //
        int result = instance.buyLand(landPrice, acresToPurchase, theCrops);
        assertEquals(expResult, result);  
    }

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering1() {
        System.out.println("setOffering");
        CropData theCrops = new CropData();
        int offering = 5;
        int harvest = 50;
        theCrops.setHarvest(harvest);
        int expResult = 10;
        int result = CropControl.setOffering(offering, theCrops);
        assertEquals(expResult, result);
    }
@Test
    public void testSetOffering2() {
        System.out.println("setOffering");
        CropData theCrops = new CropData();
        int offering = -5;
        int harvest = 50;
        theCrops.setHarvest(harvest);
        int expResult = -1;
        int result = CropControl.setOffering(offering, theCrops);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetOffering3() {
        System.out.println("setOffering");
        CropData theCrops = new CropData();
        int offering = 101;
        int harvest = 50;
        theCrops.setHarvest(harvest);
        int expResult = -1;
        int result = CropControl.setOffering(offering, theCrops);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testpayOffering1(){
        System.out.println("payOffering");
        CropData theCrops = new CropData();
        int offeringBushels = -1;
        int wheatInStore = 50;
        theCrops.setHarvestAfterOffering(wheatInStore);
        int expResult = -1;
        int result = CropControl.payOffering(offeringBushels, wheatInStore, theCrops);
        assertEquals(expResult, result);
    }
    
    
}
