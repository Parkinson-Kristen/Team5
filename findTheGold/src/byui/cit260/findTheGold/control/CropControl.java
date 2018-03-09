//CropControl class - part of the control layer
//Object of this class is to manage the crop control
//Author: Team 5 - Kristen 
//Last Modified: March 1 2018
//---------------------------
package byui.cit260.findTheGold.control;

import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.view.*;
import java.util.Random;

public class CropControl {
    
//contants
private static final int ACRES_PER_BUSHEL = 2;
private static final int PEOPLE_PER_ACRE = 10;
private static final int BUSHELS_PER_PERSON = 20;
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 10;
private static final int YIELD_RANGE = 4;
private static final int YIELD_BASE = 1;

//Returns/WheatHarvest: a randomly generated number between 2 -4 bushels per 
    //acre for tithes between 8-12%.
// Returns/WheatHarvest: a randomly generated number between 1-3 bushels per 
    //acre for tithes below 8%.
// Returns/WheatHarvest: a randomly generated number between 2 and 5 bushels 
    //per acre for tithes above 12%
// Returns/WheatEatenbyRats: a randomly generated number between 3-7% of wheat 
    //in store for tithes between 8-12%
// Returns/WheatEatenbyRats: a randomly generated number between 6-10% of wheat 
    //in store for tithes below 8%
// Returns/WheatEatenbyRats: a randomly generated number between 3-5% of wheat 
    //in store for tithes above 12%

//random number generator
private static Random random = new Random();

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


//The sellLand method
//Purpose: To sell Land
//Parameter: the price of land, the number of acres to sell, and a 
//  reference to Crops object
//Returns: the number of acres owned after the sale
//Precondictions: acres to sell must be positive and  <= acresOwned

public static int sellLand(int landPrice, int acresToSell, CropData cropData){

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
    wheat += (acresToSell * landPrice);
    cropData.setWheatInStore(wheat);

    //return acresOwned
    return owned;
} 


//The feedPeople method
//Purpose: set aside wheat to feed the people
//Parameters: wheat in store must be greater than wheat needed to feed people
//Return: wheat in store after feeding people
public static int feedPeople(int wheatInStore, int peopleFed, CropData cropData){

    //bushelsPerPerson = wheat * 20 Bushels to feed 1 
    int bushelsPerPerson = wheatInStore * 20;
    
    //If wheat in store < population * bushelsPerPerson, return -1
    if (wheatInStore < cropData.getPopulation() * bushelsPerPerson)
        return -1;

    //setPeopleFed = poulation * (wheat * 20)
    peopleFed = (cropData.getPopulation() * bushelsPerPerson);
    cropData.setPeopleFed(peopleFed);
            
    //wheat used to feed people minus wheatInStore = new wheatInStore amount
    //storeWheat = storeWheat – (population * bushelsPerPerson), return storeWheat
    
    wheatInStore = wheatInStore - peopleFed;

    //return wheatAvailable
    return wheatInStore;
    
    
}

// The plantCrops method
// Purpose: Plant Crops
// Parameters: Enter the number of acres that you wish to plant. You can plant 
//    2 acres with one bushel of wheat.
// Pre-conditions: The bushels of wheat must be positive number that is less than 
//    or equal to the total amount of land that the city owns. The amount of wheat 
//    must be less than or equal to the total amount of wheat in storage. 
// Check to make sure that the value is positive. If it is not, show a message 
//    and ask the user to enter the value again.
// Check to make sure the city has this much land. If not, show a message and 
//    ask the user to enter a new value.
// Check to make sure that the city has enough wheat in storage to plant this 
//    many acres (You can plant 2 acres with one bushel of wheat). If not, show 
//    a message and ask the user to enter a new value.
// Returns: The number of bushels required to plant the crops subtracted from 
//    the amount of wheat in storage.
// Returns: Number of acres that have been planted.
public static int plantCrops(int wheatToPlant, int acresToPlant, CropData cropData){
   
    //If acresToPlant < 1, return -1
    if (acresToPlant < 1)
        return -1;
    
    int acresAvailable = cropData.getAcresOwned();
    
    int wheatAvailable = cropData.getWheatInStore();
    
    //If acresToPlant > acresAvailable, return -1
    if (acresToPlant > acresAvailable) 
        return -1;
    
    //If wheatToPlant > wheatAvailable, return -1
    if (wheatToPlant > wheatAvailable) 
        return -1;

    //wheatAvailable = acresToPlant / 2
    wheatAvailable = acresToPlant / 2;

    //wheatAvailable = wheatAvailable – wheatToPlant
    wheatAvailable = (wheatAvailable - wheatToPlant);

    //return wheatAvailable
    return wheatAvailable;
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


//calcLandCost()method
//Purpose: Caluclate a random land cost between 17 and 26 bushels/acre
//Parameters: none
//Returns: the land cost
public static int calcLandCost(){
    int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
    return landPrice;
        
}
        

//The payOffering method
//Purpose: subtract set offering from 
//Parameters: set offering
//Returns: wheat in store after offering
public static int payOffering(int offeringBushels, int wheatInStore, CropData cropData){
    
    // if setOffering < 0, return -1
    if (offeringBushels < 0) 
        return -1;

    // if setOffering > 100, return -1
    if(offeringBushels > 100)
        return -1;
   
    int wheat = cropData.getWheatInStore();
    
    int payOffering = (wheatInStore - offeringBushels);

    return wheatInStore;
        
    }


//The calcEatenByRats method
//Purpose: wheat eaten by rats from wheat in store
//Parameters: Offering percentage
//Returns: what in store
public static int calcEatenByRats(int offering, int wheatInStore, CropData cropData){
    return 0;
        
    }


//The calcStarved method
//Purpose: to subtract the number of people who starved due to lack of wheat
    //available in store - need 3 bushels of wheat in store to feed 1 person
//Parameters
//Returns:
public static int calcStarved(int population, int peopleFed, CropData cropData){
    return 0;
        
    }
    



}
