/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.model;

import java.awt.Point;
import java.io.Serializable;

public enum Actor implements Serializable {

    John("John", "He likes sports", new Point(1,1), "NPC"),
    David("David", "He likes math", new Point(1,2), "NPC"),
    Anna("Anna", "He likes music", new Point(1,3), "NPC"),
    Gabby("Gabby", "He likes sports", new Point(1,4), "NPC");
    
    
    private String name;
    private String description;
    private Point coordinates;
    private String type;

    Actor(String name, String description, Point coordinates, String type) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", type=" + type + '}';
    }
    
    
    
    
            }
