/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import ejb.CounterBeanLocal;
import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("count")
@ManagedBean
@SessionScoped
public class Count implements Serializable {
    @EJB
    private CounterBeanLocal counterBean;

    private int hitCount;

    public Count() {
        this.hitCount = 0;
    }

    public int getHitCount() {
        hitCount = counterBean.getHits();
        return hitCount;
    }
    public void setHitCount(int newHits) {
        this.hitCount = newHits;
    }
}