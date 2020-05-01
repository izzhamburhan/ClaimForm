import java.text.DecimalFormat ;

public class Mileage
{
   private double salary ;
   private int CC ;
   private double distance ;
   private String name;
   private String ID;
   private double Total_amount = 0, Two_way ;
   private int codeSal , codeCc  ; 


   //Normal Constructor 
   public Mileage (String n, String ID, double s, double d, int c)
   {
       name = n;
       this.ID= ID ;
       salary = s;
       distance = d;
       CC = c ;
       
    }
    
    //gettor processor
    public double getSalary ( ){return salary;}
    public int getCC() {return CC;}
    public double getDistance () {return distance;}
    public String getName() {return name;}
    public String getID () {return ID;}
    

    // giving specific code for salary 
    public int CodeNumSal(){
        if(getSalary() >= 2625.45){
            codeSal = 5 ;
        }else if(getSalary() >= 2333.00 && getSalary() < 2625.45 ){
            codeSal = 4 ;
        }else if(getSalary() >= 1820.75 && getSalary() < 2333.00){
            codeSal = 3 ;
        }else if(getSalary() < 1820.75){
            codeSal = 2 ; 
        }
        return codeSal ;
    }

    //giving specific code for cc
    public int CodeNumCc(){
        if(getCC() >= 1400){
            codeCc = 5 ;
        }else if(getCC() >= 1000 && getCC() < 1399){
            codeCc = 4 ;
        }else if(getCC() < 1000 && getCC() > 176 ){
            codeCc = 3;
        }else if(getCC() >= 175 && getCC() < 999){
            codeCc = 2;
        }else if(getCC() < 175 ){
            codeCc = 1 ;
        }

        return codeCc;
    }


    //Sambungan.... (bandingkan CodeNumSal dengan CodeNumCc-pengiraan maybe di sini ) INGAT

    //calculate the mileage 
    //--comparing between code salary and code cc 
    // -- make calculation in this method 
    public double CalcMileage(){

        Two_way = getDistance() * 2;

        if(codeSal <= codeCc ){
            if(codeSal == 5 ){
                if(Two_way <= 500)
                    Total_amount = Two_way * 0.70;
                
                else if ( Two_way >= 501 && Two_way <= 1000)
                  Total_amount = Two_way * 0.65;
                
                else if (Two_way >= 1001 && Two_way <= 1700)
                   Total_amount = Two_way * 0.55 ;
                
                else if(Two_way >= 1701 )
                 Total_amount = Two_way * 0.50;

            }else if(codeSal == 4 ){
                if(Two_way <= 500)
                   Total_amount = Two_way * 0.60;
                
                else if(Two_way >= 501 && Two_way <= 1000)
                  Total_amount = Two_way * 0.55;
                
                else if (Two_way >= 1001 && Two_way <= 1700)
                  Total_amount = Two_way * 0.50 ;
                
                else if(Two_way >= 1701 )
                     Total_amount = Two_way * 0.45 ;
                
            }else if(codeSal == 3){
                if(Two_way <= 500)
                    Total_amount = Two_way * 0.50;
            
                else if(Two_way >= 501 && Two_way <= 1000)
                     Total_amount = Two_way * 0.45;
            
              else if (Two_way >= 1001 && Two_way <= 1700)
                  Total_amount = Two_way * 0.40 ;
            
                else if(Two_way >= 1701 )
                  Total_amount = Two_way * 0.35 ;

            }else if(codeSal == 2){
                if(Two_way <= 500)
                    Total_amount = Two_way * 0.45;
                
                else if(Two_way >= 501 && Two_way <= 1000)
                    Total_amount = Two_way * 0.40;
                
                else if (Two_way >= 1001 && Two_way <= 1700)
                    Total_amount = Two_way * 0.35 ;
                
                else if(Two_way >= 1701  )
                    Total_amount = Two_way * 0.30 ;
            }



        }else if(codeCc <= codeSal ){
            if(codeCc == 5 ){
                if(Two_way <= 500)
                    Total_amount = Two_way * 0.70;
                
                else if (Two_way >= 501 && Two_way <= 1000)
                    Total_amount = Two_way * 0.65;
                
                else if (Two_way >= 1001 && Two_way <= 1700)
                    Total_amount = Two_way * 0.55 ;
                
                else if(Two_way >= 1701 )
                    Total_amount = Two_way * 0.50;

            }else if(codeCc == 4 ){
                if(Two_way <= 500)
                    Total_amount = Two_way * 0.60;
                
                else if(Two_way >= 501 && Two_way <= 1000)
                    Total_amount = Two_way * 0.55;
                
                else if (Two_way >= 1001 && Two_way <= 1700)
                    Total_amount = Two_way * 0.50 ;
                
                else if(Two_way >= 1701 )
                    Total_amount = Two_way * 0.45 ;
                
            }else if(codeCc == 3){
                if(Two_way <= 500)
                    Total_amount = Two_way * 0.50;
            
                else if(Two_way >= 501 && Two_way <= 1000)
                    Total_amount = Two_way * 0.45;
            
              else if (Two_way >= 1001 && Two_way <= 1700)
                    Total_amount = Two_way * 0.40 ;
            
                else if(Two_way >= 1701 )
                    Total_amount = Two_way * 0.35 ;

            }else if(codeCc == 2){
                if(Two_way <= 500)
                    Total_amount = Two_way * 0.45;
                
                else if(Two_way >= 501 && Two_way <= 1000)
                    Total_amount = Two_way * 0.40;
                
                else if (Two_way >= 1001 && Two_way <= 1700)
                     Total_amount = Two_way * 0.35 ;
                
                else if(Two_way >= 1701  )
                    Total_amount = Two_way * 0.30 ;

            }else if(codeCc == 1){
                if(Two_way <= 500)
                    Total_amount = Two_way * 0.40;
                
                else if(Two_way >= 501 && Two_way <= 1000)
                    Total_amount = Two_way * 0.35;
                
                else if (Two_way >= 1001 && Two_way <= 1700)
                    Total_amount = Two_way * 0.30 ;
                
                else if(Two_way >= 1701 )
                    Total_amount = Two_way * 0.25 ;
            }

            
        }

       
        
        return 0;
    }




