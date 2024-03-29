import java.util.Scanner;


//class Assign
//{
//    public static void main(String[] args)
//    {
//        Scanner sc =new Scanner(System.in );
//        System.out.println("Enter two number");
//        boolean a=sc.hasNextDouble();
//        System.out.println("result ="+a);
//        boolean b=sc.hasNextDouble();
//        System.out.println("result ="+b);
//
//
//
//        if( a==true && b==true )
//        {
//            System.out.println("  both number are double type");
//        }
//        else {
//            System.out.println("  both number are not double type");
//        }
//
//
//
//    }
//}

class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two double values:");

        if (!sc.hasNextDouble()) {
            System.out.println("Error: First input is not a double value.");
            return;
        }


        double num1 = sc.nextDouble();

        if (!sc.hasNextDouble()) {
            System.out.println("Error: Second input is not a double value.");
            return;
        }

        double num2 = sc.nextDouble();

        double average = (num1 + num2) / 2;
        System.out.println("Average of " + num1 + " and " + num2 + " is: " + average);


    }
}