//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Food {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int totalBill = 0;

        while (true) {
            System.out.println("--- Indian Food Menu ---");
            System.out.println("1. Butter Chicken - Rs. 250");
            System.out.println("2. Biryani - Rs. 200");
            System.out.println("3. Paneer Tikka - Rs. 180");
            System.out.println("4. Masala Dosa - Rs. 60");
            System.out.println("5. Idli - Rs. 150");
            System.out.println("6. Misal Pav - Rs. 220");
            System.out.println("7. Mutton - Rs. 30");
            System.out.println("8. Aloo Paratha - Rs. 40");
            System.out.println("9. Hyderabadi Dum Biryani - Rs. 300");
            System.out.println("10. Gulab Jamun - Rs. 20");
            System.out.println("11. Generate Bill");

            System.out.println("Enter your choice:");
            int choice = ab.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter quantity for Butter Chicken:");
                    int quantity = ab.nextInt();
                    totalBill += quantity * 250;
                    break;
                case 2:
                    System.out.println("Enter quantity for Biryani:");
                    int quantityBiryani = ab.nextInt();
                    totalBill += quantityBiryani * 200;
                    break;
                case 3:
                    System.out.println("Enter quantity for Paneer Tikka:");
                    int quantityPaneerTikka = ab.nextInt();
                    totalBill += quantityPaneerTikka * 180;
                    break;



                case 4:
                    System.out.println("Enter quantity for dosa:");
                    int quantitydosa = ab.nextInt();
                    totalBill += quantitydosa * 180;
                    break;

                case 5:
                    System.out.println("Enter quantity for Idli");
                    int quantityIdli = ab.nextInt();
                    totalBill += quantityIdli * 180;
                    break;

                case 6:
                    System.out.println("Enter quantity for Misal Pav:");
                    int quantityMisalPav = ab.nextInt();
                    totalBill += quantityMisalPav * 180;
                    break;


                    