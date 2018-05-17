/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.model;

//serializable interface
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author tanya
 */
public class Map implements Serializable {
    
    //class instance variables
    private String Description;
    private int rowCount;
    private int columnCount;
    
    //Create the default constructor method
    //Do not select any of the attribute variable check boxes 
    //when generating the default constructor
    public Map() {
    }
    
    
    //create "getter" and "setter" methods for each of the attribute variable
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    // implement the toString(),equals(), and hashCode() methods
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.Description);
        hash = 71 * hash + this.rowCount;
        hash = 71 * hash + this.columnCount;
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
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        return true;
    }
    
    //

    @Override
    public String toString() {
        return "Map{" + "Description=" + Description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    
}
