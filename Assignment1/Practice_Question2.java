import java.util.Scanner;

public class Practice_Question2 {
    public static void main(String[] args) {
        float f = Float.parseFloat(args[0]);
        double d = Double.parseDouble(args[1]);

        int a = (int) f;
        int b = (int) d;


        Scanner sc = new Scanner(System.in);

        System.out.println("float "+f );
        System.out.println("double "+d);
        int choice;

        do {

            System.out.println("Enter your choice : ");
            System.out.println("1. ADD");
            System.out.println("2. SUB");
            System.out.println("3. MUL");
            System.out.println("4. DIV");
            System.out.println("0. EXIT");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Addition : "+(a+b));
                    break;
                case 2:
                    System.out.println("Subtraction : "+(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication : "+(a*b));
                    break;
                case 4:
                    System.out.println("Division : "+(a/b));
                    break;

            }
        }while(choice!=0);
    }
}

