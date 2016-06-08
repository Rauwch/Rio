package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Sport;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-08T14:26:26")
@StaticMetamodel(Person.class)
public abstract class Person_ { 

    public static volatile ListAttribute<Person, Sport> practisesTheseSports;
    public static volatile SingularAttribute<Person, String> country;
    public static volatile SingularAttribute<Person, String> gender;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile SingularAttribute<Person, Long> id;
    public static volatile SingularAttribute<Person, Integer> age;

}