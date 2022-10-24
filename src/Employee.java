public abstract class Employee {

     private String m_fullName;
     private double m_salary;
     private double m_workHours;
     private double m_hireYear;

     //constructor


    public Employee() {
    }

    public Employee(String m_fullName, double m_salary, double m_workHours, double m_hireYear) {
        this.m_fullName = m_fullName;
        this.m_salary = m_salary;
        this.m_workHours = m_workHours;
        this.m_hireYear = m_hireYear;
    }

    //getter-setter
    public String getM_fullName() {
        return m_fullName;
    }

    public void setM_fullName(String m_fullName) {
        this.m_fullName = m_fullName;
    }

    public double getM_salary() {
        return m_salary;
    }

    public void setM_salary(double m_salary) {
        this.m_salary = m_salary;
    }

    public double getM_workHours() {
        return m_workHours;
    }

    public void setM_workHours(double m_workHours) {
        this.m_workHours = m_workHours;
    }

    public double getM_hireYear() {
        return m_hireYear;
    }

    public void setM_hireYear(double m_hireYear) {
        this.m_hireYear = m_hireYear;
    }

    //toString

      public abstract double calculateTaxPayment();

      public abstract double calculateBonus();

      public abstract double calculateRaiseSalary();
}
