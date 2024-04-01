class Invoice {

     String partNumber;
    String partDescription;
    int quantites;
    double price ;

    double totalAmount;

     Invoice(){

     }
     Invoice(String partNumber,String partDescription,int quantites,double price){
         this.partNumber=partNumber;
         this.partDescription=partDescription;
         if (quantites>0)
         {
         this.quantites=quantites;
         }
         else {
             setQuantites(0);
             this.quantites=getQuantites();
         }

         if (price>0){
             this.price=price;
         }
         else {
             setPrice(0.0);
             this.price=getPrice();
         }


     }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantites() {
        return quantites;
    }

    public void setQuantites(int quantites) {
        this.quantites = quantites;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

void InvoiceAmount(){


        totalAmount= this.price*this.quantites;
    System.out.println("Total amount ="+totalAmount);
}




}




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Invoicetest {
    public static void main(String[] args) {

        Invoice I1= new Invoice("1234","handle",50,120);
        I1.InvoiceAmount();
        Invoice I2= new Invoice("1234","handle",-1,120);
        I2.InvoiceAmount();
        Invoice I3= new Invoice("1234","handle",-1,120);
        I3.InvoiceAmount();


    }

}