//CropView class - part of the view layer
//Object of this class is to manage the crop view
//Author: Team 5 - Jeff and Kristen 
//Last Modified: Feb 2018
//---------------------------
package byui.cit260.findTheGold.view;

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
    System.out.format("Land is selling for %d bushels per acres/%n", landPrice);
    System.out.print("\nHow many acres of land do you wish to buy?");
    
    //Get the user's input and save it
    int acresToPurchase;
    acresToPurchase = keyboard.nextInt();
    
    //Call the buyLnad() method in the control layer to buy the land
    CropControl.buyLand(landPrice, acresToPurchase, theCropData);
    
}
  
//The sellLandView method
//Purpose: interface with the user input to sell land
//Parameters: none
//Returns: none

public static void sellLandView(){
  
    //Get the cost of land for this round.
    int landPrice = CropControl.calcLandCost();
    
    //Promt the user to enter the number of acres to sell
    System.out.format("Land is selling for %d bushels per acres/%n", landPrice);
    System.out.print("\nHow many acres of land do you wish to sell?");
    
    //Get the user's input and save it
    int acresToSell;
    acresToSell = keyboard.nextInt();
    
    //Call the buyLnad() methos in the control layer to buy the land
    CropControl.sellLand(landPrice, acresToSell, theCropData);  
}

//The payOfferingView method
//Purpose:
//Parameters:
//Returns:

public static void payOfferingView(){
     
    int offering = keyboard.nextInt();
            //CropControl.payOffering(offeringBushels, wheatInStore, CropData cropData);

    //Prompt the user to enter the 
    System.out.format("The amount of tithing you offer directly affects your "
            + "harvest outcome and percentage of wheat in store eaten by rats/%n");
    System.out.print("\nWhat percentage of your havest would you like to "
            + "contribute to your tithe offering?");
    
    //Get the user's input and save it
    int offeringBushels;
    offeringBushels = keyboard.nextInt();
    
    //Call the payOffering() method in the control layer to pay tithes
    CropControl.payOffering(offeringBushels, offering, theCropData);  
}


//The feedPeopleView method
//Purpose:
//Parameters: 
//Returns:

public static void feedPeopleView(){
    
}

//The plantCropsView method
//Purpose: interface 
//Parameter:
//Returns:

public static void plantCropsView(){
    
}

//The showStarvedView method
//Purpose:
//Parameters:
//Returns: 

public static void showStarvedView(){
    
}

//The runCropsView method()
//Purpose: runs the Team5GameProject game
//Parameters: none
//Returns: none

public static void runCropsView(){
    //call the buyLandView() method
    buyLandView();
    
    //add calls to the other crop view methods
    //as they are written
        
}

//The displayCropsReportView method
//Purpose: runs the Team5GameProject game
//Parameters: none
//Returns: none

public static void displayCropsReportView(){
    
}

    
}
