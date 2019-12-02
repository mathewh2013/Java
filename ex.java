import java.util.Scanner;

// Mathew Harrison Ex72029 
// Employee

public abstract class Employee

{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   // constructor for strings

   public Employee( String first, String last, String ssn)

   {
       firstName = first;
       lastName = last;
       socialSecurityNumber = ssn;
   } 

   // set and return first name

   public void setFirstName( String first )

   {
       firstName = first;
   } 

   public String getFirstName()

   {
       return firstName;
   }
	
   // set and return last name

   public void setLastName( String last )

   {
       lastName = last;
   } 

   public String getLastName()

   {
       return lastName;
   } 

   // set and return SSN

   public void setSocialSecurityNumber( String ssn )

   {
       socialSecurityNumber = ssn; // should validate
   }

   public String getSocialSecurityNumber()

   {
       return socialSecurityNumber;
   } 

   // return string

   public String toString()
   {
       return String.format( "%s %s\nsocial security number: %s",
               getFirstName(), getLastName(), getSocialSecurityNumber());
   } 

   // earnings method
   public abstract double earnings(); 
} 


//////////////////////////////////////////////////////////////////////////

//HourlyEmployee 

public class HourlyEmployee extends Employee
{
   private double wage; 
   private double hours; 

   // Construct for arg 

   public HourlyEmployee( String first, String last, String ssn,
           double hourlyWage, double hoursWorked )
   {
       super( first, last, ssn);
       setWage( hourlyWage ); 
       setHours( hoursWorked ); 
   } 

   // Set and return wage

   public void setWage( double hourlyWage )

   {
       wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
   } 

   public double getWage()

   {
       return wage;
   } 

   // Hours worked

   public void setHours( double hoursWorked )

   {
       hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ?
               hoursWorked : 0.0;
   } 

   public double getHours()

   {
       return hours;
   }

   // Earning calculations

   public double earnings()

   {
       return getWage() * getHours();
   } 

   // HourlyEmployee object

   public String toString()

   {
       return String.format( "hourly employee: %s\n%s: $%,.2f\n%s: %,.2f\n%s: %,.2f",

               super.toString(),

               "hours", getHours(),
               "wage", getWage(),
               "earnings",earnings() );
   } 
} 

//////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class TestHourlyEmployee {

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       // Prompt and collect user input

       System.out.print("Enter first name: ");
       String first = sc.next();

       System.out.print("Enter last name: ");
       String last = sc.next();

       System.out.print("Enter social security number: ");
       String ssn = sc.next();

       System.out.print("Enter hours worked: ");
       double hoursWorked = sc.nextDouble();

       System.out.print("Enter wage: ");
       double hourlyWage = sc.nextDouble();

       // creating an object of HourlyEmployee
       HourlyEmployee emp = new HourlyEmployee(first, last, ssn, hourlyWage, hoursWorked);

       System.out.println(emp);
   }
}