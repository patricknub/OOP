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
        name=sc.nextLine();
    }
    void displayData(){
        System.out.println("Emp id is:"+id);
        System.out.println("Emp Salary :"+salary);
        System.out.println("Emp name is:"+name);
        
    }
}
class Company{
    public static void main(String args[]){
        Company c[]=new Company[2];
        for(int i=0;i<2;i++){
            Employee v=new Employee();
            v.getData();
        
        }
    for(int i=0;i<2;i++){
        v.displayData();
    }
    }
}
