/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheGold.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author kjpar
 */
public class Map implements Serializable{
    
    // class instance variable
    private int rowCount;
    private int colCount;
    private Location locations[][];

    public Map() {
    }
    

    public int getRowCount() {
        return rowCount;
    }

     public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    public Location[][] getLocations() {
        return locations;
    }
    
    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.rowCount;
        hash = 67 * hash + this.colCount;
        hash = 67 * hash + Arrays.deepHashCode(this.locations);
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + ", locations=" + locations + '}';
    }
    
    
    
}
