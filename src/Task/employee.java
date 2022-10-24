package Task;

public class employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (salary >= 1000)
            tax = salary * 3 / 100;
        return tax;
    }

    public double bonus() {
        double bonus = 0;
        if (workHours > 40)
            bonus = (workHours - 40) * 30;
        return bonus;
    }

    public double raiseSalary() {
        if ((2021 - hireYear) < 10) {
            return salary * 5 / 100;
        } else if ((2021 - hireYear) < 20) {
            return salary * 10 / 100;
        } else
        return salary * 15/100;
    }

    @Override
    public String toString() {
        return "Employee Work and Salary Info\n--------------------------------"+
                "\nName= " + name +
                "\nSalary= " + salary +
                "\nWorkHours= " + workHours +
                "\nHireYear= " + hireYear +
                "\nTax= " + tax() +
                "\nBonus= " + bonus() +
                "\nRaiseSalary= " + raiseSalary() +
                "\nNetSalary= " + (salary - tax() + bonus()) +
                "\nTotalSalary= " + (salary - tax() + bonus() + raiseSalary());

    }
}
