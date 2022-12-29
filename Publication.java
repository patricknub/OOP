 import java.util.*;
 class Publication{
    String title;
    int price,copies;
  void saleCopy(){
     
  }  
 }
 class Book{
    String title,author;
    int price,copies;
  void saleCopy(){
      price=150;
    System.out.println("Order copies"+copies*price);
  } 
  void orderCopies(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Copies you wanted");
    copies=sc.nextInt();
    
    
  }
 }
 class Magazine{
    String title;
    int price,copies;
  void saleCopy(){
      
  }  
  void orderQty(){
      
  }
  void currentissue(){
      
  }
  void receiveissue(){
      
  }
 }
 public class Store{
     public static void main(String []args){
         Book b=new Book();
         b.orderCopies();
         b.saleCopy();
     }
 }
