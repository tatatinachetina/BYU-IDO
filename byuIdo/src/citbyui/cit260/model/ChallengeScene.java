/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.model;

/**
 *
 * @author Jake
 */
public class ChallengeScene  {
    private long noCorrect;
    private long requiredCorrect;
    
    public ChallengeScene(){
    }

    public long getNoCorrect() {
        return noCorrect;
    }

    public void setNoCorrect(long noCorrect) {
        this.noCorrect = noCorrect;
    }

    public long getRequiredCorrect() {
        return requiredCorrect;
    }

    public void setRequiredCorrect(long requiredCorrect) {
        this.requiredCorrect = requiredCorrect;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.noCorrect ^ (this.noCorrect >>> 32));
        hash = 79 * hash + (int) (this.requiredCorrect ^ (this.requiredCorrect >>> 32));
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
        final ChallengeScene other = (ChallengeScene) obj;
        if (this.noCorrect != other.noCorrect) {
            return false;
        }
        if (this.requiredCorrect != other.requiredCorrect) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ChallengeScene{" + "noCorrect=" + noCorrect + ", requiredCorrect=" + requiredCorrect + '}';
    }
   
}
