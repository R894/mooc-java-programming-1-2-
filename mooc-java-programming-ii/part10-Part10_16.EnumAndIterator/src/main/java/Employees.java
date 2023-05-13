
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    ArrayList<Person> employeeList;
    public Employees(){
        employeeList = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        employeeList.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(x -> employeeList.add(x));
    }
    public void print(){
        Iterator<Person> list = employeeList.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
    }
    public void print(Education education){
        Iterator<Person> list = employeeList.iterator();
        while(list.hasNext()){
            Person p = list.next();
            if(p.getEducation() == education){
                System.out.println(p);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> list = employeeList.iterator();
        
        while(list.hasNext()){
            if(list.next().getEducation() == education){
                list.remove();
            }
        }
    
    }
}
