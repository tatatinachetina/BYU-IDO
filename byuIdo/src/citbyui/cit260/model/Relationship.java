/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jake
 */
public class Relationship implements Serializable{
    
    private long relationshipScore;
    private String status;
    private Actor actorOne;
    private Actor actorTwo;

    public Relationship() {
    }

    public long getRelationshipScore() {
        return relationshipScore;
    }

    public void setRelationshipScore(long relationshipScore) {
        this.relationshipScore = relationshipScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.relationshipScore ^ (this.relationshipScore >>> 32));
        hash = 97 * hash + Objects.hashCode(this.status);
        hash = 97 * hash + Objects.hashCode(this.actor);
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
        final Relationship other = (Relationship) obj;
        if (this.relationshipScore != other.relationshipScore) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (this.actor != other.actor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Relationship{" + "relationshipScore=" + relationshipScore + ", status=" + status + ", actor=" + actor + '}';
    }

   
    
}
