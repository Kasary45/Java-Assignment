import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Assignment1_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter int number");
        int num=sc.nextInt();
        String a =Integer.toBinaryString(num);
        System.out.println(" binary form ="+a);
        String b =Integer.toHexString(num);
        System.out.println(" Hexa form ="+b);
        String c =Integer.toOctalString(num);
        System.out.println(" Octal form ="+c);




    }
}


