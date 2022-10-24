public class HumanResources {

    public void payInsurance(Employee employee) {

        System.out.printf("Adı : %s%n", employee.getM_fullName());
        System.out.printf("Maaşı : %f%n", employee.getM_salary());
        System.out.printf("Çalışma Saati : %f%n", employee.getM_workHours());
        System.out.printf("Başlangıç Yılı : %f%n",employee.getM_hireYear());
        System.out.printf("Vergi : %f%n",employee.calculateTaxPayment());
        System.out.printf("Bonus : %f%n",employee.calculateBonus());
        System.out.printf("Maaş Artışı : %f%n",employee.calculateRaiseSalary());
        System.out.printf("Vergi ve Bonuslar ile birlikte maaş : %f%n",employee.getM_salary() + employee.calculateBonus() - employee.calculateTaxPayment());
        System.out.printf("Toplam Maaş : %f%n",employee.getM_salary() + employee.calculateBonus() - employee.calculateTaxPayment() + employee.calculateRaiseSalary());




    }
}


