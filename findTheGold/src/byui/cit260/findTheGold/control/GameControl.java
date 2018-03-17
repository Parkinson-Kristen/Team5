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
import java.util.ArrayList;
import java.util.Scanner;

public class GameControl {
    
Scanner keyboard = new Scanner(System.in); 
    
//size of the Locations array
private static final int MAX_ROW = 5;
private static final int MAX_COL = 5;

//random number generator
private static Random random = new Random();


//Get reference to the Game object and the Crops object
private static Game theGame;
//private static CropData theCropData; //= theGame.getCropData();
//private static ListMenuView listMenuView = new ListMenuView();


 //The startNewGame method
    //Purpose: creates game object and starts the game
    //Parameters: none
    //Returns: none
    //-----------------------
    public void startNewGame(){
    
    //Create a new Game object;
    //Game theGame = new Game();
    
    //Save a reference to it in the GameProject class.
    //Team5GameProject.setCurrentGame(theGame);
    
    //Display the Banner Page.
    System.out.println("\n***************************************************\n" +
            "* Welcome to the city of Aaron. You have been summoned *\n" +
            "* here by the High Priest to assume your role as ruler of the city. *\n" +
            "* Your responsibility is to buy and sell land, determine how much wheat *\n" +
            "* to plant each year and how much to set aside to feed your people. In *\n" +
            "* addition, it will be your job to pay an annual tithe on the wheat that *\n" +
            "* is harvested.  If you fail to provide enough wheat for the people to eat, *\n" +
            "* people will starve, and your workforce will be diminished.  Plan very *\n" +
            "* carefully or you may find yourself in trouble with the people.  And OH! *\n" +
            "* there is always a danger of rats eating your wheat. *\n" +
            "* Look for clues through out the game to help you succeed! *\n");
    
    
    //Prompt for and get the user's name, create player object, and save it in the Game
    String name;
    System.out.println("\nPlease type in your first name:");
    name = keyboard.next();
    
    //Display a welcome message.
    System.out.println("\nWelcome Supreme High Ruler " +name+ ". Rule wisely and you \n" +
            "will be showered with praise at the end of your term.  Rule \n" +
            "poorly and you will be thrown out of the city and forever be shunned \n" +
            "as an outcast!\n");
    
    //call the createNewGame() method.  Pass the name as a parameter
    GameControl.createNewGame(name);
    GameControl.createCropDataObject();
    GameControl.createAnimalList();
    GameControl.createToolList();
    GameControl.createProvisionList();
    //GameControl.
    
    //Display initial report for city stats
    CropView.displayCropsReportView();
    
    //theGame.setCropData(theCrops);
    //show the game menu
    GameMenuView gmv = new GameMenuView();
    gmv.displayMenu();
}
    public static void createNewGame(String playerName){
    
        //Create the game object. Save it in the main driver file
        theGame = new Game();
        Team5GameProject.setCurrentGame(theGame);
    
        //Create the player object.  Save it in the game object
        Player thePlayer = new Player();
        thePlayer.setPlayerName(playerName);
        theGame.setPlayer(thePlayer);
}
  
    //Create the CropData object
    public static void createCropDataObject(){
    
            CropData theCrops = new CropData();
        
            theCrops.setYear(0);
            theCrops.setPopulation(100);
            theCrops.setNewPeople(5);
            theCrops.setCropYield(3);
            theCrops.setNumberWhoDied(0);
            theCrops.setOffering(10);
            theCrops.setWheatInStore(2700);
            theCrops.setAcresOwned(1000);
            theCrops.setAcresPlanted(1000);
            theCrops.setHarvest(3000);
            theCrops.setOfferingBushels(300);
            theCrops.setAcresPlanted(1000);
    
            theGame.setCropData(theCrops);
        }

    //Create the list of animals
    public static void createAnimalList(){
        
            ArrayList<ListItem> animals = new ArrayList<ListItem>();
        
            animals.add(new ListItem("cows", 12));
            animals.add(new ListItem("horses", 3));
            animals.add(new ListItem("pigs", 7));
            animals.add(new ListItem("goats", 4));
        
            theGame.setAnimals(animals);
        }

    //Create the list of tools
    public static void createToolList(){
        
            ArrayList<ListItem> tools = new ArrayList<ListItem>();
        
            tools.add(new ListItem("shovel", 4));
            tools.add(new ListItem("wheelbarrow", 10));
            tools.add(new ListItem("rake", 12));
            tools.add(new ListItem("hammer", 15));
            tools.add(new ListItem("bags of nails", 25));
            tools.add(new ListItem("hand pick", 15));
            tools.add(new ListItem("tamper", 5));
        
            theGame.setTools(tools);
        
        }

    //Create the list of provisions
    public static void createProvisionList(){
        
            ArrayList<ListItem> provisions = new ArrayList<ListItem>();
        
            provisions.add(new ListItem("tents", 6));
            provisions.add(new ListItem("lantern", 12));
            provisions.add(new ListItem("bed roll",85));
            provisions.add(new ListItem("canoe", 15));

            theGame.setProvision(provisions);

        }
    
    public static void createTeamMemberList(){
        
            //theGame.setTeam(TeamMember.Kristen);//TeamMember.

        }    

