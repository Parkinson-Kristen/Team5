//CropData class - part of the model layer
//Object of this class is to manage the crop data
//Author: Team 5 - Kristen 
//Last Modified: March 10 2018
//---------------------------
package byui.cit260.findTheGold.model;

import java.io.Serializable;

public class CropData implements Serializable{
    
    // class instance variable
    private int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int harvestAfterOffering;
    private int offering;
    private int offeringBushels;
    private int peopleFed;
    private int acresPlanted;
    private int numStarved;
    private int eatenByRats;
    private int wheatForPeople;

    public CropData() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

     public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getCropYield() {
        return cropYield;
    }

     public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }

    public int getWheatInStore() {
        return wheatInStore;
    }

    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public int getHarvest() {
        return harvest;
    }

     public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public int getHarvestAfterOffering() {
        return harvestAfterOffering;
    }

    public void setHarvestAfterOffering(int harvestAfterOffering) {
        this.harvestAfterOffering = harvestAfterOffering;
    }

    public int getOffering() {
        return offering;
    }

    public void setOffering(int offering) {
        this.offering = offering;
    }

    public int getOfferingBushels() {
        return offeringBushels;
    }

     public void setOfferingBushels(int offeringBushels) {
        this.offeringBushels = offeringBushels;
    }

    public int getPeopleFed() {
        return peopleFed;
    }

    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

     public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    public int getNumStarved() {
        return numStarved;
    }

    public void setNumStarved(int numStarved) {
        this.numStarved = numStarved;
    }

    public int getEatenByRats() {
        return eatenByRats;
    }

    public void setEatenByRats(int eatenByRats) {
        this.eatenByRats = eatenByRats;
    }

    public int getWheatForPeople() {
        return wheatForPeople;
    }
    
    public void setWheatForPeople(int wheatForPeople) {
        this.wheatForPeople = wheatForPeople;
    } 


    @Override
    public String toString() {
        return "CropData{" + "year=" + year + ", population=" + population + ", acresOwned=" + acresOwned + ", cropYield=" + cropYield + ", wheatInStore=" + wheatInStore + ", numberWhoDied=" + numberWhoDied + ", newPeople=" + newPeople + ", harvest=" + harvest + ", harvestAfterOffering=" + harvestAfterOffering + ", offering=" + offering + ", offeringBushels=" + offeringBushels + ", peopleFed=" + peopleFed + ", acresPlanted=" + acresPlanted + ", numStarved=" + numStarved + ", eatenByRats=" + eatenByRats + ", wheatForPeople=" + wheatForPeople + '}';
    }   
}
