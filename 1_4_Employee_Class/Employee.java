//1.4 Employee Class
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    //Constructor
	public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.firstName+" "+this.lastName;
    }    
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    public int raiseSalary(int percent){
        return this.salary += (this.salary/100)*percent;
    }
    public String toString(){
        return "Employee: [id= "+ this.id + ", name= "+ getName() +", salary= "+ this.salary +"]";
	}
}