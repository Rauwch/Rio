/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import jpa.entities.Event;

/**
 *
 * @author Anton
 */
@Named("shoppingCart")
@Stateful
@SessionScoped
@StatefulTimeout( value = 5, unit = TimeUnit.MINUTES)
public class ShoppingCartEJB {

    private final List<Event> cartItems = new ArrayList<>();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void addEvent(Event event) {
        System.out.println("Event added to cart " + cartItems.size());
        if (!cartItems.contains(event)) {
            cartItems.add(event);
        }
        System.out.println("Event added to cart " + cartItems.size());
    }

    public void removeEvent(Event event) {
        if (cartItems.contains(event)) {
            cartItems.remove(event);
        }
    }

    public Integer getNumberOfEvents() {
        if (cartItems.isEmpty()) {
            System.out.println("amount of events " + cartItems.size());
            return 0;
        } else {
            System.out.println("amount of events" + cartItems.size());
            return cartItems.size();
        }
    }

    public List<Event> getCartItems() {
        return cartItems;
    }
    

    public void empty() {
        cartItems.clear();
    }

    public void checkout() {
        cartItems.stream().forEach((Event event) -> {
            event.takeSeat();
        });
        cartItems.clear();
    }

}
