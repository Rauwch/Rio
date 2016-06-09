package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Price;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-08T17:40:45")
@StaticMetamodel(Athlete.class)
public class Athlete_ extends Person_ {

    public static volatile SingularAttribute<Athlete, Double> weight;
    public static volatile ListAttribute<Athlete, Price> prices;
    public static volatile SingularAttribute<Athlete, Double> height;

}