void salary(){
    float da,hra,pf,cf,gross;
    da=basic*97/100;
    hra=basic*10/100;
    pf=basic*12/100;
    cf=basic*0.1f/100;
    gross=basic+da+hra-pf-cf;
    System.out.println("Name:"+name);
    System.out.println("Net Salary"+basic);
    System.out.println("Gross Salary"+gross);
    
}
    
    
}
class Programmer extends Employee{
    Programmer(String name,int sal){
        this.name=name;
        basic=sal;
    }
}
class TeamLead extends Employee{
    TeamLead(String name,int sal){
        this.name=name;
        basic=sal;
    }
}
class APM extends Employee{
    APM(String name,int sal){
        this.name=name;
        basic=sal;
    }
}
class ProjectManager extends Employee{
    ProjectManager(String name,int sal){
        this.name=name;
        basic=sal;
    }
}
public class Inheritance{
    public static void main(String[]args){
        Programmer p=new Programmer("Aman",30000);
        p.salary();
    }
}
