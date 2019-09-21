import java.util.Scanner;

class Employee
{
    int income;
    int travel;
    int daily;
    int house;
    int net;
    int annual;
    int grossM;
    int grossA;
    int it;
    int taxOn;

    public void getSalary()
    {
        System.out.print("Enter the employee's salary = ");
        Scanner scan = new Scanner(System.in);
        income = scan.nextInt();
    }

    public void showSalary()
    {
        travel = income * 10/100;
        daily = income * 5/100;
        house = income * 10/100;
        net = income + travel + daily + house;
        annual = net * 12;
        


        System.out.println("Income = "+income);
        System.out.println("Travel allowance (10%) = "+travel);
        System.out.println("Daily allowance (5%) = "+daily);
        System.out.println("Housing & renting allowance (10%) = "+house);
        System.out.println("Net monthly salary = "+net);
        System.out.println("Net annual salary = "+annual);
        
       
    }

    public void tax()
    {
        
        if(annual <= 250000) 
        {
            it = 0;
            System.out.println("Tax not applicable for salary less than 250000");
        }
        if(annual > 250001 && annual <= 300000)
        {
            
            taxOn = annual - 250000;
            it = taxOn * 5/100;
            System.out.println("5% Tax on annual income = "+it);
        }
        if(annual > 300001 && annual <= 500000)
        {
            taxOn = annual - 250000;
            it = 2500 + (taxOn * 10/100);
            System.out.println("10% Tax on annual income = "+it);
        }
        if(annual > 500001 && annual <= 1000000)
        {
            taxOn = annual - 250000;
            it = 22500 + (taxOn * 15/100);
            System.out.println("15% Tax on annual income = "+it);
        }
        if(annual > 1000001 && annual <= 5000000)
        {
            taxOn = annual - 250000;
            it = 97500 + (taxOn * 20/100);
            System.out.println("20% Tax on annual income = "+it);
        }
        if(annual > 5000001)
        {
            taxOn = annual - 250000;
            it = 897500 + (taxOn * 30/100);
            System.out.println("30% Tax on annual income = "+it);
        }
        
        grossA = annual - it;
        grossM = grossA/12;
    }

    public void grossSalary()
    {
        System.out.println("Gross monthly salary = "+grossM);
        System.out.println("Gross annual salary = "+grossA);
    }

}

public class Salary
{
    public static void main(String args[])
    {
        Employee One = new Employee();


        One.getSalary();
        System.out.println("\n\nNet Salary:\n");
        One.showSalary();
        System.out.println("\n\nIncome Tax:\n");
        One.tax();
        System.out.println("\n\nGross Salary:\n");
        One.grossSalary();
    }
}