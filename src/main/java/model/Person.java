package model;

import java.sql.ResultSet;

public class Person {
    private int id;
    private String name;

    public Person(){}

    public Person(ResultSet rs){
        try{
            this.id = rs.getInt(1);
            this.name = rs.getString(2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong and the event was not created");
        }
    }
}
