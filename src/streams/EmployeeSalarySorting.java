package streams;

import java.util.Comparator;
import java.util.List;

class Employee{
    int id;
    String emp_Name;
    long salary;

    public Employee() {
    }

    public Employee(int id, String emp_Name, long salary) {
        this.id = id;
        this.emp_Name = emp_Name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", emp_Name='" + emp_Name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeSalarySorting {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Manish",50000);
        Employee e2=new Employee(2,"Avinash",70000);
        Employee e3=new Employee(5,"Gourav",90000);
        Employee e4=new Employee(10,"Anuj",100000);
        Employee e5=new Employee(8,"Shiv",45000);
        Employee e6=new Employee(6,"Renu",90000);
        Employee e7=new Employee(4,"Sakshi",80000);
        Employee e8=new Employee(3,"Poonam",79000);
        Employee e9=new Employee(7,"Rohit",120000);
        Employee e10=new Employee(9,"Satyam",55000);

        List<Employee> employeeList=List.of(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);

//        employeeList.stream().filter(emp->emp.salary>50000).forEach(System.out::println);
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst();
     }
}
