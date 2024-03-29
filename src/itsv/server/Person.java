package itsv.server;

import java.io.Serializable;

public class Person implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int    id;
    private String name;

    public Person() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}