/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.ConcurrencyManagement;
import static javax.ejb.ConcurrencyManagementType.CONTAINER;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author Anton
 */
@Singleton
@Startup
@ConcurrencyManagement(CONTAINER)
public class CounterBean implements CounterBeanLocal {
   
    private int hits = 1;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int getHits() {
        return hits++;
    }
    
}