    //Function to calculate the mileage 
/* public double CalcMileage ()
    {
        Two_way = getDistance() * 2;
        if(getSalary() >= 2625.45 && getCC() >= 1400)
        {
            if(Two_way <= 500)
            Total_amount = Two_way * 0.70;
            
            else if (Two_way >= 501 && getDistance() <= 1000)
            Total_amount = Two_way * 0.65;
            
            else if (Two_way >= 1001 && getDistance() <= 1700)
            Total_amount = Two_way * 0.55 ;
            
            else if(Two_way >= 1701 )
            Total_amount = Two_way * 0.50;
        }
      
        else if(getSalary() >= 2333.00 && getCC() >= 1000)
        {
            if(Two_way <= 500)
            Total_amount = Two_way * 0.60;
            
            else if(Two_way >= 501 && getDistance() <= 1000)
            Total_amount = Two_way * 0.55;
            
            else if (Two_way >= 1001 && getDistance() <= 1700)
            Total_amount = Two_way * 0.50 ;
            
            else if(Two_way >= 1701 )
            Total_amount = Two_way * 0.45 ;
        }
        
        else if(getSalary() >= 1820.75 && getCC() <= 1000)
        {
            if(Two_way <= 500)
            Total_amount = Two_way * 0.50;
            
            else if(Two_way >= 501 && getDistance() <= 1000)
            Total_amount = Two_way * 0.45;
            
            else if (Two_way >= 1001 && getDistance() <= 1700)
            Total_amount = Two_way * 0.40 ;
            
            else if(Two_way >= 1701 )
            Total_amount = Two_way * 0.35 ;
        }
        
        else if(getSalary() < 1820.75 && getCC() >= 175)
        {
            if(Two_way <= 500)
            Total_amount = Two_way * 0.45;
            
            else if(Two_way >= 501 && getDistance() <= 1000)
            Total_amount = Two_way * 0.40;
            
            else if (Two_way >= 1001 && getDistance() <= 1700)
            Total_amount = Two_way * 0.35 ;
            
            else if(Two_way >= 1701  )
            Total_amount = Two_way * 0.30 ;
        }
        
        else if(getSalary() < 1820.75 && getCC() < 175)
        {
            if(Two_way <= 500)
            Total_amount = Two_way * 0.40;
            
            else if(Two_way >= 501 && getDistance() <= 1000)
            Total_amount = Two_way * 0.35;
            
            else if (Two_way >= 1001 && getDistance() <= 1700)
            Total_amount = Two_way * 0.30 ;
            
            else if(Two_way >= 1701 )
            Total_amount = Two_way * 0.25 ;
        }
    
        return 0 ;
    
    }
    
    */
    

    //Function to print out the calculate and the information .
    public String toString()
    {
        //making Total_amount to two decimal point 
        DecimalFormat df = new DecimalFormat("0.00");
        return "\n\nUiTM Mileage Claim Calculator"+ "\n\nName : \t\t\t\t" +getName() + "\nStaff ID : \t\t\t" + getID() + "\nSalary : \t\t\tRM " + getSalary() + "\nDistance (KM) (one way) : \t" + getDistance() +"km" + "\nDistance (KM) (two way) : \t" + Two_way + "km" + "\nCC of vehicle : \t\t" + getCC() + "cc" + "\nTotal_claims : \t\t\tRm " + df.format(Total_amount); 

    }
    
}
