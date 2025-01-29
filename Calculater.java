

package calculater;
import java.util.Scanner;


public class Calculater {
    Calculater(){
        System.out.println("Welcome to Calculater");
    }
    
    public void Addition(){
        Scanner Input = new Scanner(System.in);
        double y, x;
        
        System.out.println("Enter first Num: ");
         x = Input.nextDouble();
          System.out.println("Enter Second Num: ");
         y = Input.nextDouble();
        
        double z = x + y;
        
        System.out.println(z);
        
        
    }
    
        public void Subtraction(){
        Scanner Input = new Scanner(System.in);
        double y, x;
        
        System.out.println("Enter first Num: ");
         x = Input.nextDouble();
          System.out.println("Enter Second Num: ");
         y = Input.nextDouble();
        
        double z = x - y;
        
        System.out.println(z);
        
        
    }
         public void Multiplication(){
        Scanner Input = new Scanner(System.in);
        double y, x;
        
        System.out.println("Enter first Num: ");
         x = Input.nextDouble();
          System.out.println("Enter Second Num: ");
         y = Input.nextDouble();
        
        double z = x * y;
        
        System.out.println(z);
        
        
    }
          public void Division(){
        Scanner Input = new Scanner(System.in);
        double y, x;
        
        System.out.println("Enter first Num: ");
         x = Input.nextDouble();
          System.out.println("Enter Second Num: ");
         y = Input.nextDouble();
        
        double z = x / y;
        
        System.out.println(z);
        
        
    }
        
     

   
    public static void main(String[] args) {
        
        Calculater Ans = new Calculater();
       
        
         System.out.println("1. Addition: ");
          System.out.println("2. Subtraction: ");
          System.out.println("3. Multiplication: ");
          System.out.println("4. Division: ");
          
          int choice = 0;
            Scanner Input = new Scanner(System.in);
           choice = Input.nextInt();
           
           switch (choice){
               case 1:
                   Ans.Addition();
                   break;
               case 2:
                   Ans.Subtraction();
                    break;
               case 3:
                   Ans.Multiplication();
                    break;
               case 4:
                   Ans.Division();
                    break;
               default:
                   System.out.println("Enter choice from the above options");
                   
    }   
     
    }
    
}
