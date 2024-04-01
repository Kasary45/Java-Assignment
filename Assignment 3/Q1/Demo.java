//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Employee {
    String firstName;
    String lastName;
    double Sallary;
    double newSallary;

    Employee() {

    }

    Employee(String firstName, String lastName, double sallary) {
//        this.firstName = firstName;
//        this.lastName = lastName;
        if (sallary > 0) {
            this.Sallary = sallary;
            this.firstName = firstName;
            this.lastName = lastName;

        } else {
            System.out.println(" Entered invaild sallary ="+sallary);


        }

    }



    void display()
    {
        if (this.Sallary >0)
        {
            System.out.println(" first name =" + this.firstName + " ," + " last name =" + this.lastName + " ," + " Yearly sallary =" + (12 * this.Sallary));
        }
        else
        {
            System.out.println(" first name =" + this.firstName + " ," + " last name =" + this.lastName + " ," + " Yearly sallary : invalid entry");
        }




    }


    public double getSallary() {
        return Sallary;
    }

    public void setSallary(double sallary)
    {
        this.Sallary = sallary;
    }

    public void setNewSallary(double newSallary) {
        this.newSallary = newSallary;
    }



    void increment()
    {

        double b= this.getSallary();
        if (b>0)
        {


            this.newSallary = +b + b * 0.10;
            // System.out.println(" new sallary ="+this.newSallary);
            System.out.println(" first name =" + this.firstName + " ," + " last name =" + this.lastName + " ," + " new Yearly sallary =" + (12 * this.newSallary));


            // System.out.println(" sallary ="+b);

        }
        else
        {
           System.out.println(" not applicable for increment");



        }







    }

//











//


}


// End of Employee classs







public class Demo
{
    public static void main(String[] args)
    {
        Employee e1=new Employee("yogesh","kasar",75000);
        e1.display();
       e1.increment();
       Employee e2=new Employee(" Amol","Ekale",-55000);
       e2.display();
       e2.increment();



    }
}



