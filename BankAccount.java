//Ashab Naveed
//Computer Science 20
//Henry Wise Wood High School
//2022-2023 Semester 2

import java.text.DecimalFormat;

public class BankAccount{

public static final DecimalFormat df = new DecimalFormat("0.00");

//defining the instance variables, sets the initial balance to $0.00.
  String accountNumber;
  double balance = 0;
  double withdrawalFee;
  double annualInterestRate;
  
//accesors for returning each variable
public String getAccountNumber () {
    return accountNumber; }

public double getBalance () {
    return balance; }

public double getWithdrawalFee () {
    return withdrawalFee;}

public double getAnnualInterestRate () {
  return annualInterestRate; }

//constructor functions, the first one takes in two parameters of an account number and an initial balance, setting the withdrawal fee and annual interest rate to 0.
public BankAccount (String accountNum, double initialBalance) {
  accountNumber = accountNum;
  balance = initialBalance;
  withdrawalFee = 0;
  annualInterestRate = 0;
}

//constructor that takes in 4 parameters and sets them to the instance variables above
public BankAccount (String accountNum, double initialBalance, double fee, double annualInterest) {
  accountNumber = accountNum;
  balance = initialBalance;
  withdrawalFee = fee;
  annualInterestRate = annualInterest;
  }

//constructor that sets only the account number
public BankAccount (String accountNum) {
  accountNumber = accountNum;
}

//mutators that modify variables of annual interest rate and withdrawal fee
public void setAnnualInterestRate (double rate) {
  annualInterestRate = rate;
}

public void setWithdrawalFee (double withdrawFee) {
  withdrawalFee = withdrawFee;
}

//adds an amount to the balance
public void deposit (double amount) {
  balance += amount;
}

//withdraws an about from the balance, while taking into account the withdrawal fee

public void withdraw (double amount) {
  balance -= (amount + withdrawalFee); }

//checks if the balance is below 0, returns a boolen variable as true if the amount withdrawn is too much, and if the balance is greater than 0 it returns false.
public boolean isOverDrawn () {
  if (balance < 0) {
    return true;
  } else {
    return false;
  } }

//to string to display the message with decimal formatting
public String toString (){
  String res; //initialize the variable
  if (balance < 0) { //if the balance is less than 0, multiply the balance by -1 to make it a positive value, adds brackets, and rounds.
    res = "BankAccount " + accountNumber + ": ($" + df.format(-1*balance) + ")";  
    System.out.println(res); }
  else if (balance > 0) { //if the balance is greater than 0, rounds and formats
    res = "BankAccount " + accountNumber + ": $" + df.format(balance);
    System.out.println(res);
  }
  else { //if the balance equals 0, string res is set so that the balance is $0.00.
    res = "BankAccount " + accountNumber + ": $0.00";
    System.out.println(res);
  }
  return res;
}
  
}