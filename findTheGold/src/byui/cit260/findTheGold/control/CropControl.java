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
   
    //acresOwned
    int owned = cropData.getAcresOwned();
    
    //population
    int population = 100;
    
    //storeWheat
    int wheat = cropData.getWheatInStore();

    //If acresToPurchase < 0, return -1
    if (acresToPurchase < 0)
        return -1;

    //If (acresToPurchase * landPrice) > storeWheat, return -1
    if ((acresToPurchase * landPrice) > wheat)
        return -1;

    //If Population < acresOwned/10, return -1
    if (population < owned/10)
        return -1;

    //acresOwned = acresOwned + acresToPurchase, return acresOwned 
    owned -= acresToPurchase;
    cropData.setAcresOwned(owned);

    //storeWheat = storeWheat – (storeWheat * acresToPurchase), return storeWheat
    wheat -= (wheat * acresToPurchase);
    cropData.setWheatInStore(wheat);

     //return acresOwned
    return owned;
}



}
