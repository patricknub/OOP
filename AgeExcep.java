import java.util.*;
class AgeException extends Exception 
{
 
    public AgeException(String msg) 
    {
        System.out.println(msg);
    }
}
class Main
{

 public static void main(String[] args)
 {
  int age;
  Scanner sc=new Scanner(System.in);
  try 
  {
     System.out.print("Enter Age :: ");
     age=sc.nextInt();
     if(age<18) 
     {
        throw new AgeException("Age should be Greater than 18.\tPlease Re-enter!!!");
     }
     else
     {
        System.out.println("Welcome to Voting");
     }
   
  } 
  catch (AgeException e) 
  {
        System.out.println(e);
  }
  
}
}
