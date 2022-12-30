import java.util.*;
class Student{
    String name;
    int roll,sub1,sub2;
    
void getValue(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Name");
    name=sc.nextLine();
    System.out.println("roll no");
    roll=sc.nextInt();
    System.out.println("Sub 1=");
    sub1=sc.nextInt();
    System.out.println("Sub 2=");
    sub2=sc.nextInt();
    
}
void display(){
int result=sub1+sub2;
float per=(result*100)/200;
System.out.println("Name of Student"+name);
System.out.println("Roll no="+roll);
System.out.println("Sub1 Marks"+sub1);
System.out.println("Sub2 Marks"+sub2);
System.out.println("Overall result="+result);
System.out.println("Percentage="+per);
}
}
class Calc{
    public static void main(String[]args){
        Student s=new Student();
        s.getValue();
        s.display();
    }
}
