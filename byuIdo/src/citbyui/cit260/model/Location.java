/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.model;

/**
 *
 * @author tanya
 */
public class Location {

    private String description;
    private int row;
    private int column;
    private String visited;
    private char displaySimbol;
    private String blocked;

    public Location(String description, int row, int column, String visited,
            char displaySimbol, String blocked) {
        this.description = description;
        this.row = row;
        this.column = column;
        this.visited = visited;
        this.displaySimbol = displaySimbol;
        this.blocked = blocked;
    }

}
