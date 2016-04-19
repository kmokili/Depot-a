package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta lol
 */
@XmlRootElement
public class Person {
    private String name;

    public Person() {
    }

	/* A person's name */
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

	/* Change the name */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}