import java.util.Scanner;

public class MyCalculator {



    public static void main(String[] args) {



        MyCalculator myCalc = new MyCalculator();
        Scanner scan= new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("*****My Calculator****");
        System.out.println("**************************");

        System.out.println("Menu:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("0.Exit");



        System.out.println("Enter 2 numbers");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Enter no 1-5 to perform the operation or 0 to exit");

        int userinput= scan.nextInt();
        switch(userinput){

            case 1:
                double sum=myCalc.sum(n1, n2);
                System.out.println(sum);
break;
            case 2:
               myCalc.sub(n1,n2);
               break; case 3:
                myCalc.mul(n1,n2);
                break;
            case 4:
                myCalc.div(n1,n2);
                break;
            case 5:
                myCalc.mod(n1,n2);
                break;
            case 0:
                System.out.println("Thanks for you time.");
break;
            default:
                System.out.println("Invalid output.");
                break;
        }

    }

    public double sum(double n1, double n2){

        return  n1+n2;

    }
    public void sub(double n1 , double n2){
        double sub = n1-n2;
        System.out.println("Result:"+sub);
    }

    public void mul(double n1 , double n2){
        double mul = n1*n2;
        System.out.println("Result:"+mul);
    }
    public void div(double n1 , double n2){
        double div = n1/n2;
        System.out.println("Result:"+div);
    }
    public void mod(double n1 , double n2){
        double mod = n1%n2;
        System.out.println("Result:"+mod);
    }

}
