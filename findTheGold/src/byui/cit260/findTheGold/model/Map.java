/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.findTheGold.model;

import java.io.Serializable;
import java.util.Arrays;

public class Map implements Serializable{
    
    // class instance variable
    private int rowCount; //stores the number of rows
    private int colCount; //stores the number of columns
    private Location locations[][]; //a reference to a 2-dimensional array of
                                    //Location objects

    //default Map constructor
    //Purpose: Set data members to default values
    //Parameters: none:
    //Returns: none
    public Map() {};
  
    //parameterized Map constructor
    //purpose: Sets row and column values
    //  and creates an array of Location objects
    //Parameters: row count and column count
    //Returns: none
    public Map(int _rows, int _cols){
        
        rowCount = _rows;
        colCount = _cols;
        
        // create the array of location objects
        locations = new Location[_rows][_cols];
    }
    
    //The getLocation method
    //Purpose: returns the location object at the given row and column
    //Parameters: a row and column
    //Returns: a Location object
    public Location getLocation(int row, int col) {
        return locations[row][col];
    }
    
    //The setLocation method
    //Purpose: stores a location object at the row and column
    //Parameters: a row and colum, and a reference to a location object
    //Returns: void
    public void setLocation(int row, int col, Location _location) {
        locations[row][col] = _location;
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
