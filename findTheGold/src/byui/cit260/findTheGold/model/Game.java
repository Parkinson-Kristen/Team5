//The City of Aaron Game
//The driver file, contains the main() method
//Author: Team 5 - Kristen 
//Last Modified: Feb 2018
//---------------------------
package byui.cit260.findTheGold.model;

import java.io.Serializable;
import java.util.*;

public class Game implements Serializable {
    
    // class instance variable
    private Map theMap;
    private Player thePlayer;
    private CropData cropData;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> provision;
    private CropData theCrops = null;
    private String name;
    private TeamMember[] team;
    
    public Game() {
    }

    public Map getTheMap() {
        return theMap;
    }
    
    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }
    
    public Player getPlayer() {
        return thePlayer;
    }
    
    public void setPlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    public TeamMember[] getTeam() {
        return team;
    }

    public void setTeam(TeamMember[] team) {
        this.team = team;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public ArrayList<ListItem> getProvision() {
        return provision;
    }

    public void setProvision(ArrayList<ListItem> provision) {
        this.provision = provision;
    }
      //the getCrops() method
    //Purpose: get a reference to the crop object
    //Parameters: none
    //Returns: a reference to a crop object
    public CropData getCrop(){
        return theCrops;
    }
    
    //the setCrops() method
    //Purpose: store a reference to a crop object
    //Parameters: a reference to a crop object
    //Returns: none
    public void setCrop(CropData _cropRef){
        theCrops = _cropRef;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.theMap);
        hash = 97 * hash + Objects.hashCode(this.thePlayer);
        hash = 97 * hash + Objects.hashCode(this.cropData);
        hash = 97 * hash + Arrays.deepHashCode(this.team);
        hash = 97 * hash + Objects.hashCode(this.animals);
        hash = 97 * hash + Objects.hashCode(this.tools);
        hash = 97 * hash + Objects.hashCode(this.provision);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.theMap, other.theMap)) {
            return false;
        }
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        if (!Objects.equals(this.cropData, other.cropData)) {
            return false;
        }
        if (!Arrays.deepEquals(this.team, other.team)) {
            return false;
        }
        if (!Objects.equals(this.animals, other.animals)) {
            return false;
        }
        if (!Objects.equals(this.tools, other.tools)) {
            return false;
        }
        if (!Objects.equals(this.provision, other.provision)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "theMap=" + theMap + ", thePlayer=" + thePlayer + ", cropData=" + cropData + ", team=" + team + ", animals=" + animals + ", tools=" + tools + ", provision=" + provision + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
  
    
    
}
