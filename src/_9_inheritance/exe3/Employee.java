package _9_inheritance.exe3;

public class Employee {
    ////////////////////////////////////// Members
    private String m_name;
    private int m_id;
    private int m_basicSalary;

    //////////////////////////////////////  Constructors
    public Employee() {
        m_name = "";
        m_id = 0;
        m_basicSalary = 0;
    }

    public Employee(String name, int id, int basicSalary) {
        m_name = name;
        m_id = id;
        m_basicSalary = basicSalary;
    }

    ///////////////////////////////////// Getters & Setters
    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        m_name = name;
    }

    public int getBasicSalary() {
        return m_basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        m_basicSalary = basicSalary;
    }

    public int getId() {
        return m_id;
    }

    /////////////////////////////////// Methods

    public int calcMonthlySalary() {
        return m_basicSalary;
    }

    public void WhoAmI() {
        System.out.println("I�m an employee");
    }
}
