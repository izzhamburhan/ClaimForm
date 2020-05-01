
import java.util.Scanner;
 

public class ClaimForm
{
    
    
    public static void main(String ... args) 
    {
        char repeat;
        
        do{
        Scanner input = new Scanner (System.in);
     

        System.out.println("\nWelcome to UiTM Mileage Calculator ! ");
        System.out.print("Enter Your Name : ");
        String n = input.nextLine();

        System.out.println("\nHi ! " + n );
        
        System.out.print("Please Enter Your Staff ID : ");
        String ID = input.nextLine();
        
        System.out.print("Please Enter Your Salary : ");
        double s = input.nextDouble();
        
        System.out.print("Please Enter Your Distance : ");
        double d = input.nextDouble();
        
        System.out.print("Please Enter Your Vehicle CC power : ");
        int c = input.nextInt();
        
        //Declaration and creating the class
         Mileage a= new Mileage (n, ID, s, d, c);
        
        //calling method
        a.CodeNumSal();
        a.CodeNumCc() ;
         a.CalcMileage() ;
        
        //calling method printing
         System.out.println(a.toString());
        
        //ask the user to repeat or not . 
         System.out.print("\nPress Y to continue: "); // yes
         repeat = input.next().charAt(0);
            
        } while(Character.toUpperCase(repeat) == 'Y');
        
     System.out.println("\nEnd processing ...  Exit system ");
    }
}
