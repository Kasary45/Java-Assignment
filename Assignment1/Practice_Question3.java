import java.util.Scanner;
class Table{
    void print_table(){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number to print table :");
        num = sc.nextInt();
        System.out.println("Table of "+ num);
        for(int i=1;i<=10;i++){
            System.out.println(num +"*"+ i + "=" +(num*i) );
        }
    }

}

class Etc extends Table{



}

public class Practice_Question3 {

    public static void main(String[] args) {
        Etc c = new Etc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }

        c.print_table();



    }
}
