
/**
 *
 * @author Nolubabalo Ndongeni 219319464
 */
package za.ac.cput.adp2assignment3;

import java.io.Serializable;

public class Stakeholder implements Serializable
{
    private String stHolderId;

    public Stakeholder() {
    }
    
    public Stakeholder(String stHolderId) {
        this.stHolderId = stHolderId;
    }
    
    public String getStHolderId() {
        return stHolderId;
    }

    public void setStHolderId(String stHolderId) {
        this.stHolderId = stHolderId;
    }

    @Override
    public String toString() {
       return stHolderId;
    } 
}
