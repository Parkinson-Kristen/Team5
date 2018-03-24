//CropView class - part of the view layer
//Object of this class is to manage the crop view
//Author: Team 5 - Kristen 
//Last Modified: Feb 2018
//---------------------------
package byui.cit260.findTheGold.view;

import byu.cit260.findTheGold.exception.CropException;
import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.control.*;
import java.util.Scanner;
import byui.cit260.findTheGold.Team5GameProject.*;

public class CropView {
    
    //Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    
    //Get reference to the Game object and the Crops object
    private static Game theGame = Team5GameProject.getTheGame();
    private static CropData theCropData = theGame.getCropData();
    
    
//The buyLandView method
//Purpose: interface with the user input for buying land
//Parameters: none
//Returns: none
public static void buyLandView(){
    
    //Get the cost of land for this round.
    int landPrice = CropControl.calcLandCost();
    
    //Promt the user to enter the number of acres to buy
    System.out.format("Land is selling for %d bushels per acres. \n", landPrice);
    
    //Get the user's input and save it
    int acresToPurchase;
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.print("\nHow many acres of land to you wish to buy?");
        acresToPurchase = keyboard.nextInt();
        try
        {
            //Call the buyLand() method in the control layer to buy the land
            CropControl.buyLand(landPrice, acresToPurchase, theCropData);
        }
        catch(CropException e)
        {
            System.out.println("I am sorry master, I cannot do this");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
        }
    }while(paramsNotOkay);
}
  
//The sellLandView method
//Purpose: interface with the user input to sell land
//Parameters: none
//Returns: none
public static void sellLandView(){
  
    //Get the cost of land for this round.
    int landPrice = CropControl.calcLandCost();
    
    //Promt the user to enter the number of acres to sell
    System.out.format("Land is selling for %d bushels per acres. \n", landPrice);
    
    
    //Get the user's input and save it
    int acresToSell;
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.print("\nHow many acres of land do you wish to sell? ");
        acresToSell = keyboard.nextInt();
        try
        {
            //Call the sellLand() methos in the control layer to sell the land
            CropControl.sellLand(landPrice, acresToSell, theCropData);
        }
        catch(CropException e)
        {
            System.out.println("Apologies master, this cannot be done.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
        }
    }while(paramsNotOkay);
 }
    
 

//The payOfferingView method
//Purpose:
//Parameters:
//Returns:
public static void payOfferingView(){
     
    //CropControl.payOffering(offeringBushels, wheatInStore, CropData cropData);

    //Prompt the user to enter the 
    System.out.format("The amount of tithing you offer directly affects your \n"
            + "harvest outcome and percentage of wheat in store eaten by rats \n");
    System.out.print("\nWhat percentage of your harvest would you like to \n"
            + "contribute to your tithe offering? ");
    
    //Get the user's input and save it
    int offering;
    offering = keyboard.nextInt();
    
    
    //Call the payOffering() method in the control layer to pay tithes
    CropControl.payOffering(offering, theCropData);  
}


//The feedPeopleView method
//Purpose: promts the user to decide how much grain to reserve for feeding the people
//Parameters: 
//Returns:
public static void feedPeopleView(){
   
    //Propmpt the user to enter the following:
    System.out.format("The amount of food needed to feed 1 person is 20 bushels \n"
            + "of grain. \n");
    
    
    //Get the user's input and save it
    int wheatForPeople;
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.print("\nHow many bushls whoud you like to set aside to feed your \n"
            + " your people? ");
        wheatForPeople = keyboard.nextInt();
        try
        {
         //Call the feePeople() method in the control layer to feed people
        CropControl.feedPeople(wheatForPeople, wheatForPeople, theCropData);   
        }
        catch(CropException e)
        {
            System.out.println("Apologies master, this cannot be done.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
        }
    }while(paramsNotOkay);
}
   

//The plantCropsView method
//Purpose: propmts user to choose how much grain to plant
//Parameter:
//Returns:
public static void plantCropsView(){
    
    //Prompt the user to enter the following:
    System.out.format("It takes 2 bushels of grain to plant 1 acres of land \n");
    
    
    //Get the user's input and save it
    int amountToPlant;
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.print("\nHow many bushels do you wish to use for planting? ");
        amountToPlant = keyboard.nextInt();
        try
        {
            //Call the plantCrops() method in the control layer to plant crops
            CropControl.plantCrops(amountToPlant, amountToPlant, theCropData);  
        }
        catch(CropException e)
        {
            System.out.println("Apologies master, this cannot be done.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
        }
    }while(paramsNotOkay);   
}




//The showStarvedView method
//Purpose:
//Parameters:
//Returns:
public static void showStarvedView(){
    
     //Get number of people who starved for this round.
    int numStarved = 0;
    
     //Display
    System.out.print("\nNumber of people who starved this round is "+ numStarved +". ");
    
    
}

//The runCropsView method()
//Purpose: runs the Team5GameProject game
//Parameters: none
//Returns: none
public static void runCropsView(){
    //call the buyLandView() method
    buyLandView();
    sellLandView();
    plantCropsView();
    payOfferingView();
    
    //add calls to the other crop view methods
    //as they are written
        
}

//The displayCropsReportView method
//Purpose:
//Parameters:
//Returns:
public static void displayCropsReportView(){
    //calls the CropData in the model View
    //Create the CropData object,
    //initialize it and save a reference to it in the Game.
    
    int year = theCropData.getYear();
    System.out.format("The year of reign is %d. \n", year);
    
    int numStarved = theCropData.getNumStarved();
    System.out.format("%d people starved under your watch.\n", numStarved);
    
     int newPeople = theCropData.getNewPeople();
    System.out.format("%d new people joined our city.\n", newPeople);
    
    int population = theCropData.getPopulation();
    System.out.format("The current population is: %d. \n", population);
    
    int acresOwned = theCropData.getAcresOwned();
    System.out.format("The city owns %d of the tillable land. \n", acresOwned);
    
    int acresPlanted = theCropData.getAcresPlanted();
    System.out.format("%d acres where planted this year. \n", acresOwned);
    
    int harvest = theCropData.getHarvest();
    System.out.format("This year brought a harvest of %d bushels.\n", harvest);
    
    int getOffering = theCropData.getOffering();
    System.out.format("Your tithe offering of %d was recorded in the records. \n", getOffering);
    
    int eatenByRats = theCropData.getEatenByRats();
    System.out.format("Rats ate %d bushels of wheat this year. \n", eatenByRats);
    
    int wheatInStore = theCropData.getWheatInStore();
    System.out.format("The amount of wheat stored this year was %d. \n", wheatInStore);
            

}

    
}
