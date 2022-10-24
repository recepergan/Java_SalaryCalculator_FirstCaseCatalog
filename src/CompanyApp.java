import java.util.Scanner;

public class CompanyApp {

    static Scanner sc = new Scanner(System.in);

    private static Manager getManager()
    {
        Manager m = new Manager();
        m.setM_fullName("Veli AK");
        m.setM_workHours(50);
        m.setM_hireYear(1995);
        System.out.println("Lütfen Manager pozisyonu için 1000 ve üzeri maaş giriniz ");
        double salary = sc.nextDouble();
        m.setM_salary(salary);

        return m;
    }

    private static Worker getWorker()
    {
        Worker w = new Worker();
        w.setM_fullName("Ali AK");
        w.setM_workHours(60);
        w.setM_hireYear(1990);
        System.out.println("Lütfen Worker pozisyonu için 1000 ve altında maaş giriniz ");
        double salary = sc.nextDouble();
        w.setM_salary(salary);

        return w;
    }

    public static void main(String[] args) {

        HumanResources humanResources = new HumanResources();


        System.out.println("Lütfen Manager pozisyonu için 1 Worker pozisyonu için 0 tuşlayınız : ");
        int val = sc.nextInt();
        if(val == 1) {
            Manager m = getManager();
            humanResources.payInsurance(m);
        }else {
            Worker w = getWorker();
            humanResources.payInsurance(w);
        }

    }
}

