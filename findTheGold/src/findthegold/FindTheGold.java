/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthegold;

import byui.cit260.findTheGold.model.TeamMember;
import byui.cit260.findTheGold.model.Player;
import byui.cit260.findTheGold.model.Location;
import byui.cit260.findTheGold.model.CropData;
import byui.cit260.findTheGold.model.ListItem;
import java.util.HashSet;

/**
 *
 * @author kjpar and Jeff
 */
public class FindTheGold {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        Location firstLocation = new Location();
        CropData firstData = new CropData();
        ListItem secondData = new ListItem();
        ListItem firstItem = new ListItem();
        
        playerOne.setPlayerName("Wilma Flintsone");
        firstLocation.setDescription("Zarahemla");
        firstLocation.setSymbol("mark");
        firstData.setYear(1);
        firstData.setPopulation(100);
        firstData.setAcresOwned(1000);
        firstData.setCropYield(3);
        firstData.setWheatInStore(3000);
        firstData.setNumberWhoDied(2);
        firstData.setNewPeople(5);
        firstData.setHarvest(45);
        firstData.setHarvestAfterOffering(2700);
        firstData.setOffering(300);
        firstData.setOfferingBushels(24);
        firstData.setPeopleFed(4);
        firstData.setAcresPlanted(4);
        firstData.setNumStarved(5);
        firstData.setEatenByRats(0);
        firstData.setWheatForPeople(3);
        secondData.setNumber(1);
        firstItem.setName("Name");
        
              
       
        System.out.println(playerOne.toString());
        
        String playerOneName = playerOne.getPlayerName();
        
        System.out.println("Name = " + playerOneName);
        
        TeamMember.Jeff.getName();
        TeamMember.Jeff.getTitle();
        TeamMember.Kristen.getName();
        TeamMember.Kristen.getTitle();
        
        System.out.print(TeamMember.Kristen.toString());
        System.out.print(TeamMember.Jeff.toString());
        
        System.out.println(firstLocation.toString());
        System.out.println(firstData.toString());
        System.out.println(firstItem.toString());
     
}
    
}