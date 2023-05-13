/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Limi
 */
public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        persons = new ArrayList<Person>();
    }
    public void add(Person person){
        persons.add(person);
    }
    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return persons;
    }
    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortestPerson=persons.get(0);
        for(Person person : persons){
            if(person.getHeight() < shortestPerson.getHeight()){
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }
    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
        Person personRemoved = this.shortest();
        persons.remove(personRemoved);
        return personRemoved;
    }
    
}
