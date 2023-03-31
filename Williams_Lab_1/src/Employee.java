/** Employee.java
 *  The Employee object creates an employee by defining the name, id number, department, and position of the employee to be created.
 *  COSC-2436.902
 *  1/25/2023
 *  @author Joshua Williams
 */

public class Employee
{
    int idNumber;       // The ID number of the employee.
    String name;        // The name of the employee.
    String department;  // The department the employee works for.
    String position;    // The position the employee holds.

    /* Constructor, creates employee with all 4 fields defined.
     * @param empName the name of the employee.
     * @param id the ID number of the employee.
     * @param dept the department the employee works for.
     * @param pos the position the employee holds.
     */
    public Employee(String empName, int id, String dept, String pos)
    {
        idNumber = id;
        name = empName;
        department = dept;
        position = pos;
    }
    /* Constructor, creates employee with only name and id fields defined.
     * @param empName the name of the employee.
     * @param id the ID number of the employee.
     */
    public Employee(String empName, int id)
    {
        idNumber = id;
        name = empName;
        department = "";
        position = "";
    }
    /* Default Constructor.
     */
    public Employee()
    {
        idNumber = 0;
        name = "";
        department = "";
        position = "";
    }

    /* Assigns a given ID number to an employee.
     * @param id the ID number to assign.
     */
    public void setID(int id)
    {
        idNumber = id;
    }
    /* Assigns a given name to an employee.
     * @param empName the name to assign.
     */
    public void setName(String empName)
    {
        name = empName;
    }
    /* Assigns a given department to an employee.
     * @param dept the department to assign.
     */
    public void setDepartment(String dept)
    {
        department = dept;
    }
    /* Assigns a given position to an employee.
     * @param pos the position to assign.
     */
    public void setPosition(String pos)
    {
        position = pos;
    }

    /* Retrieves the ID number of the employee.
     * @return the employee's ID number.
     */
    public int getID()
    {
        return this.idNumber;
    }
    /* Retrieves the name of the employee.
     * @return the employee's name.
     */
    public String getName()
    {
        return this.name;
    }
    /* Retrieves the department that the employee works for.
     * @return the department worked for.
     */
    public String getDepartment()
    {
        return this.department;
    }
    /* Retrieves the position that the employee holds.
     * @return the position held.
     */
    public String getPosition()
    {
        return this.position;
    }
}
