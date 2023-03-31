/** EmployeeApp.java
 *  Creates and displays 3 Employee objects
 *  COSC-2436.902
 *  1/25/2023
 *  @author Joshua Williams
 */

public class EmployeeApp {
    public static void main(String[] args) throws Exception
    {
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");

        Employee emp2 = new Employee("Mark Jones", 39119);
        emp2.setDepartment("IT");
        emp2.setPosition("Programmer");

        Employee emp3 = new Employee();
        emp3.setName("Joy Rogers");
        emp3.setID(81774);
        emp3.setDepartment("Manufacturing");
        emp3.setPosition("Engineer");

        System.out.println(emp1.getName()+"\t"+emp1.getID()+"\t"+emp1.getDepartment()+"\t"+emp1.getPosition());
        System.out.println(emp2.getName()+"\t"+emp2.getID()+"\t"+emp2.getDepartment()+"\t\t"+emp2.getPosition());
        System.out.println(emp3.getName()+"\t"+emp3.getID()+"\t"+emp3.getDepartment()+"\t"+emp3.getPosition());
    }
}
