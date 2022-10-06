import gherkin.formatter.model.ScenarioOutline;

import java.util.Scanner;

abstract class Abstraction {
    double salary=100000;
    String name;
    Double amount;
    int pinCode;
    public abstract void bank();
    public abstract void  withdraw();
}
class abc extends Abstraction {
    public void bank() {

        Scanner k = new Scanner(System.in);
        System.out.println("enter user name");
        name = k.next();
        System.out.println("enter pin");
        pinCode = k.nextInt();
        if (pinCode == 123) {
            System.out.println("user enter amount ");
            amount = k.nextDouble();
        } else {
            System.out.println("wrong pin code");
        }

        if (amount < salary) {

            salary=salary+amount;

            System.out.println("money deposit"+" " +salary);

        }
    }
    public void withdraw() {

        Scanner k = new Scanner(System.in);
        System.out.println("enter user name");
        name = k.next();
        System.out.println("enter pin");
        pinCode = k.nextInt();
        if (pinCode == 123) {
            System.out.println("user enter amount needs to withdraw ");
            amount = k.nextDouble();
        } else {
            System.out.println("wrong pin code");
        }

        if (amount < salary) {

            salary=salary-amount;

            System.out.println("money withdraw"+" " +salary);

        }

    }
}
class def
{
    public static void main(String[] args) {

        System.out.println(" enter 1 for deposit");
        System.out.println("enter 2 for withdraw");
        Scanner k = new Scanner(System.in);
        int input=k.nextInt();
        abc j=new abc();
        switch (input)
        {
            case 1:
                j.bank();
                break;
            case 2:
                j.withdraw();
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}



