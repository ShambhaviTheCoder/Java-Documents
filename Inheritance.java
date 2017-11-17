// package whatever; // don't place package name!


 
 // package whatever; // don't place package name!

 import java.io.*;
 
 class myCode
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         BankAccount bnk=new BankAccount("shambhu",984638328,30000);
        SavingsBankAccount savngbnk=new SavingsBankAccount("hari",5667657,50000);
        bnk.display();
         savngbnk.display();
     
     }
 }
 class BankAccount{
     String name;
     long contactnumber;
     long salary;
    BankAccount(String name, long contactnumber, long salary){
         this.name=name;
         this.contactnumber=contactnumber;
         this.salary=salary;
         
     }
     void display(){
         System.out.println("name="+name+" "+"contact number="+contactnumber+" "+"salary="+salary);
     }
 }
 class SavingsBankAccount extends BankAccount{
 
    SavingsBankAccount(String svname, long svcontactnumber, long svsalary){
        
         super(svname,svcontactnumber,svsalary);
        
    }   
        
 }
 