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
import java.util.HashSet;

/**
 *
 * @author kjpar
 */
public class FindTheGold {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        Location firstLocation = new Location();
        CropData firstData = new CropData();
        
        playerOne.setName("Wilma Flintsone");
        firstLocation.setDescription("Zarahemla");
        firstLocation.setSymbol("mark");
        firstData.setYear(32);
        firstData.setPopulation(344);
        firstData.setAcresOwned(34);
        firstData.setCropYield(45);
        firstData.setWheatInStore(45);
        firstData.setNumberWhoDied(2);
        firstData.setNewPeople(6);
        firstData.setHarvest(45);
        firstData.setHarvestAfterOffering(98);
        firstData.setOffering(65);
        firstData.setOfferingBushels(24);
        firstData.setPeopleFed(4);
        firstData.setAcresPlanted(4);
        firstData.setNumStarved(5);
        firstData.setEatenByRats(2);
        firstData.setWheatForPeople(3);
       
        System.out.println(playerOne.toString());
        
        String playerOneName = playerOne.getName();
        
        System.out.println("Name = " + playerOneName);
        
        TeamMember.Jeff.getName();
        TeamMember.Jeff.getTitle();
        TeamMember.Kristen.getName();
        TeamMember.Kristen.getTitle();
        
        System.out.print(TeamMember.Kristen.toString());
        System.out.print(TeamMember.Jeff.toString());
        
        System.out.println(firstLocation.toString());
        System.out.println(firstData.toString());    
    }
}