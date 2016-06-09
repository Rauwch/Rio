package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Event;
import jpa.entities.Person;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-08T17:40:45")
@StaticMetamodel(Sport.class)
public class Sport_ { 

    public static volatile ListAttribute<Sport, Person> personsPractisingSport;
    public static volatile SingularAttribute<Sport, String> name;
    public static volatile SingularAttribute<Sport, String> description;
    public static volatile SingularAttribute<Sport, Long> id;
    public static volatile SingularAttribute<Sport, Event> event;

}