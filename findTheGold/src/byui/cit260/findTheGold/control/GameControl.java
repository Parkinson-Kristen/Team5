//GameControl class - part of the control layer
//Object of this class is to manage the game control
//Author: Team 5 - Kristen 
//Last Modified: March 1 2018
//---------------------------
package byui.cit260.findTheGold.control;

import byui.cit260.findTheGold.Team5GameProject.Team5GameProject;
import byui.cit260.findTheGold.model.*;
import byui.cit260.findTheGold.view.*;
import java.util.Random;

public class GameControl {
    
//contants
private static final int MAX_ROW = 5;
private static final int MAX_COL = 5;

//random number generator
private static Random random = new Random();


//Get reference to the Game object and the Crops object
    private static Game theGame = Team5GameProject.getTheGame();
    private static CropData theCropData = theGame.getCropData();
    private static ListMenuView listMenuView = new ListMenuView();
    
}
