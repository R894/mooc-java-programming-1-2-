
public class MainProgram {

    public static void main(String[] args) {
        Employees s = new Employees();
        Person steve = new Person("steve", Education.PHD);
        
        s.add(steve);
        s.print(Education.PHD);
    }
}
