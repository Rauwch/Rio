/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.Event;

/**
 *
 * @author Anton
 */
@Stateless
public class EventFacade extends AbstractFacade<Event> {
    
   
   // TimerService timerService;
    
    @PersistenceContext(unitName = "RioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EventFacade() {
        super(Event.class);
    }
    
    @Override
    public void create(Event event){
        em.persist(event);
        /*ScheduleExpression eventDate = new ScheduleExpression().dayOfMonth(event.getDateEvent().getDay());
        
        timerService.createCalendarTimer(eventDate, new TimerConfig(event,true));
        
    }
    
    @Timeout
    public void eventHappening(Event event){
        System.out.println("Event Happening " + event.getDateEvent() + " in " + event.getPlace());*/
    }
    
}
