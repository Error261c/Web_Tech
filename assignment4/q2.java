class Employee{
    String name;
    int joiningYear;
    int salary;
    String address;

    Employee(String name, int joiningYear, int salary, String address){
        this.name=name;
        this.joiningYear=joiningYear;
        this.salary=salary;
        this.address=address;
    }

    void printData(){
        System.out.println(this.name+"      "+this.joiningYear+"      "+this.salary+"     "+this.address);
    }
}

public class q2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Adhyan", 2021, 200000, "Jammu");
        Employee e2 = new Employee("Gautam", 2020, 150000, "Chandigarh");
        Employee e3 = new Employee("Jivesh", 2019, 00000, "Patiala Pind");
        Employee e4 = new Employee("John", 2019, 140000, "Mumbai");

        System.out.println("Name    Year of Joining     Salary      Address");
        e1.printData();
        e2.printData();
        e3.printData();
        e4.printData();   
    }   
}