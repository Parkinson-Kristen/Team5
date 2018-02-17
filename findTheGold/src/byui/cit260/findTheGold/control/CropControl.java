/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheGold.control;

import byui.cit260.findTheGold.model.CropData;
import java.util.Random;

/**
 *
 * @author kjpar
 */
public class CropControl {
    
//contants
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 10;
//Returns/WheatHarvest: a randomly generated number between 2 -4 bushels per acre for tithes between 8-12%.
// Returns/WheatHarvest: a randomly generated number between 1-3 bushels per acre for tithes below 8%.
// Returns/WheatHarvest: a randomly generated number between 2 and 5 bushels per acre for tithes above 12%
// Returns/WheatEatenbyRats: a randomly generated number between 3-7% of wheat in store for tithes between 8-12%
// Returns/WheatEatenbyRats: a randomly generated number between 6-10% of wheat in store for tithes below 8%
// Returns/WheatEatenbyRats: a randomly generated number between 3-5% of wheat in store for tithes above 12%

//random number generator
private static Random random = new Random();
   
//The sellLand method
//Purpose: To sell Land
//Parameter: the price of land, the number of acres to sell, and a 
//  reference to Crops object
//Returns: the number of acres owned after the sale
//Precondictions: acres to sell must be positive and  <= acresOwned


public int sellLand(int landPrice, int acresToSell, CropData cropData){

    //if acresToSell < 0, return -1
    if(acresToSell < 0)
        return -1;

    //if acresToSell > acresOwned, return -1
    int owned = cropData.getAcresOwned();
    if(acresToSell > owned)
        return -1;

    //acresOwned = acresOwned - acresToSell
    owned -= acresToSell;
    cropData.setAcresOwned(owned);

    //wheatInStore = wheatInStore + acresToSell * landPrice
    int wheat = cropData.getWheatInStore();
    wheat -= (acresToSell * landPrice);
    cropData.setWheatInStore(wheat);

    //return acresOwned
    return owned;
} 

//buyLand method
//Purpose:  Buy land which is accomplished by determining how many bushels 
//      of wheat it costs to purchase an acre of land.
//Parameters: The randomly generated number of land price multiplied by the 
//      numbers of acres the player wishes to purchase.
//Returns: The amount of acreage we are able to obtain from our purchase.
//Pre-Conditions: The randomly generated number represents currency as number 
//      of bushels it costs to purchase land.  Total land cost is bushels 
//      times number of acres wishing to purchase. 

public static int buyLand(int landPrice, int acresToPurchase, CropData cropData){
   
    //If acresToPurchase < 0, return -1
    if (acresToPurchase < 0)
        return -1;
    
    int population = cropData.getPopulation();
    
    int owned = cropData.getAcresOwned();

    //If (acresToPurchase * landPrice) > storeWheat, return -1
    int wheatInStore = cropData.getWheatInStore();
    if ((landPrice * acresToPurchase) > wheatInStore)
        return -1;

    //If Population < acresOwned/10, return -1
    if (population < ((owned + acresToPurchase)/10))
        return -1;
    
        
    //land purchase calculation
    int wheat = (landPrice * acresToPurchase);
    
    //add newly purchased land to existing acresOwned
    //acresOwned = acresOwned + acresToPurchase, return acresOwned 
    
    owned += acresToPurchase;
    cropData.setAcresOwned(owned);

    //wheat used for purchase minus wheatInStore = new wheatInStore amount
    //storeWheat = storeWheat – (storeWheat * acresToPurchase), return storeWheat
    wheat = cropData.getWheatInStore();
    wheat -= (wheat * acresToPurchase);
    cropData.setWheatInStore(wheat);

     //return acresOwned
    return owned;
}


// The setOffering method
// Purpose: To pay tithes
// Parameters: the percentage of tithes from the wheat harvest
// Pre-conditions: tithes must be in the positive
//  and <=0 
//  and >= 100

public static int setOffering(int offering, CropData cropData){
   
    // if setOffering < 0, return -1
    if (offering < 0) 
        return -1;

    // if setOffering > 100, return -1
    if(offering > 100)
        return -1;
   
    int harvest = cropData.getHarvest();
    
    int percentHarvest = (offering * 100/harvest);

    return percentHarvest;

}







}
