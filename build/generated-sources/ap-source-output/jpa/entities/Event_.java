package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Sport;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-06T20:53:32")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, Date> dateEvent;
    public static volatile SingularAttribute<Event, Sport> sportId;
    public static volatile SingularAttribute<Event, Integer> amountofplaces;
    public static volatile SingularAttribute<Event, Integer> amountOfPlaces;
    public static volatile SingularAttribute<Event, Long> id;
    public static volatile SingularAttribute<Event, String> place;
    public static volatile SingularAttribute<Event, Date> dateevent;
    public static volatile SingularAttribute<Event, Sport> sport;

}