    //The createMap method
    //Purpose: creates the location objects and the map
    //Parameters: none
    //Returns: none
    public static void createMap(){
        
        //create the Map object, it is  5 x 5
        //refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        int c;
       //create a a new Location object
       Location loc = new Location();
        
       //create a string for the hilltop fortification location 
       String fortifications = "\nThe hilltop fortification sit atop Mount" +
              "Amanecer.  These fortifications guard the city from intruders" +
              "from the south as well as being a lookout over the entire Valley" +
              "of Aaron.";
       //set the hilltop fortification location with a hint
       loc.setDescription(fortifications);
       loc.setSymbol("-->^^^<--");
       theMap.setLocation(4,4,loc);
       
       
       //create a string that will go in the Location objects that contain the river
       String river ="\nYou are on the River.  The river is the source of life" +
               "for our city.  The river cuts through the Land of Aaron near the" +
               "western borders, dividing the land 2/3 on it's Eastern banks" +
               "and 1/3 of the land on the Western banks.  The river empties into" +
               "Lake Lamoni on the Northwestern edge of our land";
       //use the setters in teh Location class to set the description and symbol
       loc.setDescription(river);
       loc.setSymbol("~~~");
       for(int i = 2; i < MAX_ROW; i++)
       {
           c = 1;
              theMap.setLocation(i, c, loc);
       }
       
       ////create a string for the grazing pasture location
       String pasture = "\nThese pastures are for the kings cattle to graze";
       //set the grazing pasture location with a hint
       loc.setDescription(pasture);
       loc.setSymbol("///");
       theMap.setLocation(4, 3, loc);
       
       
       //create a string for the farming fields location
       String farmland = "\nYou are in the fertile valley of the Land of Aaron." +
               "In the spring, this low farmland is easily irrigated and the rich" +
               "soil is once again ready for planting golden wheat - the staff of" +
               "life.";
       //set the farmland location with a hint
       loc.setDescription(farmland + "\nOne bushel of wheat seed with plant two acres of wheat");
       loc.setSymbol("!!!");
       for (int i = 0; i <= 1; i++)
       {
           for (int col = 1; col <= MAX_COL; col++)
            {
                theMap.setLocation(i, col, loc);
            }
       }
       
       //create a string for the orchards location
       String orchards = "\nThe orchards are filled with apples, peaches and oranges.";
       //set the orchards location with a hint
       loc.setDescription(orchards);
       loc.setSymbol("@@@");
       theMap.setLocation(3, 0, loc);
       theMap.setLocation(4, 0, loc);
       
       //create a string for the vinyards location
       String vineyards = "\nThe vinyards grow grapes for the kings winery.";
       //set the vinyards location with a hint
       loc.setDescription(vineyards);
       loc.setSymbol("***");
       theMap.setLocation(3, 2, loc);
       
       //create a string for the city square location
       String CitySquare = "\nThe city square is the heart of the city." +
               "The buildings are made of limestone that glisten in the setting" +
               "sun.  This is location of all govenment buildings.";
       //set the city square location with a hint
       loc.setDescription(CitySquare);
       loc.setSymbol("$$$");
       theMap.setLocation(2, 3, loc);
       
       //create a string for the city suburbs location
       String suburbs = "\nThe suburbs are the location for the homes of all" +
               "the citizens of the City of Aaron.";
       //set the city suburbs location with a hint
       loc.setDescription(suburbs);
       loc.setSymbol("&&&");
       theMap.setLocation(2, 4, loc);
       
       //create a string for the granery location
       String granery = "\nYou are in the granery - where all of the wheat is" +
               "stored.  This place is highly guarded.  The only real danger is" +
               "RATS!  Be aware that rats can eat your store of wheat.";
       //set the granery location with a hint
       loc.setDescription(granery + "\n20 bushels of" +
       "wheat is required to keep 1 citizen alive for the full year");
       loc.setSymbol("###");
       theMap.setLocation(3, 3, loc);
       
       //create a string for the armory location
       String armory = "\nThe armory is where your city guard bunks for the" +
               "night and where they keep their weapons.";
       //set the armory location with a hint
       loc.setDescription(armory);
       loc.setSymbol(" -->");
       theMap.setLocation(3, 4, loc);
             
       //create a string for Lake Lamoni location
       String LakeLamoni = "\nLake Lamoni is a serene setting.  This is a place" +
               "to come and enjoy the beauty of God's creations.  Families visit" +
               "to enjoy some time together and also to fish.";
       //set the Lake Lamoni location with a hint
       loc.setDescription(LakeLamoni);
       loc.setSymbol("???");
       for(int l = 0 ; l <= 1; l++)
       {
           c = 0;
              theMap.setLocation(l, c, loc);
       }
       
       //create a string for the Tower Hill location
       String TowerHill = "\nTower Hill lookout is next to Lake Lamoni.  Not only" +
               "can it stand as a lookout over the lake, but also of the king's" +
               "orchards and vineyards.  Neighboring cities have been known to" +
               "try to infiltrate the city using the orchard as cover.";
       //set the Tower Hill location with a hint
       loc.setDescription(TowerHill);
       loc.setSymbol("!^!");
       theMap.setLocation(2, 0, loc);
         
       theGame.setTheMap(theMap);
    }

    public static void displayLists(){
    
}
    
}
