public class Manager extends Employee{

    private double m_salary;
    private double m_bonus;
    private static final double m_nowYear = 2021;

    public Manager() {
    }

    public Manager(String m_fullName, double m_salary, double m_workHours, double m_hireYear) {
        super(m_fullName, m_salary, m_workHours, m_hireYear);
    }

    @Override
    public double getM_salary() {
        return m_salary;
    }

    @Override
    public void setM_salary(double m_salary) {
        this.m_salary = m_salary;
    }

    @Override
    public double calculateTaxPayment() {
        return m_salary * 0.03;
    }

    public double getM_bonus() {
        return m_bonus;
    }

    public void setM_bonus(double m_bonus) {
        this.m_bonus = m_bonus;
    }

    @Override
    public double calculateBonus() {
        if(getM_workHours() > 40) {
            return (getM_workHours()-40) * 30;
        }
        return 0;
    }

    @Override
    public double calculateRaiseSalary() {
        double difYear = m_nowYear - getM_hireYear();

        if (difYear < 10) {
            return getM_salary() * 0.05;
        } else if (9 < difYear && difYear < 20) {
            return getM_salary() * 0.1;
        } else {
            return getM_salary() * 0.15;
        }

    }
}
