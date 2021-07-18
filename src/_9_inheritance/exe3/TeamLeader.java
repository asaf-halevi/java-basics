package _9_inheritance.exe3;

import _7_oop.exe06.Employee;

public class TeamLeader extends Employee {
    private int m_teamSize;

    public TeamLeader(String name, int id, int basicSalary, int teamSize) {
        super(name, id, basicSalary);
        m_teamSize = teamSize;
    }

    public int calcMonthlySalary() {
        double res = super.getBasicSalary();
        res = res + (res * 5 * m_teamSize) / 100;
        return (int) res;
    }

    public void WhoAmI() {
        System.out.println("I am a team leader");
    }

    public void doTeamMeeting() {
        System.out.println("Let's start...");
    }
}
