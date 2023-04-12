//Robert Jones
//Lin Alice
//Bank Info
// 2/17/20
//Assignment 3


package bankinfo;

 

import java.util.Scanner;

class BankInfo //my varibales
{
    public static void main(String[] args)
{
int numChecks;
double totalFeeForChecks;
double totalFee;
double baseCharge = 20;
double bankFee = 10;


// Prompts the user to enter there number of checks and calcultes
System.out.println("**************** Welcome to Robert's Bank *****************");
System.out.print("Enter the number of checks you have used: ");
numChecks = new Scanner(System.in).nextInt();
if(numChecks < 20)
totalFeeForChecks = numChecks * .10;
else if(numChecks < 40)
totalFeeForChecks = (19 * .10) + (numChecks - 19) * 0.08;
else if(numChecks < 60)
totalFeeForChecks = (19 * .10) + (20 * .08) + (numChecks - 39) * 0.06;
else
totalFeeForChecks = (19 * .10) + (20 * .08) + (20 * .06) + (numChecks - 59) * 0.04;
totalFee = totalFeeForChecks + baseCharge + bankFee;

//Prints the results
System.out.println("We Love your service!");
System.out.println("Please come again");
System.out.println(".10 cents for less than 20 checks");
System.out.println(".08 cents for 20­-39 checks ");
System.out.println(".06 cents for 40 to 59 checks ");
System.out.println(".04 each for 60 or more checks.");
System.out.println("Your charges are as follows:");
System.out.println("Totalfee = "+ totalFee);
System.out.println("Total base charge = "+ baseCharge);
System.out.println("Total bank fee = "+ bankFee);
System.out.println("Total fee for checks = ");
if(numChecks < 20)
System.out.println("Checks charged at 10 cents fee is: "+ numChecks);
else
{
System.out.println("Checks charged at 10 cents fee is: 19.");
if(numChecks < 40)
System.out.println("Checks charged at 8 cents fee is: "+ (numChecks - 19));
else
{
System.out.println("Checks charged at 8 cents fee is: 20.");
if(numChecks < 60)
System.out.println("Checks charged at 6 cents fee is: "+ (numChecks - 39));
else
{
System.out.println("Checks charged at 6 cents fee is: 20.");
System.out.println("Checks charged at 4 cents fee is: "+ (numChecks - 59));
}
}
}
}
}