import java.util.*;
class Employee{
    int id,salary;
    String name;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id");
        id=sc.nextInt();
         System.out.println("Enter salaty:");
        salary=sc.nextInt();
         System.out.println("Enter Name:");
        name=sc.next();
    }
    void displayData(){
        System.out.println("Emp id is:"+id);
        System.out.println("Emp Salary :"+salary);
        System.out.println("Emp name is:"+name);
        
    }
}
class Main{
    public static void main(String args[]){
        Employee c[]=new Employee[2];
        for(int i=0;i<2;i++){
            c[i] =new Employee();
            c[i].getData();
        
     }   
    for(int i=0;i<2;i++){
        c[i].displayData();
    }
    }
}
