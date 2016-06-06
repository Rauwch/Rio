package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Athlete;
import jpa.entities.Medal;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-06T20:53:32")
@StaticMetamodel(Price.class)
public class Price_ { 

    public static volatile SingularAttribute<Price, Athlete> athlete;
    public static volatile SingularAttribute<Price, Medal> medal;
    public static volatile SingularAttribute<Price, Long> id;
    public static volatile SingularAttribute<Price, Integer> yearOfMedal;

}