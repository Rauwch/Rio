/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.annotation.ManagedBean;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Anton
 */
@Named(value = "growlView")
@Dependent
@ManagedBean
@Stateless
public class GrowlView {

    public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        System.out.println("growling");
        context.addMessage(null, new FacesMessage("Successful", "Your message: "));
        context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
    }

    public void addEvent() {
        FacesContext context = FacesContext.getCurrentInstance();
        System.out.println("growling");
        context.addMessage(null, new FacesMessage("Successful", "Event is added to your cart"));

    }
        public void deleteEvent() {
        FacesContext context = FacesContext.getCurrentInstance();
        System.out.println("growling");
        context.addMessage(null, new FacesMessage("Successful", "Event is deleted from your cart"));

    }
}
